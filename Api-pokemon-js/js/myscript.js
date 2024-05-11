let contenPrincipal;
let nombrePokemon;
let imgPokemon;
let anteriorEndPoint;
let siguienteEndPoint;
let paginaActual = 1;

window.onload = function(){  
    contenPrincipal = document.getElementById("contenPrincipal");
    nombrePokemon = document.getElementById("nombrePokemon");
    imgPokemon = document.getElementById("imgPokemon");
}

function consumoAPI(){
    let endpoint = "https://pokeapi.co/api/v2/pokemon";

    // Consumo - AJAX 
    fetch(endpoint).then(res => res.json()).then(data => { 
        contenPrincipal.innerHTML = "";

        anteriorEndPoint = data.previous;
        siguienteEndPoint = data.next;

        for (let i = 0; i < data.results.length; i++) {
            let html_temp = `<div>
                                <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12"> ${ data.results[i].name } </button>
                            </div>`;
            contenPrincipal.innerHTML += html_temp;                
        }
    });
}

function cargarDetalle(endpoint){

    fetch(endpoint).then(respuesta => respuesta.json()).then(data => { 

        nombrePokemon.innerText = data.name;
        imgPokemon.src = data.sprites.other.dream_world.front_default;
        cargador.style.display = "none";
    });
    
}

function cambiar_pagina(numero){
    if (numero == -1 && anteriorEndPoint) {
        paginaActual--;
        consumirPagina(anteriorEndPoint);
    } else if (numero == 1 && siguienteEndPoint){
        paginaActual++;
        consumirPagina(siguienteEndPoint);
    }
}

function consumirPagina(endpoint){
    fetch(endpoint).then(res => res.json()).then(data => { 
        contenPrincipal.innerHTML = "";

        anteriorEndPoint = data.previous;
        siguienteEndPoint = data.next;

        for (let i = 0; i < data.results.length; i++) {
            let html_temp = `<div>
                                <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12"> ${ data.results[i].name } </button>
                            </div>`;
            contenPrincipal.innerHTML += html_temp;                
        }
    });
}





