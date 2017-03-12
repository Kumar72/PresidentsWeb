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
        	<c:when test="${presData[term]}==0">
            <a href="Output.jsp?value=${presData[44]}">&#9756;</a></c:when>
            <c:otherwise>
            <a href="Output.jsp" value="${presData[term-2]}">&#9756;</a></c:otherwise></c:choose>
        </div>
        <div class="col-md-6">
            <div class="card" style="width: 20rem;">
                <ul class="list-group list-group-flush">
                    <img class="portrait" src="./PresPics/${presData[term-1].photo}" alt="president pic"> <!-- Picture -->
                    <li><h1>${presData[term-1].firstName} ${presData[term-1].lastName}</h1></li>
                    <li><h3>${presData[term-1].termYear}</h3></li>
                    <li class="list-group-item">${presData[term-1].party}</li> <!-- party -->
                    <li class="list-group-item">${presData[term-1].fact}</li> <!-- fact -->
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
