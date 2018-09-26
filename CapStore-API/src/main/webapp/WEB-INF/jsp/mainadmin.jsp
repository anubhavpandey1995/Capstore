<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h3>Welcome Admin</h3>
<h4>Which action you want to perform</h4>
<a href="controller?action=viewMerchants">Show Merchant List</a><br>
<a href="controller?action=viewCustomers">Show Customer List</a><br>
<a href="controller?action=viewMerchantProducts">Product Inventory of Merchants</a><br>
<a href="controller?action=viewDeniedMerchants">Show Merchants To be Approved</a><br>
</body>
</html>