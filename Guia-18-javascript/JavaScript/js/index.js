console.log("Hola desde script");
document.getElementById('estadoForm').addEventListener('submit',
function (event) {
    event.preventDefault();

    const caracter = (document.getElementById('caracter').value);
    const resultado = document.getElementById('resultado');
    if (caracter!="") {
        if (caracter.toUpperCase() == "S" || caracter.toUpperCase() == "N"){
            console.log(" Por consola : Correcto");
            resultado.innerHTML = `<p> CORRECTO </p>`;
        } else {
            console.log(" Por consola : InCorrecto");
            resultado.innerHTML = `<p> INCORRECTO </p>`;
        }
    } else {
        console.log(" Por consola : Sin Caracter");
        resultado.innerHTML = `<p> Por favor, ingrese caracter </p>`;
    }
})