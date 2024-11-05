# README - Cálculo del Área de un Triángulo

## Descripción

Este programa permite calcular el área de un triángulo a partir de las longitudes de sus lados. El usuario ingresa las longitudes, y el programa verifica si forman un triángulo válido antes de calcular el área.

## Estructura

- **CalcularArea**: Clase principal que ejecuta el programa.
- **IngresoLados**: Maneja la entrada del usuario y la lógica de verificación y cálculo.

## Manejo de Excepciones

- **Entrada Inválida**: Captura `InputMismatchException` para entradas no numéricas y solicita nuevamente el valor.
- **Longitudes No Válidas**: Asegura que los lados sean positivos.
- **Validación del Triángulo**: Verifica la desigualdad triangular para confirmar si se puede formar un triángulo.
