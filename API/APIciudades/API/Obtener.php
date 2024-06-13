<?php 
	include 'DB/Conexion.php';

    $consulta = $base_de_datos->query("SELECT id_ciudad AS id_ciudad, ciudad.nombre AS ciudad,ciudad.poblacion AS poblacion_ciudad, ciudad.elevacion, ciudad.alcalde, pais.id_pais, pais.nombre AS pais,pais.poblacion AS poblacion_pais ,pais.presidente FROM ciudad INNER JOIN pais ON ciudad.id_pais = pais.id_pais");
    $datos = $consulta->fetchAll(PDO::FETCH_ASSOC); // Evitar datos repetidos

    // Codifica los datos en UTF-8, para que se puedan convertir a Json sin problema (Ñ y tildes)
    $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");

    echo json_encode($datos);
?>