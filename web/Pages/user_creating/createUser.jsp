<%@page import="dao.UserUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dao.DAOFactory" %>
<%@ page import="dao.UserDAO" %>
<%@ page import="user.User" %>
<%@ page import="utils.CommonUtils" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Creation</title>
    <link rel="stylesheet" type="text/css" href="../../css/styles.css">
    <script type="text/javascript" src="../../js/validation.js"></script>
</head>
<body>
    <div class="container">
        <h2>User Creation</h2>
        <form name="userForm" method="post" action="createUser.jsp" onsubmit="return validateForm()">
            Username: <input type="text" name="username"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" value="Create User">
        </form>
        
        <%
            if (request.getMethod().equalsIgnoreCase("post")) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                
                // Validate input
                if (CommonUtils.isNullOrEmpty(username) || CommonUtils.isNullOrEmpty(password)) {
                    out.println("<p>Please provide both username and password.</p>");
                } else {
                    UserDAO userDAO = DAOFactory.addUserDAO();
                    User user = UserUtil.createUser(username, password);
                    try {
                        userDAO.createUser(user);
                        out.println("<p>User created successfully.</p>");
                    } catch (Exception e) {
                        out.println("<p>An error occurred: " + e.getMessage() + "</p>");
                    }
                }
            }
        %>
    </div>
</body>
</html>

