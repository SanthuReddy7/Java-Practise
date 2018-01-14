<%--
  Created by IntelliJ IDEA.
  User: Santhu Reddy
  Date: 5/18/2017
  Time: 10:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
    <th>Product Name</th>
    <th>Catagory</th>
    <th>Condition</th>
    <th>Price</th>
    </thead>
    </tr>
    <tr>
        <td>${product.productName}</td>
        <td>${product.productCatagory}</td>
        <td>${product.productCondition}</td>
        <td>${product.productPrice}</td>
    </tr>
</table>
</body>
</html>
