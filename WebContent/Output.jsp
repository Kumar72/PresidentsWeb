<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Presidents WebApp</title>
    <link rel="stylesheet" href="styles.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="styles.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:500,900|Quicksand">
</head>
<body>
	


<div id="output-main" class="container-fluid">
    <div class="row" id="row1">
        <div class="col-md-3" id="back-button">
        <c:choose>
        	<c:when test="{PresData[value]} == 1">
            <a href="Output/{PresData[45]}.jsp">&#9756;</a></c:when>
            <c:otherwise>
            <a href="Output/{PresData[value - 1].jsp}">&#9756;</a></c:otherwise></c:choose>
        </div>
        <div class="col-md-6">
            <div class="card" style="width: 20rem;">
                <ul class="list-group list-group-flush">
                    <img class="portrait" src="./PresPics/${presData[value].photo}" alt="president pic"> <!-- Picture -->
                    <li><h1>${presData[value].firstName} ${presData[value].lastName}</h1></li>
                    <li><h3>${PresData[value].termYear}</h3></li>
                    <li class="list-group-item">${PresData[value].party}</li> <!-- Facts -->
                    <li class="list-group-item">${PresData[value].fact}</li> <!-- Pets -->
                </ul>

            </div>
        </div>
        <div class="col-md-3" id="forward-button">
            <a href="#">&#9758;</a> <%-- logic here needs point to ${Pres.term} -1 --%>
        </div>
    </div>
</div>
</body>
</html>
