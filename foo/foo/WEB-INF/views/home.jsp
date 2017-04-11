<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>foo</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Welcome to foo</h1>

    <a href="<c:url value="/foo" />">foo</a> | 
    <a href="<c:url value="/foo/register" />">Register</a>
  </body>
</html>
