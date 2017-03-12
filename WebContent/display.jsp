<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%-- styles --%>
    <link rel="stylesheet" href="styles.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="styles.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway:500,900|Quicksand" rel="stylesheet">
<title>Presidents WebApp</title>
</head>
    <body>
        <div id="main" class="container-fluid">

            <h1>Welcome to the Presidents WebApp!</h1>
            <h2>Please select a president by term or just click on the navigation buttons.</h2>
            <div class="row">
            
                <div class="col-md-3" id="back-button"> <!-- back-button -->
                    <a href="test.jsp">&#9756;</a>
                </div>
            
                <div class="col-md-6">
                    <form class="form" action="start.do" method="post">
                        <select class="custom-select">
                    <option value="1">1: George Washington</option>
                    <option value="2">2: John Adams</option>
                    <option value="3">3: Thomas Jefferson</option>
                    <option value="4">4: James Madison</option>
                    <option value="5">5: James Monroe</option>
                    <option value="6">6: John Quincy Adams</option>
                    <option value="7">7: Andrew Jackson</option>
                    <option value="8">8: Martin Van Buren</option>
                    <option value="9">9: William H. Harrison</option>
                    <option value="10">10: John Tyler</option>
                    <option value="11">11: James K. Polk</option>
                    <option value="12">12: Zachary Taylor</option>
                    <option value="13">13: Millard Fillmore</option>
                    <option value="14">14: Franklin Pierce</option>
                    <option value="15">15: James Buchanan</option>
                    <option value="16">16: Abraham Lincoln</option>
                    <option value="17">17: Andrew Johnson</option>
                    <option value="18">18: Ulysses S. Grant</option>
                    <option value="19">19: Rutherford B. Hayes</option>
                    <option value="20">20: James A. Garfield</option>
                    <option value="21">21: Chester A. Arthur</option>
                    <option value="22">22: Grover Cleveland</option>
                    <option value="23">23: Benjamin Harrison</option>
                    <option value="24">24: Grover Cleveland</option>
                    <option value="25">25: William McKinley</option>
                    <option value="26">26: Theodore Roosevelt</option>
                    <option value="27">27: William Howard Taft</option>
                    <option value="28">28: Woodrow Wilson</option>
                    <option value="29">29: Warren G. Harding</option>
                    <option value="30">30: Calvin Coolidge</option>
                    <option value="31">31: Herbert Hoover</option>
                    <option value="32">32: Franklin D. Roosevelt</option>
                    <option value="33">33: Harry S Truman</option>
                    <option value="34">34: Dwight D. Eisenhower</option>
                    <option value="35">35: John F. Kennedy</option>
                    <option value="36">36: Lyndon B. Johnson</option>
                    <option value="37">37: Richard M. Nixon</option>
                    <option value="38">38: Gerald R. Ford</option>
                    <option value="39">39: James Earl Carter</option>
                    <option value="40">40: Ronald Reagan</option>
                    <option value="41">41: George H.W. Bush</option>
                    <option value="42">42: William J. Clinton</option>
                    <option value="43">43: George W. Bush</option>
                    <option value="44">44: Barack H. Obama</option>
                    <option value="45">45: Donald J. Trump</option>
                </select>
                <input class="btn btn-primary" type="submit" name="go" value="Go!">
                    </form>
                </div>
                <div class="col-md-3" id="forward-button">
                    <a href="#">&#9758;</a>
                </div>
            </div>
        </div>
</body>
</html>
