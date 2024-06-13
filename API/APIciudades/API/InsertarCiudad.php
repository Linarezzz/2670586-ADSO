<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre']) and !empty($_POST['elevacion']) ) {

        $id_pais = $_POST['id_pais'];
        $nombre = $_POST['nombre'];
        $poblacion = $_POST['poblacion'];
        $elevacion = $_POST['elevacion'];
        $alcalde = $_POST['alcalde'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO ciudad (id_pais, nombre, poblacion, elevacion, alcalde) VALUES(:idp, :nom, :pob, :ele, :alc) ");
            $consulta->bindParam(':idp', $id_pais);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':pob', $poblacion);
            $consulta->bindParam(':ele', $elevacion);
            $consulta->bindParam(':alc', $alcalde);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CITY##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CITY##INSERT"
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
