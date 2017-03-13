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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="styles.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway:500,900|Quicksand">
</head>
<body>

	<div id="output-main" class="container-fluid">
		<div class="row" id="radios">
			<div class="col-md-4" id="filter">
			<form class="form" action="filter.do" method="post">
					<select name="presFilter" class="custom-select">
						<option value="1">1: Republican</option>
						<option value="2">2: Democrat</option>
						<option value="3">3: Democratic-Republican</option>
						<option value="4">4: Independent</option>						
						<option value="5">4: Whig</option>						
					</select> <input class="btn btn-primary" type="submit" name="filter" value="Filter">
				</form>
			</div>
		</div>
		<div class="row" id="row1">
			<a href="display.jsp"><h1>Main Menu</h1></a>
		</div>
		<div class="row" id="row3">
			<div class="col-md-3" id="back-button">
				<a href="start.do?back=back&id=${presData[term-1].termNumber}">&#9756;</a>
			</div>

			<div class="col-md-6">
				<div class="card">
					<ul class="list-group list-group-flush">
						<img class="portrait" src="./PresPics/${presData[term-1].photo}"
							alt="president pic">
						<li><h1>${presData[term-1].firstName}
								${presData[term-1].lastName}</h1></li>
						<li><h3>${presData[term-1].termYear}</h3></li>
						<li id="party" class="list-group-item">${presData[term-1].party}
							Party</li>
						<li class="list-group-item">${presData[term-1].fact}</li>
					</ul>
				</div>
			</div>

			<div class="col-md-3" id="forward-button">
				<a href="start.do?next=next&id=${presData[term-1].termNumber}">&#9758;</a>
			</div>
		</div>
	</div>
</body>
</html>
