# PRUEBA TECNICA ANALISTA DE PRUEBAS CROSSFUNCIONAL TCS-TUYA🚀
Automatización Prueba Tecnica, dirigida a certificar la pagina: http://www.advantageonlineshopping.com

Tiene como finalidad responder a la necesidad del Product-Owner 


Pre-requisitos 
--
* Tener el [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) Java Development Kit como minimo en la version 1.8 

Instalación 
---
* Clonar el proyecto (https://github.com/jcamilog619/retoTCS.git) ejecutando el siguiente comando
```git
git clone https://github.com/jcamilog619/retoTCS.git
```
* Puede realizar tareas por defecto de Gradle como compilar o ejecutar a través de los siguientes comandos (*es necesario ubicarse en la raíz del proyecto para ejecutarlos*) :

*Para compilar el proyecto:*
``` gradle
gradlew build -x test     
```
*Puede ejecutar un runner en específico ejecutando el comando:
``` gradle
gradlew test --tests *xxxx* 
```
Donde *xxxx* puede ser una palabra clave que contenga el nombre del runner 


```

Se crea el proyecto sobre Gradle, es una herramienta de automatización de 
la construcción de nuestro código, es la versión mejorada de Maven, 
pero intenta llevarlo todo un paso más allá. Para empezar, se apoya 
en Groovy y en un DSL (Domain Specific Language) para trabajar 
con un lenguaje sencillo y claro a la hora de construir el build comparado con Maven. 
Por otro lado, dispone de una gran flexibilidad que permite trabajar 
con ella utilizando otros lenguajes y no solo Java. Dispone por otro 
lado de un sistema de gestión de dependencias sólido.

*Por medio del build.gradle utilizamos diferentes dependencias para nuestra automatización:

repositories {
    mavenCentral()
}
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:1.9.9")
    }
}
apply plugin: 'java'
apply plugin: 'eclipse'
apply plugin: 'idea'
apply plugin: 'net.serenity-bdd.aggregator'
compileJava.options.encoding = "UTF-8"
compileTestJava.options.encoding = "UTF-8"
dependencies {
    testCompile 'net.serenity-bdd:serenity-core:1.1.1'
    testCompile 'net.serenity-bdd:serenity-junit:1.1.1'
    testCompile('junit:junit:4.12')
    testCompile('org.assertj:assertj-core:1.7.0')
    testCompile('org.slf4j:slf4j-simple:1.7.7')

    compile 'net.serenity-bdd:serenity-core:1.9.9'
    compile 'net.serenity-bdd:serenity-junit:1.9.9'
    compile 'net.serenity-bdd:serenity-cucumber:1.9.5'
    compile 'net.serenity-bdd:serenity-screenplay:1.9.9'
    compile 'net.serenity-bdd:serenity-screenplay-webdriver:1.9.9'
}
gradle.startParameter.continueOnFailure = true  
  
```

#Prácticas de automatización
Un proyecto donde se ejemplifica el uso del patrón serenity
[screenplay](http://thucydides.info/docs/serenity-staging/#_serenity_and_the_screenplay_pattern) con cucumber y gradle.

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface) y basicamente se tiene la siguiente estructura a nivel de proyecto de automatización.

+ model
    Clases que usan el patrón DTO o relacionadas con el modelo de dominio
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion
    Clases que representan las interacciones directas con la interfaz de usuario
+ user_interface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objectos usados para consultar acerca del estado de la aplicación
+ Facade
    Clases que permiten la integración con el Backend en nuestro caso iSeries

Estrategia de automatización
---
Inicialmente se levantaron los flujos de cada transacción, para conocer el negocio y tener claro que se debia automatizar.
Una vez claro el alcance se procede con la automatización de las transacciones, para esto se decide automatizar el front.

El navegador y la versión utilizada
---
El navegador utilizado fue: chrome=Versión 90.0.4430.212 y el chromeDriver soportado para esta versión. Para más información consultar página de compatibilidad (https://chromedriver.chromium.org/).

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.