<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!doctype html>
<html>
<head>

<title>Rit Detail View</title>
</head>
<body>
	<h1>Rit: ${rit.naam}</h1>
	<p>${rit.naam}, goed gedaan, je score is ${rit.start}</p>
	<p>
	
		<c:if test="${rit.start>100}">Dit is geen goede score</c:if>
		
	</p>
	
</body>
</html>