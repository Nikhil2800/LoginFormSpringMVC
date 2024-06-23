<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Login Form</title>  
</head>  
<h3>Student Login Form</h3>  
<body>  
    <form:form action="submitlogin" modelAttribute="student">  
        Username : <form:input type="text" path="username" />         
        <br><br>  
        Password : <form:input type="password"  path="password" />  
        <br><br>  
        <input type="submit" value="Submit" />  
    </form:form>  
</body>  