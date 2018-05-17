<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="FinalProjectStyling418.css">

<title>Welcome to CustomSD</title>
</head>
<body class = "body">
<a href="/index">
	<img src = "https://i.imgur.com/P2GI5Aw.png" 
	alt="Welcome" style ="width:300px; height:100px;"/>
</a>

<h3>Hello ${name}, 
please type in search word(s), 
then choose if you want to 'AND' or 'OR' the words, 
then click search.</h3>

<h3>Connection status </h3>
<% 
try {
/* Create string of connection url within specified format with machine name, 
port number and database name. Here machine name id localhost and 
database name is usermaster. */ 
String connectionURL = "jdbc:mysql://localhost:3306/cds"; 

// declare a connection by using Connection interface 
Connection connection = null; 

// Load JBBC driver "com.mysql.jdbc.Driver" 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

/* Create a connection by using getConnection() method that takes parameters of 
string type connection url, user name and password to connect to database. */ 
connection = DriverManager.getConnection(connectionURL, "David", "password");

// check weather connection is established or not by isClosed() method 
if(!connection.isClosed())
%>	
<font size="+1" color="green"></b>
<% 
out.println("Connected successfully to MySQL");
connection.close();
}
catch(Exception ex){
%>
</font>
<font size="+1" color="red"><br/>
<%
out.println("Unable to connect to database.");
}
%>
</font>

<div style="border:solid black"> 
	Please type in keywords and search
  	<form action="/userui" method="post"> 
  		<p> <font color="red"> ${errorMessage}</font></p>
  		<p> <font color="red"> ${errorNotAllFilled}</font></p>
  		<p> <font color="red"> ${errorAddorOR}</font></p>
  		
    	Field1 <input type="text" name="f1"/> 
    	Field2 <input type="text" name="f2"/> 
    	Field3 <input type="text" name="f3"/> <br/>
    	<input type="button" name="add" value="AND" />
    	<input type="button" name="or" value="OR" /> <br/>
    	<input type="submit" value="Search"/>
  	</form>
 </div>
	
</body>
</html>