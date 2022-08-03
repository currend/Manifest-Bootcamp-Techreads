<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Books</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"></script>
<style>
    /*table {*/

    /*    margin: 0 auto;*/
    /*    width: 10%;*/
    /*}*/

    /*tr {*/
    /*    background-color: white;*/
    /*}*/

    /*td {*/
    /*    text-align: center;*/
    /*}*/


    /*th {*/
    /*    top:0;*/
    /*    position:sticky;*/
    /*    background-color: #87CEFA;*/
    /*    color: white;*/
    /*    padding: 8px;*/
    /*    border: 1px solid #999;*/
    /*    text-align:center;*/
    /*    font-size: large;*/
    /*}*/


    body {
        background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
        background-size: 400% 400%;
        animation: gradient 15s ease infinite;
        height: 100vh;
    }
    @keyframes gradient {
        0% {
            background-position: 0% 50%;
        }

        50% {
            background-position: 100% 50%;
        }

        100% {
            background-position: 0% 50%;
        }
    }

    .container {
        margin-right: auto;
        margin-left: auto;
        background-color: white;
    }
    </style>
</head>
    <body>

    <div class="container">
        <table class="table table-striped m-10px">
            <thead class="bg-light">
            <tr>
                <th>Book Information</th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty books}">

                <c:forEach var="book" items="${books}">
                    <tr>
                        <td>
                            <div class="d-flex align-items-center">
                                <img class ="cover" src="${book.cover}" alt = "Cover" height = 150 width=100>
                                <div class="ms-3">
                                    <a class="fw-bold mb-1" href="<c:url value="/books/detail/${book.id}/" /> "> <c:out value="${book.title}" /></a>
                                    <p class ="text-muted mb-0"><c:out   value = "${book.author}"/></p>
                                    <p class ="text-muted mb-0"><c:out   value = "${book.rating}"/></p>
                                </div>
                            </div>
                        </td>
                        <td>
                                <a href= "<c:url value= "/books/edit/${book.id}/" />">
                                    <button class="btn btn-light"><i class="fa-solid fa-pen-to-square"></i>Edit Book</button>
                                </a>
                        </td>
                        <td>
                                <a href= "<c:url value= "/books/delete/${book.id}/" />">
                                    <button class="btn btn-danger"><i class="fa-solid fa-circle-trash"></i>Delete Book</button>
                                </a>

                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
        <a href= "<c:url value= "/books/add" />">Add Books</a>
        </c:if>

    </body>
</html>