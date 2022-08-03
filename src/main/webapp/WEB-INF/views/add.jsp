<!DOCTYPE html>
<%@ taglib prefix= "spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta charset="utf-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .content
        {
            background:url('https://dm0qx8t0i9gc9.cloudfront.net/thumbnails/video/rN0W64K4ipau8gxv/videoblocks-simple-graphic-background-in-pastel-shades_bihmovigu_thumbnail-1080_01.png');
            padding:100px;
            background-size:cover
        }

        .radio-toolbar
        {
            background-color:white;
            width:30vw;
            padding:50px 30px;
            position:absolute;
            left:50%;
            transform:translateX(-50%);
            display:flex;
            justify-content:space-evenly;
        }

        .radio-toolbar label
        {
            font-size:1.2em;
        }


        .radio-toolbar {
            margin: 10px;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            flex-grow: 2;
        }




        .radio-toolbar input[type="radio"] {
            visibility: hidden;
            display: none;
        }



        .radio-toolbar label {
            display: inline-block;
            background-color: white;
            padding: 10px 20px;
            font-family: sans-serif, Arial;
            font-size: 16px;
            border: 2px solid rgb(235, 119, 98);
            border-radius: 5px;
            cursor: pointer;
        }

        .radio-toolbar label:hover {
            background-color:rgb(235, 119, 98);
            color:white
        }

        .radio-toolbar input[type="radio"]:focus + label {
            border: 2px dashed rgb(235, 119, 98);
        }

        .radio-toolbar input[type="radio"]:checked + label {
            background-color:rgb(250, 119, 98);
            color:white;
            border:2px dashed white;
        }

        form {
            width: 70%;
            margin:auto;
        }

        h1 {
            text-align: center;
        }
    </style>
</head>

    <body>
    <div class="content">
        <h1>Add Book</h1>
        <form:form method="post" modelAttribute= "bookForm" action="${pageContext.request.contextPath}/books">

            <label>Book Title:</label>
            <form:input path="title" type="text" placeholder="Enter title"/>

            <label>Author:</label>
            <form:input path="author" type="text"/>


            <label>Rating:</label>

                <div class="radio-toolbar">

                    <input type="radio" id="rating_1" name="val" value="1" checked/>
                    <label for="rating_1">1</label>


                    <input type="radio" id="rating_2" name="val" value="2"/>
                    <label for="rating_2">2</label>

                    <input type="radio" id="rating_3" name="val" value="3"/>
                    <label for="rating_3">3</label>

                    <input type="radio" id="rating_4" name="val" value="4"/>
                    <label for="rating_4">4</label>

                    <input type="radio" id="rating_5" name="val" value="5"/>
                    <label for="rating_5">5</label>

                </div>
                <button type ="submit">Add Book</button>
            </div>

            <br/>
            <br/>

        </form:form>
    </body>
</html>