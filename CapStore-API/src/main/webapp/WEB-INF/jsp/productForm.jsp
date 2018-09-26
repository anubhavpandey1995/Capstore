 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <link rel="stylesheet" type="text/css" href="default.css">
</head>

<body>

<!--   <p><a href="controller?action=viewProducts">[Return to List]</a></p> -->
  
  
  
 
  <form:form action="/addProduct" method="post" commandName="product">
  <input type="hidden" name="productId" value="${product.productId}" />

  <table>
    <!-- input fields -->
    <tr>
      <td>Product Name<font color="red"><sup>*</sup></font> </td>
      <td><form:input type="text" path="productName"  value="${product.productName}" /></td>
    </tr>  
    <tr>  
      <td>Price</td>
      <td><form:input type="text" path="productPrice" value="${product.productPrice}" /></td>
    </tr>
    <tr>
      <td>Category</td>
      <td><form:select path="productCategory" value="${product.productCategory}" >
      
      <form:option value="BOOKS">BOOKS</form:option>
      <form:option value="ElECTRONICS">ELECTRONICS</form:option>
      <form:option value="FASHION">FASHION</form:option>
      <form:option value="HOME_and_FURNiSHINING">HOME_and_FURNiSHINING</form:option>
      <form:option value="Personal_Car">Personal_Car</form:option>
      <form:option value="Sports">Sports</form:option>
      <form:option value="Others">Others</form:option>
      </form:select>
      </td>
    </tr>
    
    <tr>
      <td>Quantity</td>
      <td><form:input type="text" path="productQuantity" value="${product.productQuantity}" />
      </td>
      
    </tr>
    <tr>
      <td>Total Sold</td>
      <td><form:input type="text" path="totalSold" value="${product.totalSold}" /></td>
    </tr>
    
    
    <tr>  
      
     <tr><td><form:hidden path="productRating" value="${product.productRating}"/></td>
</tr>

 <tr>  
      
    <%--  <tr><td><form:hidden path="merchants" value="${product.merchants}"/></td> --%>
</tr> 
    
    <!-- Save
    
    /Reset buttons -->
    <tr>
      <td colspan="2">
        <button type="submit" class="cancelbtn"> Save </button>
        &nbsp;&nbsp;
        <input type="reset" name="reset" value="Reset" />
      </td>
    </tr>                
  </table>
  </form:form>
</body>
</html>