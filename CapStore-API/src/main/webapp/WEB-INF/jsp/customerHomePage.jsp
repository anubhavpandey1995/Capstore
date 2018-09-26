<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.topleft{
border-bottom: solid; border-bottom-color: green;
background-color: lightblue;
position:fixed;
height: 10%;
float: left;
width:75%;
text-align: center; 
}
.topright{
border-bottom: solid; border-bottom-color: green;
background-color: lightblue;
position:fixed;
height: 88px;
float: right;
width: 25%;
text-align: center;
margin-left: 75%;
}
.left{
border-left: solid; border-left-color: green;
border-right:solid;border-right-color:navy;
background-color: ivory;
position:fixed;
margin-top:7%;
float: left;
width: 200px;
text-align: left; text-indent:100px;
height: 850px;
}
a{
margin-left: 60px;
}
</style>
<!-- <script type="text/javascript">
function submitform()
{
	document.getElementById("defaultt").submit();
}
window.onload = submitform;</script>
 -->
</head>
<body>
<form:form action="/homePage" method="post" commandName="customer"> 
</form:form> 
<form action="/homePage" id="defaultt" style="display: none;"><input type="submit" ></form>
<script type="text/javascript">

</script>
<div class="topleft">
<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome To CapStore
</div>
<div class="topright">
<br><br>
<a href="">My Account</a>
</div>
<div class="left">
<br><br>
&nbsp;&nbsp;Categories:<br><br>
<a href="">Electronics</a><br>
<a href="">Clothing</a><br>
<a href="">Furniture</a><br>
<a href="">Books&Stationary</a><br>
</div>
${custDetails.customerName }
${custDetails.customerEmail }
${custDetails.customerMobile }
</body>
</html>