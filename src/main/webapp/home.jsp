<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Zrinka
  Date: 31.3.2017.
  Time: 7:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<head>
    <title>Demo page</title>
</head>
<body>
<h2>Hello, world!</h2>
<p>And you, ${name}</p>
<p>Current date now is:</p>
<h3>
    <%= new java.util.Date() %>
</h3>
<h4>The page is working very well so far...</h4>

</body>
</html>
