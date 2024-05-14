let contenPrincipal

window.onload = function(){
    contenPrincipal = document.getElementById("contenPrincipal");
}

function mostrarDatosEnHTML(data) {
    let resultadoDiv = document.getElementById("contenPrincipal");
    resultadoDiv.innerHTML = ""; 
    
    let datosHTML = "";
    data.forEach(persona => {
        datosHTML += `<p><b>Cédula</b>: ${persona.cedula}, <b>Nombres</b>: ${persona.nombres}, <b>Apellidos</b>: ${persona.apellidos}, <b>Telefono</b>: ${persona.telefono}, <b>Direccion</b>: ${persona.direccion}, <b>Email</b>: ${persona.email}</p>`;
    });

    resultadoDiv.innerHTML = datosHTML;
}

function cargarPersonas(){
    fetch("https://codetesthub.com/API/Obtener.php")
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log( data );
        mostrarDatosEnHTML(data);
    });
}

function insertarPersona(){

    let cedula = document.getElementById("cedula").value;
    let nombres = document.getElementById("nombres").value;
    let apellidos = document.getElementById("apellidos").value;
    let telefono = document.getElementById("telefono").value;
    let direccion = document.getElementById("direccion").value;
    let email = document.getElementById("email").value;

    let datos = new FormData();
    datos.append("cedula", cedula);
    datos.append("nombres", nombres);
    datos.append("apellidos", apellidos);
    datos.append("telefono", telefono);
    datos.append("direccion", direccion);
    datos.append("email", email);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("https://codetesthub.com/API/Insertar.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("cedula").value = "";
        document.getElementById("nombres").value = "";
        document.getElementById("apellidos").value = "";
        document.getElementById("telefono").value = "";
        document.getElementById("direccion").value = "";
        document.getElementById("email").value = "";
        alert('Persona ingresada con exito!');
       
    })
    .catch(error => {
        alert('Error al insertar persona:', error);
        console.error('Error al actualizar persona:', error);
    });
}

function actualizarPersona(){

    let cedula = document.getElementById("cedulaActualizar").value;
    let nombres = document.getElementById("nombresActualizar").value;
    let apellidos = document.getElementById("apellidosActualizar").value;
    let telefono = document.getElementById("telefonoActualizar").value;
    let direccion = document.getElementById("direccionActualizar").value;
    let email = document.getElementById("emailActualizar").value;

    let datos = new FormData();
    datos.append("cedula", cedula);
    datos.append("nombres", nombres);
    datos.append("apellidos", apellidos);
    datos.append("telefono", telefono);
    datos.append("direccion", direccion);
    datos.append("email", email);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("https://codetesthub.com/API/Actualizar.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("cedulaActualizar").value = "";
        document.getElementById("nombresActualizar").value = "";
        document.getElementById("apellidosActualizar").value = "";
        document.getElementById("telefonoActualizar").value = "";
        document.getElementById("direccionActualizar").value = "";
        document.getElementById("emailActualizar").value = "";
        alert('La persona ha sido actualizada');
    })
    .catch(error => {
        console.error('Error al actualizar persona:', error);
        alert('Error al actualizar la persona');
    });
}

function eliminarPersona(){
    let cedula = document.getElementById("cedulaEliminar").value;

    let datos = new FormData();
    datos.append("cedula", cedula);

    let configuracion = {
        method: "POST",
        body: datos
    };

    fetch("https://codetesthub.com/API/Eliminar.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON servidor: ');
        console.log(data);
        document.getElementById("cedulaEliminar").value = "";
        alert('La persona ha sido eliminada');
    })
    .catch(error => {
        alert('La persona no ha podido ser eliminada');
        console.error('Error al eliminar persona:', error);
    });
}


