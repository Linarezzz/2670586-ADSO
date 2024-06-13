let contenPrincipal

window.onload = function(){
    contenPrincipal = document.getElementById("contenPrincipal");
}

function mostrarDatosEnHTML(data) {
    let resultadoDiv = document.getElementById("contenPrincipal");
    resultadoDiv.innerHTML = ""; 
    
    let datosHTML = "";
    data.forEach(ciudad => {
        datosHTML += `<p><b>id_ciudad</b>: ${ciudad.id_ciudad}, <b>Ciudad</b>: ${ciudad.ciudad}, <b>poblacion ciudad</b>: ${ciudad.poblacion_ciudad}, <b>elevacion</b>: ${ciudad.elevacion}, <b>Alcalde</b>: ${ciudad.alcalde},<b> Id_pais</b>: ${ciudad.id_pais}, <b>Pais</b>: ${ciudad.pais}</p> <b>Poblacion pais</b>: ${ciudad.poblacion_pais}, <b>Presidente</b>: ${ciudad.presidente}</p>`;
    });

    resultadoDiv.innerHTML = datosHTML;
}

function cargarCiudades(){
    fetch("http://localhost/APIciudades/API/Obtener.php")
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log( data );
        mostrarDatosEnHTML(data);
    });
}

function insertarCiudad(){

    let id_pais = document.getElementById("id_pais").value;
    let nombre = document.getElementById("nombre").value;
    let poblacion = document.getElementById("poblacion").value;
    let elevacion = document.getElementById("elevacion").value;
    let alcalde = document.getElementById("alcalde").value;

    let datos = new FormData();
    datos.append("id_pais", id_pais);
    datos.append("nombre", nombre);
    datos.append("poblacion", poblacion);
    datos.append("elevacion", elevacion);
    datos.append("alcalde", alcalde);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("http://localhost/APIciudades/API/InsertarCiudad.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("id_pais").value = "";
        document.getElementById("nombre").value = "";
        document.getElementById("poblacion").value = "";
        document.getElementById("elevacion").value = "";
        document.getElementById("alcalde").value = "";
        alert('Ciudad ingresada con exito!');
       
    })
    .catch(error => {
        
    });
}

function insertarPais(){

    let nombre = document.getElementById("nombre_pais").value;
    let capital = document.getElementById("capital").value;
    let poblacion = document.getElementById("poblacion_pais").value;
    let presidente = document.getElementById("presidente").value;

    let datos = new FormData();
    datos.append("nombre", nombre);
    datos.append("capital", capital);
    datos.append("poblacion", poblacion);
    datos.append("presidente", presidente);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("http://localhost/APIciudades/API/InsertarPais.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("nombre_pais").value = "";
        document.getElementById("capital").value = "";
        document.getElementById("poblacion_pais").value = "";
        document.getElementById("presidente").value = "";
        alert('Pais ingresado con exito!');
       
    })
    .catch(error => {
        
    });
}

function actualizarCiudad(){

    let id_ciudad = document.getElementById("id_ciudad_actualizar").value;
    let id_pais = document.getElementById("id_pais_actualizar").value;
    let nombre = document.getElementById("nombreActualizar").value;
    let poblacion = document.getElementById("poblacionActualizar").value;
    let elevacion = document.getElementById("elevacionActualizar").value;
    let alcalde = document.getElementById("alcaldeActualizar").value;

    let datos = new FormData();
    datos.append("id_ciudad", id_ciudad);
    datos.append("id_pais", id_pais);
    datos.append("nombre", nombre);
    datos.append("poblacion", poblacion);
    datos.append("elevacion", elevacion);
    datos.append("alcalde", alcalde);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("http://localhost/APIciudades/API/ActualizarCiudad.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("id_ciudad_actualizar").value = "";
        document.getElementById("id_pais_actualizar").value = "";
        document.getElementById("nombreActualizar").value = "";
        document.getElementById("poblacionActualizar").value = "";
        document.getElementById("elevacionActualizar").value = "";
        document.getElementById("alcaldeActualizar").value = "";
        alert('La persona ha sido actualizada');
    })
    .catch(error => {
        
    });
}

function actualizarPais(){

    let id_pais = document.getElementById("id_pais_paisActualizar").value;
    let nombre = document.getElementById("nombre_paisActualizar").value;
    let capital = document.getElementById("capitalActualizar").value;
    let poblacion = document.getElementById("poblacion_paisActualizar").value;
    let presidente = document.getElementById("presidenteActualizar").value;

    let datos = new FormData();
    datos.append("id_pais", id_pais);
    datos.append("nombre", nombre);
    datos.append("capital", capital);
    datos.append("poblacion", poblacion);
    datos.append("elevacion", elevacion);
    datos.append("presidente", presidente);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("http://localhost/APIciudades/API/ActualizarPais.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("id_pais_paisActualizar").value = "";
        document.getElementById("nombre_paisActualizar").value = "";
        document.getElementById("capitalActualizar").value = "";
        document.getElementById("poblacion_paisActualizar").value = "";
        document.getElementById("presidenteActualizar").value = "";
        alert('La persona ha sido actualizada');
    })
    .catch(error => {
        
    });
}

function eliminarCiudad(){
    let id_ciudad = document.getElementById("id_ciudadEliminar").value;

    let datos = new FormData();
    datos.append("id_ciudad", id_ciudad);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("http://localhost/APIciudades/API/EliminarCiudad.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("id_ciudadEliminar").value = "";
        alert('La ciudad ha sido eliminada');
    })
    .catch(error => {
        
    });
}

function eliminarPais(){
    let id_pais = document.getElementById("id_paisEliminar").value;

    let datos = new FormData();
    datos.append("id_pais", id_pais);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("http://localhost/APIciudades/API/EliminarPais.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("id_paisEliminar").value = "";
        alert('El pais ha sido eliminado');
    })
    .catch(error => {
        
    });
}


