public class Ejercicios_tema_4{
	public static void main(String[]args){
/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
System.out.println("__Primer ejercicio__");
double numeroIf=1.2;
	if(numeroIf<0){
		System.out.println("Número negativo");
	}
	else if(numeroIf>0){
		System.out.println("Número positivo");
	}
	else{System.out.println("Número igual a 0");
	}
/*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.*/	
System.out.println("__Segundo ejercicio__");
int numeroWhile=0;
	while(numeroWhile<3){
		System.out.println(numeroWhile);
		numeroWhile++;
	}	
/*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.*/
System.out.println("__Tercer ejercicio__");	
numeroWhile=0;
	do{
		System.out.println(numeroWhile);
		numeroWhile++;
	}while(numeroWhile<1);	
/*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/	
System.out.println("__Cuarto ejercicio__");	
int numeroFor=0;
	for(int i=0;i<=3;i++){
		System.out.println(numeroFor);
		numeroFor++;
	}
/*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.*/
System.out.println("__Quinto ejercicio__");	
String estacion="otoño";
	switch(estacion){
		case "verano":
			System.out.println("Es verano");
			break;
		case "invierno":
			System.out.println("Es invierno");
			break;
		case "otoño":
			System.out.println("Es otoño");
			break;
		case "primavera":
			System.out.println("Es primavera");
			break;
		default:
			System.out.println("Lo siento, no existen coincidencias");
	}

	}
	
}


