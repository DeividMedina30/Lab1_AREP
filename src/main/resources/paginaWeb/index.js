
function capturarCelsius(){
	var celcius = document.getElementById("Celsius").value;
	const url = 'https://areptemperatura.herokuapp.com/calcularTemperatura/Celsius'
    fetch(`${url}/${celcius}`)
	.then(response => response.json())
	.then(data => {
		let celciusVer = document.getElementById('celsiusNew')
		celciusVer.innerHTML = `<p>Los grados celsius: ${celcius} a Fahrenheit es: ${data}</p>`
		console.log(data)
	})
	.catch(err=>console.log(err))
}