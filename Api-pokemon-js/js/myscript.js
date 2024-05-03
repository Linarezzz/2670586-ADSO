let contenPrincipal;

window.onload = function(){  // Sobreescribe el contenido de la pagina, solo si la pagina html esta cargada en la pagina del navegador
    contenPrincipal = document.getElementById("contenPrincipal");
}

function consumoAPI(){
    let endpoint = "https://pokeapi.co/api/v2/pokemon";

    // Consumo - AJAX 
    fetch(endpoint).then( res => res.json() ).then( data => { 

        contenPrincipal.innerHTML = "";

        // Codigo para ejecutar en caso de tener el JSON como respuesta de la API
        for (let i=0; i < data.results.length; i++) {
            
            let html_temp = `<div>
                                <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12"> ${ data.results[i].name } </button>
                            </div>`;

            contenPrincipal.innerHTML += html_temp;                
        }

    });


}

function cargarDetalle(endpoint){

    fetch(endpoint).then( respuesta => respuesta.json() ).then( data => { 

        nombrePokemon.innerText = data.name;
        imgPokemon.src = data.sprites.other.dream_world.front_default;
    });
    
}