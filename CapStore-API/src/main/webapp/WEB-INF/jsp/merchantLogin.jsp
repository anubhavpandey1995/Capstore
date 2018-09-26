<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Login Page</title>
</head>
<style>
.loginform{
position: absolute;
    top: 40%;
    left: 40%;
    transform: translate(-50%, -50%);
    padding: 10px 20px;
}
h2{
position: absolute;
    top: 20%;
    left: 40%;
    transform: translate(-50%, -50%);
}

#ee{
color:maroon;
}
</style>
<body>

<h2>Merchant Login Page</h2>

<img alt="" src="../images/welcomeimg.jpg"  style="width:100%;">
<div class="loginform">
<form:form action="/merchantlogincheck" method="post" commandName="merchant">  

<table>  


<tr>  
    <td >Enter Email Id:</td>  
    <td><form:input path="merchantEmail" value="${merchant.merchantEmail}" /></td>  
   
</tr>  
<tr>  
    <td >Enter password:</td>  
    <td><form:input type= "password" path="merchantPswd" value="${merchant.merchantPswd}" /></td>  
    <td id="ee"><form:errors path="merchantPswd" cssClass="error"/></td>
</tr>  
<tr/>
<tr/>
<tr>  <td/>
    <td colspan="2"><input type="submit" value="login">
</td>

<td><input type="submit" value="Cancel" formaction="/"> </td></tr>
</table>
</form:form>
</div>

</body>

</body>
</html>