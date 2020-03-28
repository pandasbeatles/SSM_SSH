<%--
  Created by IntelliJ IDEA.
  User: xiaochen
  Date: 2020/3/26
  Time: 2:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>

<head>
    <title>列表</title>
</head>

<body>
<table style="align-content: center" border="1px">
    <tr>
        <td>
            编号
        </td>
        <td>
            名称
        </td>
    </tr>
    <c:forEach items="${user}" var="p">
        <tr>
            <td>
                    ${user.uid }
            </td>
            <td>
                    ${user.uname }
            </td>
        </tr>

    </c:forEach>
</table>
</body>
</html>