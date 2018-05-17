<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin config</title>
</head>
<body>
<h3>Hello Admin ${name}, please configure the UI</h3>

<div style="border:solid black"> 
	Please configure the search fields
  	<form action="/userui" method="post"> 
  		<p> <font color="red"> ${errorMessage}</font></p>
  		
    	Field1 <input type="text" name="f1"/> 
    	Field2 <input type="text" name="f2"/> 
    	Field3 <input type="text" name="f3"/>
    	Field4 <input type="text" name="f1"/> 
    	Field5 <input type="text" name="f2"/> 
    	Field6 <input type="text" name="f3"/>
    	Field7 <input type="text" name="f1"/> 
    	Field8 <input type="text" name="f2"/> 
    	Field9 <input type="text" name="f3"/>
    	Field10 <input type="text" name="f1"/> 
		 <br>
  	</form>
 </div>

</body>
</html>