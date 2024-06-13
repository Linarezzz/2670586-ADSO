<?php
	header("Content-Type: application/json");
	header("Access-Control-Allow-Origin: * ");
    header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

	$servidor = 'localhost';
	$usuario = 'root';
	$contrasena = '';
	$nombre_de_base = 'api_ciudades';

	try{
	   $base_de_datos = new PDO("mysql:host=$servidor;dbname=$nombre_de_base", $usuario, $contrasena);
	}catch(Exception $e){
	   echo 'Ha surgido un error y no se puede conectar a la base de datos. Detalle: ' . $e->getMessage();
	   exit;
	}
?>