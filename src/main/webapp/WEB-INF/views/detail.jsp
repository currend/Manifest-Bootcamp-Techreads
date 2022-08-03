<!DOCTYPE html>
<%@ taglib prefix= "spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>
    <body>

    <h4>Book of Interest</h4>

    <img src="${details.cover}" alt = "Cover" height = 150 width=100></td>
    <c:out value = "Title: "/>
       <c:out value = "${details.title}"/>
    <br/>
    <c:out value = "Author: "/>
        <c:out value = "${details.author}"/>

   <br/>
    <c:out value = "Rating: "/>
        <c:out value = "${details.rating}"/>


    </body>
    </html>
