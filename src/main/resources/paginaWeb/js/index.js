
/* Funciones JavaScript
   Versión 1.1
   Autor: Deivid Medina
   Curso: Arquitectura Empresarial
*/

//Función que me permite capturar los datos de grado Celsius para convertir a Fahrenheit.



var celcius = document.getElementById("celsius_button");
celcius.addEventListener('click', function(){
    const url = 'https://areptemperatura.herokuapp.com/calcularTemperatura/Celsius'
    var valorCelsius = document.getElementById('Celsius').value;
    fetch(`${url}/${valorCelsius}`)
    .then(response => response.json())
    .then(data => {
        let celciusVer = document.getElementById('celsiusNew')
        celciusVer.innerHTML = `<p>Los grados Celsius: ${valorCelsius} a Fahrenheit es: ${data}</p>`
    	console.log(data)
    })
    .catch(err=>console.log(err))
});

//Función que me permite capturar los datos de grado Fahrenheit para convertir a Celsius.
function capturarFahrenheit(){
	var fahrenheit = document.getElementById("Fahrenheitd").value;
	const url = 'https://areptemperatura.herokuapp.com/calcularTemperatura/Fahrenheit'
    fetch(`${url}/${fahrenheit}`)
	.then(response => response.json())
	.then(data => {
		let fahrenheitVer = document.getElementById('fahrenheitNew')
		fahrenheitVer.innerHTML = `<p>Los grados Fahrenheit: ${fahrenheit} a Celsius es: ${data}</p>`
		console.log(data)
	})
	.catch(err=>console.log(err))
}