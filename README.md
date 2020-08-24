# Developer-Challenge
Restful API with CR actions

###CREACION DB

Para crear imagen de Docker con la DB, ejecute los siguiente comandos en el CMD.
El archivo "docker-compose.yml" se encuentra en la carpeta Release del repositorio

    `cd #PATH_TO_DOCKER-COMPOSE.YML`

    `docker-compose up -d`

###EJECUCION BACK-END

Para ejecutar el BackEnd, ejecute los siguientes comandos en el CMD.
El archivo "location-api-1.jar" se encuentra en la carpeta Release del repositorio

    `cd #PATH_TO_LOCATION-API-1.JAR`

    `java -jar location-api-1.jar`

###EJECUCION FRONT-END

Para ejecutar el FrontEnd, ejecute los siguientes comandos en el CMD.
Los archivos para ejecutar el Front se encuentra en la carpeta Source del repositorio

    `cd #PATH_TO_LOCATIONANGULAR`

    `npm install`

    `ng serve -o`
	
> Juan Sebastian Munar Aldana
> Bogota 2020
