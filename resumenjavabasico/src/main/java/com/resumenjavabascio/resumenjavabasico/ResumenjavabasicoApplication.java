package com.resumenjavabascio.resumenjavabasico;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResumenjavabasicoApplication {

// Logica de Progracmacion

/*Algoritmo = Conjunto de pasos secuenciales y ordenados que permiten lograr
un objetivo.*/

/*Caracteristicas de un algoritmo : 
1- Precisos
2- Definidos
3- Finitos (con un fin)
4- Legibles
5- Concretos   */

/*Partes de un algoritmo : 
 1- Entradas = Ingreso de los datos que se necesitan para operar.
 2- Proceso = Es la opracion logica que el algoritmo entrega(input).
 3- Salida = Finaliza el proceso se mustra un resultado(output). */

/* Pseudocodigo = Es la representacion del algoritmo en un lenguaje
natural y universal.

Ejemplo Calcular la edad :
1-Inicio
2-Definir anioActual , anoNacimiento , edad 
3-Escribir "Ingresew el año actual"
4-Leer anioActual
5-Escribir "Ingrese año de nacimiento"
6- edad= anioaActual - anioNacimiento
7-Mostrar "La edad de la persona es: + edad" */

//-----------------------------------------------------------------------------

//Metodos que se usan para enviar y recibir datos 

/*GET = obtiene/recibe informacion 
 ejemplo al entar a una pagina, pinchar un link, abrir un mensaje*/

/*POST = El usuario enterga informacion directa (se nevia al servidor)
ejemplo envio un comentario, le doy like a algo*/

/*PUT = Editar la informacion, el usuatio cambia un estado
ejemplo a lo que le di like le pongo dislike, el comentario que envie lo edito*/

/*DELETE = Elimina la informacion permanentemente, poco usado */

//------------------------------------------------------------------------------

//Codigos de error

/*200 = Esta todo perfecto, le metodo usado fue correcto */
/*404/not found = No funciono o se cayo (no se conecto) */
/*500 = como el 404, el error esta en el servidor */
/*301 = edicion permanente */
/*302 = edicion temporal */

//------------------------------------------------------------------------------

//Tipos de variables 

/*-String = Palabras (entre comillas dobles) (S de string enmayuscula) "Hola" */
/*-Integer / Int = Numero enteros, van sin comillas ni nada */
/*-Double = para numeros decimales, cuando los escribo en consola va con punto (.)
 si lo escriben por texto va con una coma (,)*/
 /*Boolean = true o false */
 /*Char = caracter de un solo valor (va en comill simple) 'A' */

 /*Al definit variable seria algo asi */
 int resta1 = 0;
 double div = 0;

//-------------------------------------------------------------------------------

//Funciones

/* 1 - Funciones que si retorna :
 Public (tipo devariable) nombre (parametros){
	Return;
 } */

 public int suma (int num1, int num2){
	int sumaNumeros = num1 + num2;
	return sumaNumeros;
 }

/* 2Funciones que no retornan :
 -Van con void y static y en vez de return se usa system.out.prinln()
 -Como no retorna no hay que declarar el tipo de variable
 -Lo que guarda lo guarda como string
 
 public void static nombre (parametro){
	system.out.println();
 } */
 
 public void mostrarTuNombre (String nombre){
	System.out.println("Tu nombre es:" + nombre);
 }

//----------------------------------------------------------------------------

// Operadores matematicos 

/* suma = "+" */
/* resta = "-" */
/* multiplicacion = "*" */
/* elevado = "**" */
/* division = "/" */
/* resto = "%" */

//-----------------------------------------------------------------------------

//Operadores de comparacion o asignacion

/* mayor que = ">" */
/* menor que = "<" */
/* igual que = "==" */
/* distinto de = "!=" */

//------------------------------------------------------------------------------

// Operadores logicos 

/* && = and "y" */
/* || = or "o" */
/* ! = distinto de o negacion de */

//Tablas de verdad 

/* && (y) =  V V = V      || (o) =  V V = V
-            V F = F                V F = V
-			 F V = F                F V = V
-			 F F = F                F F = F   */

//---------------------------------------------------------------------------

//Condicionales if-elseif-else, while, do..while, for

//--if(si)-elseif- else (si no)--

/*if (condicion){
	se ejecuta aqui si se cumple la condicion

}else if (condicion){
	Si no se cumple lo de arriba pero la de aqui si, entra aqui 

}else {
	si no se cumplen ninguna de las anteriores, se realiza esto

} */

/*public static void sobrePromedio(Double promedioGeneral, ArrayList<Double> notas, String nombreAlum){
	Double promedioAlumno = promedioNotas(notas);
	if(promedioAlumno>promedioGeneral){
		System.out.println("El alumno "+nombreAlum+" está sobre el promedio");
	}else if(promedioAlumno == promedioGeneral){
		System.out.println("El alumno "+nombreAlum+" es igual al promedio general");
	}else{
		System.out.println("El alumno "+nombreAlum+" está bajo el promedio");
	}
}*/


//---For----

/* Se exactamente cuantas veces va a iterar */

/* for (int i = 0 , condicion , i++){
	mientras la condicion sea verdad, estro se va a ejecutar 
} */

/*for(int i = 1; i <= cantAlum; i++){
	teclado.nextLine();
	//creamos un array cpara ir gurdando las notas por alumno
	ArrayList <Double> notasAlumnos = new ArrayList<Double>();
	System.out.print("Ingresa nombre del alumno: ");
	nomAlum = teclado.nextLine();
	//con esto guardamos la nota con el nombre de fulanito
	for(int x = 1; x <= cantNotas; x++){
		System.out.print("Ingresa nota " +x+ " del alumno "+ nomAlum +": ");
		Double nota = teclado.nextDouble();
		notasAlumnos.add(nota);
	}
	//todo lo que pedimos adelante se lo guardamos al hashmap que contiene nombre alumno mas la nota 
	libroClase.put(nomAlum, notasAlumnos);
	
}*/



// ---While (mientras)---
/* No se cuantas veces va a iterr pero si cuando terminara */

/*  while (condicion){
	  mientras la condicion sea verdad, esto se va a ejecutar
} */


// ---- Do..while----
/* si o si la iteracion se hace una vez independiente de si esta bien o no */

/* do {
	Entra almenos una vez y luego comprueba la condicion. si es verdad
	vuelve a iterar 
} while (condicon)        */

/*do{
	System.out.print("Indique la cantidad de alumnos que va a ingresar: ");
	cantAlum = teclado.nextInt();
	if(cantAlum <= 0){
		System.out.print("La cantidad de alumnos debe ser mayor a cero, porfavor intente denuevo");
	}

}while(cantAlum <= 0);*/


//-----------------------------------------------------------------------------

//Pedir datos por teclado

/* 1 - importar la libreria que permite pedir datos al usuario
 import.java.util scanner
   2- Luego de importar se inicializa con 
 scanner teclado = new scanner (system.in);
   3- Finalizamos llamandolo
 datoteclado = teclado.nextLine(); */

 /*  1 se escribe en la zona de import del comienzo
 2 y 3 se escriben en la parte de void main*/
 
/*teclado.closea() ; cierra el teclado en su totalidad */

/* depende del dato que le este pidiendo al usuario es el punto algo 
 que le pongo :  .nextint(); le pido un entero
 .nextLine(); le pido una palabra
 .nextdouble(); un decimal */


//------------------------------------------------------------------------

// Arreglos o Arrays
/* 1- Importar libreria dearray
 import java.util.ArrayList;
   2- formato
 ArrayList <tipo de variable> nombreArray = new ArrayList <tipo de variable>();
 ArrayList <Integer> ejemplo = new ArrayList <Integer>();

 -Para agregar dato
 nombreArray.add ("palabra");

 -Para obtener el valor que existe en un indice
 nombreArray.get(0); (en el parentesis va el indice del dato que busco)

 -Para cambiar el valor que existe en un indice
 nombreArray.set(0 , "new string"); (indice, lo que quiero poner ahi)

 -Remover o eliminar en algun indice
 nombreArray.remove(0); (el indice 0 es el que quiero cambiar)

 -Obtener la cantidad de datos que tiene el array
 nombreArray.size();

 en resumen
 .add ("cambio") = agrego un indice al final
 .get(0) = busco que hay en x indice particular
 .set ( 0 , "nuevo") = cambio un indice x y le doy lo nuevo
 .remove (0) = elimino un indice deseado
 .clear () = borro todo
 .seze() = cuantos datos tiene en total  */

//---------------------------------------------------------------------------

//HashMap

/* - se usa para almacenar elementos en pares llave o clave/ valor
 - la clave o llave es la que se busca para que me de el valor */

/* 1- importamos la libreria 
import java.util.HashMap;
   2- definimos
HashMap<String, Double>nombreHashmap = new HashMap <String, Double>();
HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();

- Como ingredar datos a HashMap
nombreHashMap.put ("camila", 6.7);
nombreHashMap.put ("daniel", 6.9);

-Como obtener datos segun la llave
nombreHashMap.get ("camila");

-Como podemos remover datos segun llave
nombreHashMap.remove ( "camila");

-Como limpiar todos los valores
nombreHashMap.clear ();

-Como obtener valor de todos los datos
nombreHashMap.size();

-como iterar un HashMap obteniendo la llave y elvalor

for(String i : nombreHashMap.keyset()){
	system.out.println ("key:" + i + "valor:" + nombreHashMap.get (i));
}

en resumen 
.put = ingresar datos
.get = obtener datos
.remove = eliminar datos
.clear = limpiar datos
.size = obtener valor 
for especial para poder recorrer el arreglo keyset me permite mirar las llaves
por decirlo de alguna forma y con el .get(i) me va diciendo los valores que 
hay en cada llave
 */

 //--------------------------------------------------------------------------

 //Objetos 

/* En la carpeta models debemos de crear todos los objetos */
/* 1- Crear un Archivo en la carpeta models con el nombre del objeto en singular
 por ejemplo , Perro.java  */

/* Estructura objetos */

/* 1 - Atributos
Pueden ser publicos o privados, depende de la sensbilidad del dato
Se les dice que tipo de atributo sera y su nombre correspondiente

    public String raza;
    public String color;
    public Double tamano;
    public String pelaje;
    public char sexo;
    private Integer chip;

   2- Constructor vacio
click derecho + accion de codigo fuente + generate constructors + no selecciono
nada + aceptar

    public Perro() {
    }

   3- Constructor con atributos
click derecho + accion de codigo fuente + generate constructors + seleccionamos
todo + aceptar

   public Perro(String raza, String color, Double tamano, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamano = tamano;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }

   4- Getters and Setters
   Click derecho + accion de codigo fuente + generate getters and setters + 
   selecciono todo + aceptar

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    } 

   5- Funcionalidades

     public void ladrar (){
        System.out.println("guau guau!");
     }
    
    public String romperCosas (boolean meRetaron){
        if (meRetaron == true) {
            return "Destrozo";
            
        } else {
            return "No destrozo";
        }
     }
    
    public String cavar(){
       return "El perro cavo un hoyo";
     }

   6- ToString  
 click derecho + accion de codigo fuente + to string + y selecciono los atributos
 que yo quiero ver

 @Override
    public String toString() {
        return "Perro [raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", pelaje=" + pelaje + ", sexo="
                + sexo + ", chip=" + chip + "]";
    } */


//----------------------------------------------------------------------------

//Herencias 

/* Las herencias son como los objetos pero engloba atributos generales
 que le tocan a varios otros por tanto se toma como objeto padre */

/* para poder crear a la clase padre se hace lo mismo que le hicimos al
 crear un objeto */

 /*Las diferencias viene al momento de crear las clases hijos de este */

/* la clase hijo se crea igual que un objeto comun,pero como el padre ya
 tendra tributos generales, a este se le da el atributo especifico de el 
 que no tiene nadie mas de los hijos*/

//Clase hijo

// 1 se utiliza extends como palabra reservada para llamar al clase padre animal 
/*public class Gato extends Animal{
     public Integer cantBigotes; (le damos su atributo caracteristico)*/
	 
/* 2- construimos el constructor vacio pero debe de ir con la palabra super
 para poder llamar al clase padre

public Gato(){
    super();
}  */
	
/*3 segundo constructor con todas sus cosas

 public Gato(String nombre, String raza, String pelaje, boolean vacunado, Integer cantBigotes) {
    super(nombre, raza, pelaje, vacunado);
    this.cantBigotes = cantBigotes;
} */

/* 4 hacemos los get y set y solo salen los atributos especiales que le dimos
 a la clase hijo,  porque internamente ya estan llamando al padre 

 public Integer getCantBigotes() {
    return cantBigotes;
}

public void setCantBigotes(Integer cantBigotes) {
    this.cantBigotes = cantBigotes;
} */

/* 5 - funcionalidadees 
 public void maulla (){
    System.out.println("miauuuuu!");
 } */

/*6 to string 
 lo mismo pero se le agrega un "super.toString() +" lo que 
 sale por defecto en el toString


 @Override
public String toString() {
    return super.toString() + "Gato [cantBigotes=" + cantBigotes + "]";
}
  */

 // tanto clase padre como objetos hijos e llaman en el main 

	public static void main(String[] args) {

	/*Buenas practicas: 
	 -Los nombres de variables deben de ir en minuscula siempre
	 ejemplo anioActual o anio_actual
	 -No se debe de usar la Ñ 
	 -Cada vez que se crea un proyecto nuevo se debe de borrar la fila 10 y la 3 
	 -Todo lo que yo quiero hacer va dentro del public class (nombre) {}
	 -No puedo llamar una funcion arriba de donde la cree, ya que Java lee de
	 arriba abajo
	 ejemplo : funcion x y en main la llamo = correcto
	           main y la llamo, luego funcion x = error
	 -Al llamar funcion si o si debe ser dentro del main 
	 -Bucles se escriben directamente en el main 
		
	*/
	 
	/*Cada vez que creamos un proyecto nuevo en visual tenemos que:
	1- en src - main - java - creo carpetas = api , models , repositories, services
	esos nombres en la carpeta deben de ir en minuscula 
	 */

	}

//----------------------------------------------------------------------------

//Instalacion de visual estudio 
/* 1- Extensiones 
 * 2- buscador = java ( spring web, my sql drive,thymeleaf)
 * 3- Instalamos 
 * 4- Sale get started with java development */

 //cada vez que quierocrear  proyecto 
 /* 1-ctrl+shift+p
  * 2-initial
  * 3- Spring create a maven project
  * 4- 3.0.3
  * 5- Java
  * 6- Nombre proyecto
  * 7- todo con minuscula y sin numeros 
  * 8- jar
  * 9 - 17
  * 10- selecciono las extensiones : spring web, mysqldriver, thymeleaf*/

  // si no me abre
  /* de la carpeta git bash here = code . */

  //Crear el tema
  /* 1 src
   * 2 java
   * 3 resources
   * 4 template
   * 5 nuevo archivo 
   * 6 index.html
   * 7 html - html : 5 
   * 8 ctrl + s 
   * 9 application .properties
   *    server.port = 8080
   *       ctrl+s
   * 10 extensiones
   * 11 spring boot dashboard instalamos
   * 12 cosito como d power
   * 13 proyecto
   * 14 play
   * 15 acepto todo
   * 16 abro navegador
   * 17 busco localhost:8080
   */

   //--------------------------------------------------------------

   //git hub 

   //Inicializacion git 
 /* 
 1- git init
 2- git add .
 3- git commit -m "first commit"
 4- ingreso usuario + correo tal cual me lo pide
 5- git commit -m "first commit"
 6- git remote add origin + link de git web del repo
 7- git push -u origin master
 8- sign in with your browser
 9- meter los datos + autenticar*/

 // como crear rama

 /*
  1- git clone "copiamos ell ink de repositorio github"
  2- cd (escribimosla carpeta que se creo )
  3- git branch camiberrios (nombrerama)
  4- git checkout camiberrios
  5- git add .
  6- git commit -m "el text cualquiera"
  7- git push */

// Como aceptar a los que modifican

/*
 1- settings
 2- collaborators
 3- poner pass
 4- add people
 5- se escribe los correos que tienen acceso
 6- Cada uno acepta equipo*/

 //para bajar datosdel todoglobal

 /* 
 1-git checjout main
 2- git pull
 3- git merge rama de nosotros (camiberrios)
 4- git push */

 //------------------------------------------------------------
 //ASI me sirvio a mi subir la info al git 
 /*
  1- git remote add origin "link"
  2- git init
  3- git add . 
  4- git commit -m "texto"
  5- git push -u origin master */

}
