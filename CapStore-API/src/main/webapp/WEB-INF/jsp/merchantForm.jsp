<%-- <%@ page errorPage="WEB-INF/showErrorMessage.jsp" %> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <link rel="stylesheet" type="text/css" href="default.css">
</head>

<body>

  <p><a href="/ManageMerchants">[Return to List]</a></p>
  
  
  
  <form:form method="post" action="/addmerchant" commandName="merchant">
  <!-- <input type="hidden" name="action" value="saveMerchant" /> -->
  <input type="hidden" name="merchantId" value="${merchant.merchantId}" />

  <table>
    <!-- input fields -->
    <tr>
      <td>Merchant Name<font color="red"><sup>*</sup></font> </td>
      <td><form:input type="text" path="merchantName"  value="${merchant.merchantName}" /></td>
    </tr>  
    <tr>  
      <td>Email</td>
      <td><form:input type="text" path="merchantEmail" value="${merchant.merchantEmail}" /></td>
    </tr>
    <tr>
      <td>Mobile Number</td>
      <td><form:input type="text" path="merchantMobile" value="${merchant.merchantMobile}" /></td>
    </tr>
    
    <tr>
      <td>Type</td>
      <td><form:select path="merchanttype" value="${merchant.merchanttype}">
      <form:option value="3rd Party">3rd Party</form:option>
      <form:option value="direct">Direct</form:option>
      </form:select>
      </td>
      
    </tr>
    <tr>
      <td>Address</td>
      <td><form:input type="text" path="merchantAddress" value="${merchant.merchantAddress}" /></td>
    </tr>
    <tr>
      <td>Flag</td>
       <td><form:select path="merchantFlag"  value="${merchant.merchantFlag}">
      <form:option value="true">true</form:option>
      <form:option value="false">false</form:option>
      </form:select>
      </td>
    </tr>
    
    <tr>  
      
     <tr><td><form:hidden path="merchantRating" value="${merchant.merchantRating}"/></td>
</tr>

 <tr>  
      
     <tr><td><form:hidden path="merchantPswd" value="${merchant.merchantPswd}"/></td>
</tr> 
    
    <!-- Save
    
    /Reset buttons -->
    <tr>
      <td colspan="2">
        <input type="submit" name="save" value="Save" /> 
        &nbsp;&nbsp;
        <input type="reset" name="reset" value="Reset" />
      </td>
    </tr>                
  </table>
  </form:form>
</body>
</html>