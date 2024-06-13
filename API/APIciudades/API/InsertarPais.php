<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre']) and !empty($_POST['capital']) and !empty($_POST['poblacion']) ) {

        $nombre = $_POST['nombre'];
        $capital = $_POST['capital'];
        $poblacion = $_POST['poblacion'];
        $presidente = $_POST['presidente'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO pais (nombre, capital, poblacion, presidente) VALUES(:nom, :cap, :pob, :pre) ");
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':cap', $capital);
            $consulta->bindParam(':pob', $poblacion);
            $consulta->bindParam(':pre', $presidente);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##COUNTRY##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##COUNTRY##INSERT"
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
