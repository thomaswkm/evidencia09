***Análisis:***

***Clases:*** 

***Juego***

- Atributos:
    - Dado d1, d2

- Métodos:
    - void iniciarJuego()
    - void entregarResultadoPartida(int resultado)

***Dado:***

- Atributos:
    - int caraSuperior
- Métodos:
    - int lanzarDado()
 
***Calculadora:***
    - int calcularSuma(int result1, int result2)

***Relaciones:***

Juego tiene una relacion de asociación con Dado, ya que existe un atributo llamado dado, el cual es un objeto de la clase Dado.


Juego tiene una relación de dependencia con Calculadora, ya que inicializa un objeto Calculadora dentro de un método de su clase y también utiliza un método de éste último.


