<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre']) and !empty($_POST['poblacion']) and !empty($_POST['elevacion']) and !empty($_POST['alcalde'])) {

        $nombre = $_POST['nombre'];
        $poblacion = $_POST['poblacion'];
        $elevacion = $_POST['elevacion'];
        $alcalde = $_POST['alcalde'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO ciudad (nombre, poblacion, elevacion, alcalde) VALUES(:nom, :pob, :ele, :alc) ");
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
