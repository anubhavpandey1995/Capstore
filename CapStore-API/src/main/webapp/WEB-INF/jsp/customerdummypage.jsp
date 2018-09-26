<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>

<head>  
  <link rel="stylesheet" type="text/css" href="default.css">

  <script language="JavaScript">
      function checkAll(field)
      {
          for (i=0; i < field.length; i++)
          {
              field[i].checked = true;
          }
      }
  </script>
</head>

<body>
  

  <form:form action="/viewAllCustomers" method="get" commandName="customer">
 <!--  <input type="hidden" name="action" value="deleteProduct" /> -->
  <table>
    <tr>
      
      <th>Customer Id</th>
      <th>Customer Name</th>
      <th>Email</th>
      <th>Mobile Number</th>
      <th>Flag</th>
      
    </tr>
    
    <c:forEach items='${customerList}' var='customer'>
      <tr>
      <td>${customer.customerId}</td>
      <td>${customer.customerName}</td>
      <td>${customer.customerEmail}</td>
      <td>${customer.customerMobile}</td>
      <td>${customer.customerFlag}</td>
      <td></td>
    
      </tr>
    </c:forEach>
    
    <tr>
     
    </tr>
    
  </table>
  </form:form>
</body>

</html>