<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
  
  <form name="approveForm" method="post" action="controller">
  <input type="hidden" name="action" value="approveMerchant" />
  <table>
    <tr>
      
      <th>Merchant Id</th>
      <th>Merchant Name</th>
    
      <th>Flag</th>
      
    </tr>
    
    <c:forEach items='${DeniedMerchants}' var='merchant'>
      <tr>
      <td><input type="checkbox" name="merchant_id" value="${merchant.merchant_id}"></td>
      <td><a href="controller?action=editMerchant&merchant_id=${merchant.merchant_id}">Edit</a></td>
      <td>${merchant.merchant_name}</td>
      <td>${merchant.merchant_flag}</td>
      <td></td>
    
      </tr>
    </c:forEach>
    
    <tr>
      <td colspan="2">
        <input type="submit" name="Approve" value="Approve" />
        &nbsp;&nbsp;
        <input type="reset" name="Reset" value="Reset" />
      </td>
    </tr>
    
  </table>
  </form>
</body>

</html>