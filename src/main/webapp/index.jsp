<%@ page import="storage.Data" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<style>
    #anh{
        width: 100px;
        height: 100px;
    }
    h2{
        text-align: center;

    }
    #bang{
        width: 100%;
    }
    table{
        margin: auto;
    }
</style>
<body>
<%
    request.setAttribute("list",Data.user);
%>
<div id="bang">
    <h2>Danh Sách Khách Hàng</h2>
    <table border="1px" >
        <tr><th>Tên</th>
            <th>Tuổi</th>
            <th>Địa Chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.address}</td>
            <td><img id="anh" src="${user.picture}"></td>
        </c:forEach>
    </table>
</div>

</body>
</html>