<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="WEB-INF/showErrorMessage.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <link rel="stylesheet" type="text/css" href="default.css">
</head>

<body>
  
  <form:form method="post" action="controller" commandName="merchant">
 
  
  <table>
    <tr>
    <th>Show Products</th>
     <th>Merchant ID</th>
      <th>Merchant Name</th>
      
  
      
    </tr>
    
    <c:forEach items='${merchantList}' var='merchant'>
      <tr>
 
      <td><a href="controller?action=viewProducts&merchantId=${merchant.merchantId}">Select</a></td>
      <td>${merchant.merchantId}</td>
      <td>${merchant.merchantName}</td>
      
      <td></td>
    
      </tr>
    </c:forEach>
    
    <tr>
      <td colspan="2">
        <input type="submit" name="Show Product" value="Show Product" />
        &nbsp;&nbsp;
        <input type="reset" name="Reset" value="Reset" />
      </td>
    </tr>
    
  </table>
 </form:form>
</body>
</html>