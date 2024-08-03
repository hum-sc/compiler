::Este bat compila un archivo .fte usando AnaLex.class, PreProc y SLR1
::el archivo debe estar en la carpeta desde donde se manda a llamar el bat

@echo off

:: Definimos el classpath cómo la dirección dónde se encuentra este archivo
set classpath=%classpath%;.

echo Compilando %1

::Si los documentos %1.fte no existen, se manda un mensaje de error
if not exist %1.fte (
    echo Error: El archivo %1.fte no existe
    exit /b
)

::Si existen los documentos %1.lex, %1.cm2 y %1.cm3, se eliminan
if exist %1.lex del %1.lex
if exist %1.cm2 del %1.cm2
if exist %1.cm3 del %1.cm3
if exist %1.cm3.cm4 del %1.cm3.cm4
if exist %1.java del %1.java

::Se ejecuta AnaLex para generar el archivo %1.lex, si el programa termina con un status diferente de 0, se manda un mensaje de error

java unoAL %1

if %errorlevel% neq 0 (
    echo Error: unoAL no pudo generar el archivo %1.lex
    exit /b
)

echo unoAL termino correctamente

java unoPP %1
if %errorlevel% neq 0 (
    echo Error: unoPP no pudo generar los archivos %1.cm2
    exit /b
)

echo unoPP termino correctamente

java unoLR %1
if %errorlevel% neq 0 (
    echo Error: unoLR no pudo generar el archivo %1.cm3
    exit /b
)

echo El Analisis SLR y la generacion de codigo termino correctamente

if exist %1.java del %1.java

java unoLG %1
if %errorlevel% neq 0 (
    echo Error: unoLG no pudo generar el archivo %1
    exit /b
)

echo El unoLG termino correctamente

javac -cp ./ %1.java
if %errorlevel% neq 0 (
    echo Error: No se pudo compilar el archivo %1.java
    exit /b
)
del %1.lex
del %1.cm2
del %1.cm3
del %1.cm3.cm4
del %1.java

echo Compilacion terminada, puede ejecutar java  %1