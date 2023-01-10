<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서정보</h1>
	<div>ISBN : ${BOOK.isbn}</div>
	<div>도서명 : ${BOOK.title}</div>
	<div>출판사 : ${BOOK.comp}</div>
	<div>저자 : ${BOOK.author}</div>
	<div>가격 : ${BOOK.price}</div>
</body>
</html>