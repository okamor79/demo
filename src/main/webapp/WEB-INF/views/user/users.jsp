<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglib.jsp"%>
<ul>
<c:forEach items="${users}" var="user">
    <li>${user.id} | ${user.email} | <a href="/user/profile/${user.id}">Profile</a></li>
</c:forEach>
</ul>