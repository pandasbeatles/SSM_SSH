<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>商品</title>
</head>
<body>

<center>
    <table style="align-content: center" border="1px">
        <tr>
            <td>
                产品编号
            </td>
            <td>
                产品名称
            </td>
            <td>
                产品价格
            </td>
        </tr>
        <tr>
            <td>
                ${product.id}
            </td>
            <td>
                ${product.name}
            </td>
            <td>
                ${product.price}
            </td>
        </tr>
    </table>
</center>
</body>
</html>