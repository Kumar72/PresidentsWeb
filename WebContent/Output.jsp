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
<div id="output-main" class="container-fluid">
    <div class="row" id="row1">
        <div class="col-md-3" id="back-button">
            <a href="#">&#9756;</a> <%-- logic here needs point to ${Pres.term} +1 --%> 
            <%-- if ${Pres.term == 1} then href="$Pres.term[45]} --%>>
        </div>
        <div class="col-md-6">
            <div class="card" style="width: 20rem;">
                <ul class="list-group list-group-flush">
                    <img class="portrait" src="${Pres.term[ }" alt="president pic"> <!-- Picture -->
                    <li><h1>${Pres.name}</h1></li>
                    <li><h3>${Pres.years}</h3></li>
                    <li class="list-group-item">${facts}</li> <!-- Facts -->
                    <li class="list-group-item">${pets}</li> <!-- Pets -->
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
