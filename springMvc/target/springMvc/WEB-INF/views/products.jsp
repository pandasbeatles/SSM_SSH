<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>

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
    <c:forEach items="${product}" var="p">
        <tr>
            <td>
                    ${p.id }
            </td>
            <td>
                    ${p.name }
            </td>
            <td>
                    ${p.price }
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>


