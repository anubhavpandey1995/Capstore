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


  <p><a href="/addProductpage">[Add Product]</a></p>
  
  <form:form action="/deleteProduct" method="post" commandName="product">
 <%--  <form:input type="hidden" path="productId" value="${product.productId}" /> --%>
  <table>
    <tr>
      <th><a href="javascript:checkAll(document.deleteForm.productId)">Select All</a></th>
      <th>Action</th>
      <th>Product Name</th>
      <th>Price</th>
      <th>Category</th>
      <th>Quantity</th>
      <th>Rating</th>
      <th>Total Sold</th>
      
    </tr>
    
    <c:forEach items='${productsList}' var='product'>
      <tr>
      <td><input type="checkbox" name="productId" value="${product.productId}"></td>
    <!--   <td><a href="/editProduct">Edit</a></td> -->
   <td><a href="/editProduct?productId=${product.productId}">Edit</a></td> 
      
      <td>${product.productName}</td>
      
      <td>${product.productPrice}</td>
      <td>${product.productCategory}</td>
      <td>${product.productQuantity}</td>
      <td>${product.productRating}</td>
      <td>${product.totalSold}</td>
    
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