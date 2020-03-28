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
<center>
    <table style="align-content: center" border="1px">
        <tr>
            <td>
                编号
            </td>
            <td>
                名称
            </td>
            <td>
                类型
            </td>
            <td>
                大小
            </td>
        </tr>
        <c:forEach items="${person}" var="p">
            <tr>
                <td>
                        ${person.pid }
                </td>
                <td>
                        ${person.pname }
                </td>
                <td>
                        ${person.psex}
                </td>
                <td>
                        ${person.page}
                </td>
            </tr>

        </c:forEach>
    </table>
</center>
</body>
</html>

