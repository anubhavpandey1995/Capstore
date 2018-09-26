 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}
/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}
button:hover {
    opacity:1;
}
/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}
/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}
/* Add padding to container elements */
.container {
    padding: 16px;
    width: 1000px;
    position: absolute;
    margin-left: 1200px;
    transform: translate(-100%, -105%);
    
}
/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}
#ee{
color:maroon;
}
/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>

</head>
<body>
<img alt="" src="../images/welcomeimg.jpg"  style="width:100%;">
<form:form action="/merchantsignUp" style="border:1px solid #ccc" method="post" commandName="merchant">
  <table class="container">
   
    <tr>
    <td><h3>Merchant Sign Up</h3></td>
    <!-- <td><p>Please fill in this form to create an account.</p></td> -->
    </tr>
    <tr><td><hr></td></tr>
	
	<tr><td><label for="name"><b>Merchant Name</b></label>
    <form:input path="merchantName" placeholder="Enter Name" name="name" value="${merchant.merchantName}"/></td>
	<td id="ee"><form:errors path="merchantName" class="error" /></td></tr>
	
    <tr><td><label for="email"><b>Email</b></label>
    <form:input path="merchantEmail" placeholder="Enter Email" name="email" value="${merchant.merchantEmail}"/></td>
	<td id="ee"><form:errors path="merchantEmail" class="error" id="err" /></td></tr>
    
    <tr><td><label for="psw"><b>Password</b></label>
    <form:input type="password" path="merchantPswd" placeholder="Enter Password" name="psw" value="${merchant.merchantPswd}"/></td>
	<td id="ee"><form:errors path="merchantPswd" class="error" id="err"/></td></tr>
   
    <tr><td><label for="merchantMobile"><b>Mobile Number</b></label>
    <form:input path="merchantMobile" placeholder="Enter Mobile Number" name="number" value="${merchant.merchantMobile}" /></td>
    <td id="ee"><form:errors path="merchantMobile" class="error" id="err"/></td></tr>
    
    
     <tr><td><label for="merchantAddress"><b>Merchant Address</b></label>
     <form:input path="merchantAddress" placeholder="Enter Address" name="address" value="${merchant.merchantAddress}" /></td>
     <td id="ee"><form:errors path="merchantAddress" class="error"  id="err"/></td></tr>
    
   <tr>  
      <td>Enter Merchant Type</td>
      <td><form:select path="merchanttype" value="" >
      <form:option value="3rd Party">3rd Party</form:option>
      <form:option value="direct">Direct</form:option>
      </form:select>
      </td>
      <td id="ee"><form:errors path="merchanttype" class="error"  id= "err"></form:errors></td>
   </tr> 
    
    
    <tr><td><p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p></td></tr>
	<tr/>
	<tr/>
	<tr><td>
    <div class="clearfix">
      <button type="submit" formaction="/" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div></td></tr>
  </table>
</form:form>
 
</body>
</html>