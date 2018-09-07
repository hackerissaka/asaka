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

response.getWriter().print("<!DOCTYPE html><html><head>"+"<meta charset='ISO-8859-1'>"+"<title>Page1</title>"+
"</head><body>"+"<form action='Page3.jsp' method='post'>"
+"<input type='hidden' name='fname' value='"+firstname+"'/>"
+"<input type=\"hidden\" name=\"lname\" value='"+lastname+"'/>"
+"<input type=\"hidden\" name=\"mobile\" value='"+mobile+"'/>"
+"Email<input type=\"email\" name=\"email\"/><br/>"
+"Gender<input type=\"text\" name=\"gender\"/><br/>"
+"<input type='submit' value='continue'>"+
"</form></body></html>"); %>
</body>
</html>