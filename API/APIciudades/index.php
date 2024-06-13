<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Una API para la gestión de ciudades, donde se pueden realizar las acciones de obtener, insertar, actualizar y eliminar.">
    <title>API de Gestión de ciudades</title>
    <link rel="icon" type="image/x-icon" href="WEB/img/ciudad.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="WEB/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>API de Gestión de ciudades</h1>
        <ul id="endpoint-list">

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/Obtener.php">API/Obtener.php</a> </span></h4>
        		<h5>Metodo: GET</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li></li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Lista de ciudades:</h5>
					<pre>&nbsp;&nbsp;[<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_ciudad": "1",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_pais": "1",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre": "Pereira",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"poblacion": "482.483",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"elevacion": "1.411 m",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"alcalde": "Mauricio Salazar",<br>&nbsp;&nbsp;&nbsp;&nbsp;},<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_ciudad": "2",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_pais": "1",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre": "Bogota",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"poblacion": "7.181 millones",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"elevacion": "2,625 m",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"alcalde": "Carlos Fernando Galán",<br>&nbsp;&nbsp;&nbsp;&nbsp;}
        		</div>
                <div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Lista de paises:</h5>
					<pre>&nbsp;&nbsp;[<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_pais": "1",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre": "Colombia",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"capital": "Bogota",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"poblacion": "51.87 millones",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"presidente": "Gustavo Petro",<br>&nbsp;&nbsp;&nbsp;&nbsp;}
                
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarCiudad.php">API/InsertarCiudad.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros para ciudad:</h5>
        		<ul class="input-list">
					<li><i><b>String</b></i> nombre</li>
					<li><i><b>String</b></i> poblacion</li>
					<li><i><b>String</b></i> elevacion</li>
					<li><i><b>String</b></i> alcalde</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Persona actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##CITY##INSERT"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##CITY##INSERT"<br>&nbsp;&nbsp;}</pre>
        		</div>
				<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarPais.php">API/InsertarPais.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros para pais:</h5>
        		<ul class="input-list">
					<li><i><b>String</b></i> nombre</li>
					<li><i><b>String</b></i> capital</li>
					<li><i><b>String</b></i> poblacion</li>
					<li><i><b>String</b></i> presidente</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Pais actualizado:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##COUNTRY##INSERT"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##COUNTRY##INSERT"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarCiudad.php">API/ActualizarCiudad.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
                    <li><i><b>Int</b></i> id_pais</li>
					<li><i><b>String</b></i> nombre</li>
					<li><i><b>String</b></i> poblacion</li>
					<li><i><b>String</b></i> elevacion</li>
					<li><i><b>String</b></i> alcalde</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Ciudad actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##CITY##UPDATE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##CITY##UPDATE"<br>&nbsp;&nbsp;}</pre>
        		</div>
				<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarPais.php">API/ActualizarPais.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
					<li><i><b>Int</b></i> id_pais</li>
                    <li><i><b>String</b></i> nombre</li>
					<li><i><b>String</b></i> poblacion</li>
					<li><i><b>String</b></i> elevacion</li>
					<li><i><b>String</b></i> alcalde</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Pais actualizado:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##COUNTRY##UPDATE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##COUNTRY##UPDATE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarCiudad.php">API/EliminarCiudad.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>int</b></i> id_ciudad</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Ciudad eliminada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##CITY##DELETE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en eliminacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##CITY##DELETE"<br>&nbsp;&nbsp;}</pre>
        		</div>
				<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarPais.php">API/EliminarPais.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>int</b></i> id_pais</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Pais eliminado:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##COUNTRY##DELETE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en eliminacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##COUNTRY##DELETE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>
        </ul>
    </div>

    <script src="WEB/js/script.js"></script>
</body>
</html>

