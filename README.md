# AREP- ARQUITECTURAS EMPRESARIAL.

## INTRODUCCIÓN MVN-GIT Y HEROKU.

### INTRODUCCIÓN.
El primer laboratorio de AREP, trata sobre una introducción a **MVN, GIT y Heroku**. Donde a través de una 
aplicación que nos permita pasar de **grados Celsius a Fahrenheit y de grados Fahrenheit a Celsius**. Podremos descubrir más acerca de mvn, git y heroku.

El proyecto se realizará con el framework Spark, el cual es usado para crear aplicaciones web en Java 8 o Kotlin con el menor esfuerzo.

Se espera que el laboratorio 1 cuente con pruebas estáticas como dinámicas. Con el fin de validar el completo funcionamiento de nuestra lógica
con respecto a la implementación del método de conversión de temperatura. Además de explicar como podemos hacer uso del API, a través de un browser o desde Heroku.

##### PASOS PARA CLONAR.

-  Nos dirigimos a la parte superior de nuestra ubicación, donde daremos click y escribimos la palabra cmd, luego damos enter, con el fin de desplegar 
el Command Prompt, el cual es necesario.

![img1.png](https://i.postimg.cc/GmSNVZZL/img1.png)

![Imagen2.png](https://i.postimg.cc/vB5N1DDT/Imagen2.png)

![Imagen3.png](https://i.postimg.cc/T3hNVthZ/Imagen3.png)

- Una vez desplegado el Command Prompt, pasamos a verificar que tengamos instalado git, ya que sin él no podremos realizar la descarga.
Para esto ejecutamos el siguiente comando.

`git --version`

![Imagen4.png](https://i.postimg.cc/nh5R0qDM/Imagen4.png)

- Si contamos con git instalado, tendra que salir algo similar. La versiópn puede variar de cuando se este realizando este tutorial. 
Sino cuenta con git, puede ver este tutorial.

[Instalación de Git][id/name] 

[id/name]: https://www.youtube.com/watch?v=cYLapo1FFmA

![Imagen5.png](https://i.postimg.cc/fR6CxZG9/Imagen5.png)

-  Una vez comprobado de que contamos con git. pasamos a escribri el siguiente comando. git clone, 
que significa que clonamos el repositorio, y damos la url del repositorio.

`$ git clone https://github.com/DeividMedina30/Lab1_AREP.git`

![Imagen6.png](https://i.postimg.cc/gjkHY0Zf/Imagen6.png)

- Luego podemos acceder al proyecto escribiendo.

`$ cd Lab1_AREP`

![Imagen7.png](https://i.postimg.cc/ZKnx2CZN/Imagen7.png)

### EJECUTAR PRUEBAS.

- Primero debemos ver que contemos con mvn instalado. A través del siguiente comando.

`$ mvn --version`

![Imagen8.png](https://i.postimg.cc/Nj7SDdcD/Imagen8.png)

- Sino cuenta con Maven, puede ver el siguiente tutorial.

[Instalar Maven][id/name] 

[id/name]: https://www.youtube.com/watch?v=J6yeuluYkYE

- Finalmente ejecutamos el comando. El cual desplegara las pruebas.

`$ mvn test`

![Imagen9.png](https://i.postimg.cc/J0kdkqxb/Imagen9.png)

![Imagen10.png](https://i.postimg.cc/bJKmpnPd/Imagen10.png)

### DESPLEGANDO API EN HEROKU.

[![ProjectDesign](https://www.herokucdn.com/deploy/button.png)](https://areptemperatura.herokuapp.com/)


### TECNOLOGÍAS USADAS PARA EL DESARROLLO DEL LABORATORIO.

* [Spark](http://sparkjava.com) - Framework para desarrollo de aplicaciones web.

* [Maven](https://maven.apache.org/) - Administrador de dependencias.

* [Heroku](https://heroku.com) - Plataforma de despliegue en la nube.

### LIMITACIONES.

El estado actual del laboratorio es que no cuenta con pruebas concurrentes, debido a que no se logro implementar de manera exitosa. 
Por parte del API, podemos decir que las limitaciones son en cuanto al número de peticiones que se puede realizar. Ya que se podría tener un array que reciba varias temperaturas al mismo tiempo y realice la conversión. Además de solo tener dos tipos de conversión, de grados Celsius a Fahrenheit y de grados Fahrenheit a Celsius.
Encontramos que otra limitación puede ser la manera en cómo se desarrolló el proyecto, ya que no se paramos exactamente por un backend y frontend. Con el fin de distinguir correctamente cada parte del API.

### EXTENDER.

Para poder extender el proyecto podemos pensar en sus limitaciones, como lo son el tipo de conversión que se realiza ya que es muy limitado. Por lo cual podemos realizar otra conversión como lo son los grados Kelvin.
En cuanto a la aplicación podemos desarrollar las pruebas concurrentes con la finalidad de poder observar como son ejecutadas pruebas en distintos momentos al servicio de la aplicación. Así mismo separar el proyecto por packages de backend y frontend, con la finalidad de ser más claro con los procesos.


### AUTOR.

> Deivid Sebastián Medina Rativa.

### Licencia.

Este laboratorio esta bajo la licencia de GNU GENERAL PUBLIC LICENSE.
