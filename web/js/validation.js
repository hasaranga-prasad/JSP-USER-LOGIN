/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



function validateForm() {
    var username = document.forms["userForm"]["username"].value;
    var email = document.forms["userForm"]["email"].value;
    var password = document.forms["userForm"]["password"].value;

    if (username === "" || email === "" || password === "") {
        alert("Please provide username, email, and password.");
        return false;
    }

    // Validate email format using regular expression
    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (!email.match(emailPattern)) {
        alert("Please enter a valid email address.");
        return false;
    }

    return true; // Form is valid and can be submitted
}

function resetForm() {
    document.forms["userForm"].reset();
}


