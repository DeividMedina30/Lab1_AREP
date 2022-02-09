function capturarCelsius(){
	const url = 'https://areptemperatura.herokuapp.com/calcularTemperatura/Celsius'
    var celcius = document.getElementById("Celsius").value;
    fetch(`${url}/${celcius}`)
	.then(response => response.json())
	.then(data => {
		let celciusVer = document.getElementById('celsiusNew')
		celciusVer.innerHTML = `<p>Los grados celsius en Fahrenheit es: ${data}</p>`
		console.log(data)
	})
	.catch(err=>console.log(err))
}