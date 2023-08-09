/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validateForm() {
    var username = document.forms["userForm"]["username"].value;
    var password = document.forms["userForm"]["password"].value;

    if (username === "" || password === "") {
        alert("Both username and password are required.");
        return false;
    }
}
