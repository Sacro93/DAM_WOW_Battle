# Combate Épico de Héroes: Desafío en la Arena - Edición World of Warcraft

## Descripción
Entra en un mundo lleno de magia, fuerza y estrategia, donde los héroes más poderosos de Azeroth se enfrentan en combates épicos. ¿Serás capaz de guiar a tu Druida, Arquemaga, Guerrero Orco o Paladín hacia la victoria en la arena?

Prepara a tus personajes, forja su destino seleccionando cuidadosamente sus atributos y habilidades, y enfréntate a rivales temibles en una batalla por la gloria. Cada combate te hará más fuerte, pero también probará los límites de tu héroe. Gana combates, mejora tus estadísticas y demuestra quién es el más poderoso en este Desafío en la Arena.

Crea, lucha y triunfa en un mundo donde solo los mejores sobreviven. ¿Tienes lo que se necesita para convertirte en el campeón de Azeroth? ¡El destino de la arena está en tus manos!

## Implementación de los Personajes

### 1. Druida
- **Atributos**:
  - Nombre
  - Fuerza: Entre 7 y 9 (valor aleatorio).
  - Agilidad: Entre 5 y 8 (valor aleatorio).
  - Inteligencia: Entre 4 y 7 (valor aleatorio).
  - Puntos de Vida (PV): Entre 70 y 90 (valor aleatorio).
  - Combates ganados: Inicialmente 0.
  - Combates perdidos: Inicialmente 0.
  - Puntos de batalla: Inicialmente 100.

### 2. Arquemaga
- **Atributos**:
  - Nombre
  - Inteligencia: Entre 8 y 10 (valor aleatorio).
  - Resistencia Arcana: Entre 5 y 8 (valor aleatorio).
  - Agilidad: Entre 4 y 7 (valor aleatorio).
  - Puntos de Vida (PV): Entre 60 y 80 (valor aleatorio).
  - Combates ganados: Inicialmente 0.
  - Combates perdidos: Inicialmente 0.
  - Puntos de batalla: Inicialmente 100.

### 3. Guerrero Orco
- **Atributos**:
  - Nombre
  - Fuerza: Entre 6 y 8 (valor aleatorio).
  - Defensa: Entre 4 y 7 (valor aleatorio).
  - Agilidad: Entre 3 y 6 (valor aleatorio).
  - Puntos de Vida (PV): Entre 80 y 100 (valor aleatorio).
  - Combates ganados: Inicialmente 0.
  - Combates perdidos: Inicialmente 0.
  - Puntos de batalla: Inicialmente 100.

## Enunciado

El programa debe crear un archivo serializable donde se registre toda la información de los personajes. Se deben crear 4 personajes iniciales de cada tipo (los nombres deben coincidir con la temática del juego World of Warcraft). Después de la creación de los personajes, el programa guardará esta información en el archivo serializado creado inicialmente. 

## Opciones del Programa

1. **Crear Personaje**: El programa leerá los personajes del archivo y permitirá crear un nuevo personaje, seleccionando el tipo y generando los atributos correspondientes de forma aleatoria. Después de crear el nuevo personaje, actualizará la información del archivo.

2. **Borrar Personaje**: El programa leerá los personajes del archivo y permitirá eliminar un personaje existente. Una vez eliminado, actualizará la información del archivo.

3. **Listar Personajes**: El programa leerá los personajes del archivo y mostrará todos los atributos de los personajes registrados, incluyendo nombre, atributos, combates ganados y perdidos, y puntos de batalla.

4. **SuperPoder**: El programa leerá los personajes del archivo y permitirá añadir 100 puntos a la fuerza y a la inteligencia de un personaje seleccionado. Esta opción tendrá un costo de puntos de batalla (por ejemplo, 50 puntos de batalla), y una vez modificados los atributos, actualizará la información del archivo.

5. **Batalla**: Permite que los personajes se enfrenten en una batalla épica en la arena.
   - El jugador deberá seleccionar dos personajes de la lista para que se enfrenten.
   
   ### Mecánica del combate:
   - Cada personaje tendrá sus atributos base (fuerza, agilidad, inteligencia) y su PV (puntos de vida).
   - Antes de iniciar la batalla, se generará un valor de "suerte" aleatorio para cada personaje (entre 1 y 10) que influirá en el resultado del combate.
   - Durante el combate, se realizará una serie de rondas en las que se evaluarán las características de cada personaje:
     1. La fuerza y agilidad influirán en los ataques físicos.
     2. La inteligencia influirá en los ataques mágicos.
     3. Los puntos de vida (PV) disminuirán con cada ataque recibido.
   - La suerte añadirá un factor de aleatoriedad al combate, determinando cuánto se potencia el ataque o la defensa en cada ronda.
   - Después de un número determinado de rondas o cuando uno de los personajes pierda todos sus puntos de vida, se declarará un ganador.

   ### Resultado del combate:
   - El ganador verá incrementados sus "combates ganados" y recibirá un bono de puntos de batalla (por ejemplo, 50 puntos de batalla adicionales).
   - El perdedor verá incrementados sus "combates perdidos" y no recibirá puntos de batalla adicionales.
   - El resultado del combate se actualizará en el archivo CSV.
   - **Opcional**: Puedes añadir la posibilidad de que el perdedor recupere puntos de vida en futuras batallas o que el ganador tenga una pequeña mejora en sus atributos.

6. **Salir**: Cierra el programa.

### Nota Importante
- Si la práctica se realiza sin utilizar archivos, la calificación será un 0.
- **Advertencia**: Cualquier uso de inteligencia artificial para resolver la práctica resultará en un 0 en la nota. Solo se pueden utilizar las técnicas aprendidas en clase.


# WOW-Batalla-Heroes

# Descripción del codigo parte por parte

En este proyecto, comencé por la creación de la clase `Heroe`, que implementa la interfaz `Serializable`.
La clase `Heroe` incluye una serie de atributos y métodos esenciales para el funcionamiento.

Para asignar valores aleatorios a los atributos, utilicé un método Random() que se aplica a los métodos estáticos como `fuerzaHeroe()`, 
`defensaHeroe()`,
`agilidadHeroe()`,
`inteligenciaHeroe()`, 
`resistenciaHeroe()`, y `puntosVidaHeroe()`. Estos métodos generan valores aleatorios que se asignan a los atributos del héroe al momento de su creación.

Otros métodos importantes en la clase `Heroe` que  inclui:
## `sumarCombatesGanados()`: Incrementa el conteo de combates ganados .
## `sumarCombatesPerdidos()`: Incrementa el conteo de combates perdidos.
## `sumarPuntosDeBatalla()`: Suma puntos de batalla al héroe.

# Creación de Héroes
El método `crearHeroe()` toma como parámetro un objeto de la clase `DatosHeroes` (queimplementa `Serializable`). 
Este método utiliza una estructura `switch` para elegir un nombre adecuado según los tres tipos de héroes existentes: Druida, Arquemaga y Guerrero Orco.

A continuación se muestra un resumen del proceso de creación de héroes:

# Creación de Clases de Héroes
Se crearon varias subclases que extienden la clase `Heroe` y que también implementan la interfaz `Serializable`. 
Las subclases son 'GuerreroOrco','Druida' y 'Arquemaga'  

## Serializacion y deserializacion 
La clase SerializarHeroe se encarga de la serialización y deserialización de objetos de la clase DatosHeroes.

# Teoria : 
'La serialización es el proceso de convertir un objeto en una secuencia de bytes para que pueda ser guardado en un archivo,
mientras que la deserialización es el proceso inverso, permitiendo recuperar el objeto original a partir de los bytes almacenados'

Se recomienda crear una constante que define el nombre del archivo en donde almacenare los datos serializados

  private static final String NOMBRE_ARCHIVO = "listadoHeroesx.ser";#

Dado que tenia inconvenientes para deserealizar. 
Se consulta en Stack oVerflow *1, se recomienda  verificar si el archivo existe y sino se genera/ crea una nueva instancia.

*1 https://es.stackoverflow.com/questions/264638/deserialize-en-java 

# Clase DatosHeroes

La clase DatosHeroes tiene como fin gestionar los datos de los distintos tipos de heroes en el programa.Se implementa Serializable para permitir la 'serializacion',
y asi facilitar la manipulacion y recuperacion de los datosde los heroes.

#Listas que almacenan las instancias de los distintos tipos de heroes : 

      '  static List<Druida> druidas = new ArrayList<>(); 
        static List<Arquemaga> arquemagas = new ArrayList<>(); 
        static List<GuerreroOrco> guerreros = new ArrayList<>();'

El cosntructor 'DatosHeroes()' llama  al metodo 'cargarDatosHeroes()' que, como su nombre lo indica, me permite inicializar las listas con datos precargados

# Metodos: 

    'numeroHeroe(int numero)'  =>  permite acceder a los héroes por su indice propio.
   ' personajeExistente(Heroe comparar)' => Comprueba si un heroe ya existe en las listas.
   ' listarPersonajesNombre()' => Imprime los nombres de los heroes existentes en las listas .
    'listarPersonajes()' => imprime una lista numerada de los personajes asi es mas facil seleccionarlos y no tener error de escritura al escribir por consola el nombre ( inconvenientes previos al ingresarlos por nombre)
    'buscarHeroeNombre(String nombre) ' => metodo sin uso dado que me traia conflicto al escribir por nombre(indicado anteriormente). 
    'eliminarPersonajes(String nombreEliminar)' => decidi no eliminar por numero de indice de la listarPersonajes y mantuve eliminar por nombre de personaje.
    'superPoder(int numeroElegido)' =>  metodo que aplica superpoder a un heroe por indice. *2

  2* Orientacion para funcion superPoder : 
  https://es.stackoverflow.com/questions/250311/como-eliminar-un-nodo-por-posici%c3%b3n-indice-de-una-lista-simple  
  https://barcelonageeks.com/eliminar-elemento-del-indice-especificado-en-java-arraylist/

# Clase Batalla

La clase Batalla se encarga de gestionar las peleas entre dos heroes

'batalla(Heroe heroe1, Heroe heroe2)' 
 => La clase Random permite el factor 'suerte' que se solicitaba ç
      '
        Random suerteRandom = new Random();
        int suerteDelHeroe1 = suerteRandom.nextInt(10) + 1; => Sumo 1, para que el rango este entre 1 y 10. Sino estaba entre 0 y 9.
        int suerteDelHeroe2 = suerteRandom.nextInt(10) + 1;
      '
  => Combate en rondas  mientras los los heroes tengan puntos de vida mayores a 0 .  Se tiene en cuenta la fuerza,agilidad  y el 'factor suerte'. 
      Los puntos de vida se actualizan por cada ronda.

Como se calculan los ataques de ambos heroes 
      ' 
      int ataqueHeroe1 = (int) ((heroe1.getFuerza() + heroe1.getAgilidad() + suerteDelHeroe1) / 2); 
      int ataqueHeroe2 = (int) ((heroe2.getFuerza() + heroe2.getAgilidad() + suerteDelHeroe2) / 2);
      '

* 'Orientacion para esta clase : '
https://es.stackoverflow.com/questions/5390/como-generar-n%C3%BAmeros-aleatorios-dentro-de-un-rango-de-valores
https://aprenderaprogramar.com/foros/index.php?topic=7889.0
https://aprenderaprogramar.com/foros/index.php?topic=7893.0


# Metodo Main 

Utilizo la clase 'SerializarHeroe' para deserializar los datos de los heroes desde un archivo.

    '
      SerializarHeroe serializarHeroe = new SerializarHeroe(); 
      DatosHeroes datosHeroes = serializarHeroe.deserializarHeroes();
    '

si hay datos nulos indico al sistema que inicialice nuevos datos de heroes'DatosHeroes()'

#menu interactivo  con un bucle While.
opciones : 

1. Crear Personaje: Llama al metodo 'crearHeroe()' de la clase Heroe para crear un nuevo héroe y lo serializa.

2. Borrar personaje: Lista los personajes por nombre, permite al usuario seleccionar uno para eliminar . No indique que se actualice por indice ya que estaba teniendo inconvenientes para realizarlo.

3. Listar Personajes: Muestra todos los heroes

4. Añade Superpoderes: Aplica un superpoder a un héroe seleccionado por su número/indice en la lista.

5. Batalla: Organiza una batalla entre dos heroes seleccionados por el numero que puedes ver en la lista.

6. Salir: Finaliza el programa.


  
