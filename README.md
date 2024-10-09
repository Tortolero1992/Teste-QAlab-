# Proyecto de Test Automatizado

## Descripción
Este proyecto contiene un test automatizado diseñado para una entrevista técnica. El objetivo del test es evaluar las habilidades de programación y resolución de problemas del candidato, específicamente en la automatización de la función de carrito de compras.

## Estructura del Proyecto
- `src/`: Contiene el código fuente del test.
- `tests/`: Contiene los archivos de prueba.
- `docs/`: Documentación del proyecto.

## Requisitos
- Java 21

## Dependencias
```groovy
// Use JUnit Jupiter for testing.
testImplementation libs.junit.jupiter

testRuntimeOnly 'org.junit.platform:junit-platform-launcher'

// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
implementation 'org.seleniumhq.selenium:selenium-java:4.25.0'

// https://mvnrepository.com/artifact/org.testng/testng
testImplementation 'org.testng:testng:7.10.2'

// https://mvnrepository.com/artifact/io.cucumber/cucumber-java
implementation 'io.cucumber:cucumber-java:7.20.0'

// https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
testImplementation 'io.cucumber:cucumber-junit:7.20.0'

// https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
implementation 'io.github.bonigarcia:webdrivermanager:5.9.2'

