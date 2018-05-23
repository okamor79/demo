<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="/user/image/upload" method="post" enctype="multipart/form-data">
    <input type="hidden" value="${userID}" name="userID" />

    <input type="file" name="profileImage" /> <br>
    <button type="submit">Upload</button>

</form>