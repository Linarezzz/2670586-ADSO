<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['id_ciudad']) and !empty($_POST['nombre']) and !empty($_POST['poblacion']) ) {

        $id_ciudad = $_POST['id_ciudad'];
        $id_pais = $_POST['id_pais'];
        $nombre = $_POST['nombre'];
        $poblacion = $_POST['poblacion'];
        $elevacion = $_POST['elevacion'];
        $alcalde = $_POST['alcalde'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE ciudad SET id_pais=:idp, nombre=:nom, poblacion=:pob, elevacion=:ele, alcalde=:alc WHERE id_ciudad = :idc");

            $consulta->bindParam(':idc', $id_ciudad);
            $consulta->bindParam(':idp', $id_pais);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':pob', $poblacion);
            $consulta->bindParam(':ele', $elevacion);
            $consulta->bindParam(':alc', $alcalde);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CITY##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CITY##UPDATE"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
