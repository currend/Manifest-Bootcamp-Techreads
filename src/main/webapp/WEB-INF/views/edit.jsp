
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
    <form:form method="post" modelAttribute= "edits" action="${pageContext.request.contextPath}/books/update/${id}">

        Book Title: <form:input path="title" type="text"/>
        <br/>
        <br/>

        Author: <form:input path="author" type="text"/>

        <br/>
        <br/>

        New Rating:
        1 <form:radiobutton path="rating" value="1"/>
        2 <form:radiobutton path="rating" value="2"/>
        3 <form:radiobutton path="rating" value="3"/>
        4 <form:radiobutton path="rating" value="4"/>
        5 <form:radiobutton path="rating" value="5"/>

        <br/>
        <br/>
        <button type ="submit">Update Book</button>
    </form:form>

</body>
</html>
