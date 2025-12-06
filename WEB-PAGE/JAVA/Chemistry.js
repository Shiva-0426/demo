 // Show the summary page and hide the form
function showSummary() {
    // Perform validation (you can extend this)
    const form = document.getElementById('studentForm');
    if (!form.checkValidity()) {
        form.classList.add('was-validated');
        return;
    }

    // Check if at least one course outcome is selected
    const selectedOutcomes = document.querySelectorAll('input[name="CourseOutcomes"]:checked');
    if (selectedOutcomes.length === 0) {
        document.getElementById('outcomeError').style.display = "block";
        return;
    } else {
        document.getElementById('outcomeError').style.display = "none";
    }

    // Get and display student data
    document.getElementById('summaryName').textContent = document.getElementById('Name').value;
    document.getElementById('summaryEmail').textContent = document.getElementById('Email').value;
    document.getElementById('summaryRollNo').textContent = document.getElementById('RollNo').value;
    document.getElementById('summaryClass').textContent = document.getElementById('Class').value;
    document.getElementById('summaryDate').textContent = document.getElementById('dateInput').value;
    document.getElementById('summaryConclusion').textContent = document.getElementById('Conclusion').value;

    // Show selected course outcomes
    const outcomeList = document.getElementById('selectedCourseOutcomes');
    outcomeList.innerHTML = "";
    selectedOutcomes.forEach(item => {
        const li = document.createElement('li');
        li.className = 'list-group-item';
        li.textContent = item.value;
        outcomeList.appendChild(li);
    });

    // Fill sample location summary
    const locationTable = document.getElementById('summaryLocations');
    locationTable.innerHTML = "";
    for (let i = 1; i <= 3; i++) {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>Sample ${i}</td>
            <td>${document.getElementById(`LocationSample${i}`).value}</td>
        `;
        locationTable.appendChild(row);
    }

    // Fill water analysis summary
    const waterTable = document.getElementById('summaryWaterAnalysis');
    waterTable.innerHTML = "";
    for (let i = 1; i <= 3; i++) {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>Sample ${i}</td>
            <td>${document.getElementById(`TemporaryHardness${i}`).value}</td>
            <td>${document.getElementById(`PermanentHardness${i}`).value}</td>
            <td>${document.getElementById(`TotalHardness${i}`).value}</td>
        `;
        waterTable.appendChild(row);
    }

    // Fill alkalinity summary
    const alkTable = document.getElementById('summaryAlkalinity');
    alkTable.innerHTML = "";
    for (let i = 1; i <= 3; i++) {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>Sample ${i}</td>
            <td>${document.getElementById(`Hydroxide${i}`).value}</td>
            <td>${document.getElementById(`Carbonates${i}`).value}</td>
            <td>${document.getElementById(`Bicarbonates${i}`).value}</td>
        `;
        alkTable.appendChild(row);
    }

    // Image preview
    const imageInput = document.getElementById('fileInput');
    const summaryImage = document.getElementById('summaryImage');
    const summaryImageContainer = document.getElementById('summaryImageContainer');
    if (imageInput.files && imageInput.files[0]) {
        const reader = new FileReader();
        reader.onload = function (e) {
            summaryImage.src = e.target.result;
            summaryImageContainer.style.display = "block";
        }
        reader.readAsDataURL(imageInput.files[0]);
    }

    // Show summary and hide form
    document.getElementById('studentForm').style.display = "none";
    document.getElementById('summaryPage').style.display = "block";
    document.getElementById('mainHeading').style.display = "none"; // Hide main heading
}

  // Scroll to top of page
  window.scrollTo({
        top: 0,
        behavior: 'smooth' // Optional: adds smooth scrolling animation
    });


// Print Summary
document.getElementById('printSummary').addEventListener('click', function () {
    window.print();
});

// Back to form button
document.getElementById('backToForm').addEventListener('click', function () {
    document.getElementById('summaryPage').style.display = "none";
    document.getElementById('studentForm').style.display = "block";
    document.getElementById('mainHeading').style.display = "block"; // Show main heading again
});

// Next to Thank You page
document.getElementById('nextToThankYou').addEventListener('click', function () {
    document.getElementById('summaryPage').style.display = "none";
    document.getElementById('thankYouPage').style.display = "block";
    document.getElementById('mainHeading').style.display = "none";
});

// Back to Home (reset form)
document.getElementById('backToHome').addEventListener('click', function () {
    document.getElementById('thankYouPage').style.display = "none";
    document.getElementById('studentForm').reset();
    document.getElementById('studentForm').style.display = "block";
    document.getElementById('mainHeading').style.display = "block"; // Show main heading again
    document.getElementById('imagePreview').style.display = "none"; // Clear image preview
});

// Back to Summary from Thank You page
document.getElementById('backToSummary').addEventListener('click', function() {
    document.getElementById('thankYouPage').style.display = "none";
    document.getElementById('summaryPage').style.display = "block";
    document.getElementById('mainHeading').style.display = "none"; // Keep main heading hidden
    
    // Clean up effects when leaving thank you page
    document.querySelectorAll('.particle, .twinkle-star').forEach(el => el.remove());
});

// Final Submit (submit form)
document.getElementById('finalSubmitBtn').addEventListener('click', function () {
    const form = document.getElementById('studentForm');
    const formData = new FormData(form);
    const submitBtn = document.getElementById('finalSubmitBtn');
    const originalBtnContent = submitBtn.innerHTML;

    // Show loading state
    submitBtn.innerHTML = `
        <span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
        Submitting...
    `;
    submitBtn.classList.add('submit-loading');
    submitBtn.disabled = true;

    fetch("https://script.google.com/macros/s/AKfycbxTnHY4kJ2jOjX0qINanOQHwIXPKxc8mPZPl3FQ79fBv7tGwZKrI4gQVZScTpsXFAThMQ/exec", {
        method: "POST",
        body: formData
    })
    .then(response => response.text())
    .then(data => {
        // Success state
        submitBtn.innerHTML = `
            <svg width="20" height="20" viewBox="0 0 20 20" fill="none">
                <path d="M7.5 10L9.5 12L12.5 8M19 10C19 14.9706 14.9706 19 10 19C5.02944 19 1 14.9706 1 10C1 5.02944 5.02944 1 10 1C14.9706 1 19 5.02944 19 10Z" 
                      stroke="white" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
            </svg>
            Submitted Successfully!
        `;
        submitBtn.classList.remove('submit-loading');
        submitBtn.classList.add('submit-success');
        
        setTimeout(() => {
            location.reload();
        }, 3000);
    })
    .catch(error => {
        console.error("Error:", error);
        submitBtn.innerHTML = `
            <svg width="20" height="20" viewBox="0 0 20 20" fill="none">
                <path d="M12.5 7.5L7.5 12.5M7.5 7.5L12.5 12.5M19 10C19 14.9706 14.9706 19 10 19C5.02944 19 1 14.9706 1 10C1 5.02944 5.02944 1 10 1C14.9706 1 19 5.02944 19 10Z" 
                      stroke="white" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
            </svg>
            Try Again
        `;
        submitBtn.classList.remove('submit-loading');
        submitBtn.classList.add('submit-error');
        submitBtn.style.animation = 'shake 0.5s';
        
        setTimeout(() => {
            submitBtn.style.animation = '';
        }, 500);
        
        setTimeout(() => {
            submitBtn.innerHTML = originalBtnContent;
            submitBtn.classList.remove('submit-error');
            submitBtn.disabled = false;
        }, 3000);
    });
});

// Image Preview with memory cleanup
function previewImage(event) {
    const imagePreview = document.getElementById('imagePreview');
    // Revoke previous object URL if exists
    if (imagePreview.src) {
        URL.revokeObjectURL(imagePreview.src);
    }
    
    if (event.target.files && event.target.files[0]) {
        const file = event.target.files[0];
        // Validate file type
        if (!file.type.match('image.*')) {
            alert('Please select an image file');
            return;
        }
        // Validate file size (max 5MB)
        if (file.size > 5 * 1024 * 1024) {
            alert('File size should be less than 5MB');
            return;
        }
        
        imagePreview.src = URL.createObjectURL(file);
        imagePreview.style.display = "block";
    }
}

// // Set current date as default
// document.addEventListener('DOMContentLoaded', function() {
//     const today = new Date();
//     const formattedDate = today.toISOString().substr(0, 10);
//     document.getElementById('dateInput').value = formattedDate;
// });