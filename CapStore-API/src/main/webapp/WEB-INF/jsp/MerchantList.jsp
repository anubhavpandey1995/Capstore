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


  <p><a href="/addMerchantpagefromAdmin">[Add Merchant]</a></p>
  

  <form:form action="/deleteMerchant" method="post" commandName="merchant">
 <!--  <input type="hidden" name="action" value="deleteProduct" /> -->
  <table>
    <tr>
      <th><a href="javascript:checkAll(document.deleteForm.merchantId)">Select All</a></th>
      <th>Action</th>
      <th>Merchant Name</th>
      <th>Email</th>
      <th>Mobile Number</th>
      <th>Type</th>
      <th>Address</th>
      <th>Rating</th>
      <th>Flag</th>
      
    </tr>
    
    <c:forEach items='${merchantList}' var='merchant'>
      <tr>
      <td><input type="checkbox" name="merchantId" value="${merchant.merchantId}"></td>
      <td><a href="/editMerchant?merchantId=${merchant.merchantId}">Edit</a></td>
      <td>${merchant.merchantName}</td>
      <td>${merchant.merchantEmail}</td>
      <td>${merchant.merchantMobile}</td>
      <td>${merchant.merchanttype}</td>
      <td>${merchant.merchantAddress}</td>
      <td>${merchant.merchantRating}</td>
      <td>${merchant.merchantFlag}</td>
      <td></td>
    
      </tr>
    </c:forEach>
    
    <tr>
      <td colspan="2">
        <button type="submit"  class="cancelbtn"> Delete Checked </button>
        &nbsp;&nbsp;
        <input type="reset" name="Reset" value="Reset" />
      </td>
    </tr>
    
  </table>
  </form:form>
</body>

</html>