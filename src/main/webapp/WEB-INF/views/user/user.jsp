<%--
  Created by IntelliJ IDEA.
  User: Oleh R. Kaminskyi
  Date: 19.05.2018
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
id: ${userModel.id}<br>
Email: ${userModel.email}<br>
Status: ${userModel.status.status}<br>
Role: ${userModel.role}<br>
Image:<img src="${userModel.profileImageURL}" width="100px" />

<a href="/user/${userModel.id}/image">Upload Profile image</a>
