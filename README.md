# NNTretoTecnico
Reto tecnico de NNT

## Tecnologías utilizadas

- java 21
- maven
- spring-boot
- thymeleaf

## Endpoints principales

### Personas
- `GET /persona`  
    Obtienes 10 personas random generadas por la pagina https://randomuser.me/api/?results=10
![alt text](image.png)

### vistas
- `GET /view/personas`  
    Listar todos las personas del anterior endpoint y las muestra en una tabla.

![alt text](image-1.png)


### Notas
    Se pueden hacer mejoras a la aplicacion usando bd o tal vez consumiendo los servicios de randomuser con RestTemplate.