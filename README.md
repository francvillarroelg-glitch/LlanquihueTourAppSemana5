Francisca Villarroel
004A
DuocUC Modalidad online
📌 Descripción del proyecto

Llanquihue Tour App es una aplicación desarrollada en Java con Maven que simula la gestión de un sistema turístico. El proyecto está basado en programación orientada a objetos (POO) y organiza entidades como personas, guías turísticos, operadores y proveedores.

Además, implementa una estructura tipo proyecto profesional con separación por capas (model, ui, data, resources).

🧩 Tecnologías utilizadas
Java ☕
Maven 📦
Programación Orientada a Objetos (POO)
IntelliJ IDEA
📂 Estructura del proyecto
src/
├── data/
│   └── GestorDatos.java
│
├── main/
│   └── java/
│       └── org.example/
│           └── Main.java
│
├── resources/
│
├── model/
│   ├── direccion.java
│   ├── GuiTuristico.java
│   ├── OperadorTuristico.java
│   ├── persona.java
│   ├── Proveedor.java
│   └── Tour.java
│
├── test/
│   └── java/
│
├── ui/
│   └── Main.java
│
├── pom.xml
└── .gitignore
🧠 Descripción de las capas
🔹 model (Lógica del negocio)

Contiene las clases principales del sistema:

persona → clase base con datos generales
GuiTuristico → representa guías turísticos
OperadorTuristico → administra operaciones turísticas
Proveedor → entidades que entregan servicios
Tour → representa los tours disponibles
direccion → estructura de ubicación
🔹 data (Gestión de datos)
GestorDatos.java → responsable de cargar, almacenar y gestionar información del sistema
🔹 ui (Interfaz / ejecución secundaria)
Main.java → punto de entrada alternativo o de pruebas del sistema
🔹 main/java (entrada principal Maven)
org.example.Main → clase principal oficial de ejecución del proyecto
🔹 resources (archivos de datos)

Carpeta destinada a archivos externos del sistema (puede incluir):

personas
guías
tours
operadores
proveedores
🧠 Funcionalidades del sistema
Registro y gestión de personas
Administración de guías turísticos
Manejo de operadores y proveedores
Gestión de tours turísticos
Carga de datos desde archivos en resources
Separación por capas (modelo, datos, UI)
Estructura Maven profesional
🚀 Cómo ejecutar el proyecto
Opción 1 (principal - Maven)

Ejecutar:

org.example.Main
Opción 2 (alternativa)

Ejecutar:

ui/Main.java
🏗️ Conceptos aplicados
Programación Orientada a Objetos
Encapsulación
Herencia
Modularización por paquetes
Manejo de archivos (resources)
Arquitectura tipo MVC básica
Proyecto Maven

Proyecto académico desarrollado en Java como ejercicio de modelado de sistemas turísticos y aplicación de POO.
