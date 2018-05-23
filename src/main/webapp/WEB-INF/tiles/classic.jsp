<%--
  Created by IntelliJ IDEA.
  User: Oleh R. Kaminskyi
  Date: 12.05.2018
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/resources/css/style.css" />

</head>
<body>

    <tiles:insertAttribute name="header" />

    <div class="container-fluid text-center">
        <div class="row content">
            <div class="col-sm-2 sidenav">

                <tiles:insertAttribute name="sidebar" />

            </div>
            <div class="col-sm-10 text-left">

                 <tiles:insertAttribute name="body" />

            </div>
        </div>
    </div>

    <tiles:insertAttribute name="footer" />

</body>
</html>
