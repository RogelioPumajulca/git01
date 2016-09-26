<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE ">
<html>
 <head> <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Pruebaaa</title>
</head>
<body>
	<form action="Basico" method="post" >
		<table>
				<tr>	
					<td>Operación</td>
					<td>
						<select name="ControHTML1">
							<option value="1">Suma</option>
							<option value="2">Producto</option>
						</select>
					</td>
				</tr>
				<tr>	
					<td>Numero 1:</td>	
					<td>
						<input type="text" name="ControHTML2"/>	
					</td>	
				</tr>
				<tr>	
					<td>Numero 2:</td>	
					<td>
						<input type="text" name="ControHTML3"/>	
					</td>	
				</tr>						
		</table>
		<input type="submit" value="clickme"/>
	</form>
</body>
</html>