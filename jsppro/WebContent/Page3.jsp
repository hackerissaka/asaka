<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String firstname=request.getParameter("fname");
String lastname=request.getParameter("lname");
String mobile=request.getParameter("mobile");
String email=request.getParameter("email");
String gender=request.getParameter("gender");

response.getWriter().print("<!DOCTYPE html><html><head>"+"<meta charset='ISO-8859-1'>"+"<title>Page1</title>"+
"</head><body>"+"<form action='Page4.jsp' method='post'>"
+"<input type='hidden' name='fname' value='"+firstname+"'/>"
+"<input type=\"hidden\" name=\"lname\" value='"+lastname+"'/>"
+"<input type=\"hidden\" name=\"mobile\" value='"+mobile+"'/>"
+"<input type=\"hidden\" name=\"email\" value='"+email+"'/>"
+"<input type=\"hidden\" name=\"gender\" value='"+gender+"'/>"
+"Country<input type=\"text\" name=\"country\"/><br/>"
+"State<input type=\"text\" name=\"state\"/><br/>"
+"<input type='submit' value='continue'>"+
"</form></body></html>"); %>
</body>
</html>