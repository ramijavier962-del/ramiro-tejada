
package Practicandoparaexamen;

import java.util.Scanner;


public class practiquita {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        /*
        String Nombre;
        
        System.out.println("ingreses su nombre");
        Nombre=input.nextLine ();
        
        System.out.println("hola "+Nombre+" como estas?");
    
 */
        /*
        ///eje2
        String Nombre,Apellido;
        
        System.out.println("ingreses su nombre");
        Nombre=input.nextLine ();
        System.out.println("ingreses su apellido");
        Apellido=input.nextLine ();
        
        System.out.println("hola "+Nombre+" "+Apellido+" como estas?");
    */
        /*
        //eje3
        int edad;
        String Nombre;
        System.out.println("ingreses su nombre");
        Nombre=input.nextLine();
        System.out.println("ingreses su edad");
        edad=input.nextInt();
        
        if(edad>=18){
            System.out.println("usted "+Nombre+ " tiene acceso permitido");
            
        }else{
            System.out.println("usted "+Nombre+ " tiene acceso denegado");
            
        }
*/
        //eje4
        /*
        int numero;
        System.out.println("ingrese un numero");
        numero=input.nextInt();
        if(numero>0){
            System.out.println("el numero: "+numero+" es positivo");
        }else if(numero<0){
             System.out.println("el numero: "+numero+" es negativo");
        }else{
             System.out.println("el numero: "+numero+" es cero");
        }
*/
        /*
        //eje5
        int option;
        System.out.println("elija una opcion:");
        System.out.println("1: perfil");
        System.out.println("2: configuracion");
        System.out.println("3: cerrar sesion");
        System.out.println("eleccion:");
        option=input.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("usted ingreso al perfil");
                System.out.println("ingresando .....");
                break;
            case 2:
                System.out.println("usted ingreso a configuracion");
                System.out.println("ingresando .....");
                break;
            case 3:
                System.out.println("usted cerro sesion");
                System.out.println("cerrando .....");
                break;
            default:
                break;
        }
*/
        
/*//eje6
      int n;
        System.out.println("ingrese el numero de el dia de la semana que quiera (1,2,3,4,5)");
        n=input.nextInt();
        if(n==1){
            System.out.println("usted eligio el primer dia de la semana osea lunes");
        }else if(n==2){
            System.out.println("usted eligio el segundo dia de la semana osea martes");
        }else if(n==3){
            System.out.println("usted eligio el tercer dia de la semana osea miercoles");
        }else if (n==4){
         System.out.println("usted eligio el cuarto dia de la semana osea jueves");   
        }else if(n==5){
            System.out.println("usted eligio el quinto dia de la semana osea viernes");
        }else{
            System.out.println("dia no encontrado");
        }
  */
//eje7
/*
int contador=0;
        for (int  i = 0;  i < 10;  i++) {
            contador++;
            System.out.println(contador);
        }
*/

//EJE8
/*
int multi;
        System.out.println("ingrese su multiplo");
        multi=input.nextInt();
for (int  i = 1;  i <=10;  i++) {
           System.out.println(multi+" x "+i+" ="+ (multi*i)); 
        }
*/
//eje9
/*
int n=0;
while (n<10){
    n++;
    System.out.println(n);
}*/
//eje10
/*
     int n,contador=0;
        do {
            System.out.println("ingrese su numero positivo");
            n=input.nextInt();
            if(n>=0){
            contador=contador+n;
            }
        } while ( n>=0);
        System.out.println("la suma de los numeros positivos es: "+contador);
*/
//eje11
/*
int aprobados=0,cantAlumnos;
int notas;
        System.out.println("ingrese la cantidad de alumnos");
        cantAlumnos=input.nextInt();
        
        for (int  i = 0;  i < cantAlumnos;  i++) {
            System.out.println("ingrese las notas");
            notas=input.nextInt();
            if(notas>=6){
            aprobados++;
           }
                    
        }
        System.out.println("la cantidas de alumnos que aprobaron de los "+cantAlumnos+" son:");
        System.out.println(aprobados);
*/
//eje12
/*
String Nombre,contra;
        System.out.println("ingrese su usuario");
        Nombre=input.nextLine();
        
        System.out.println("ingrese su contraseña");
        contra=input.nextLine();
        if(Nombre.equals("admin")&contra.equals("1234")){
            System.out.println("acceso correcto");
        }else{
            System.out.println("acceso denegado");
        }
  */
//eje13
/*
double n,n2 ,s,r,m,d;
int p;
        System.out.println("ingrese el primer numero");
        n=input.nextDouble();
        System.out.println("ingrese el segundo numero");
        n2=input.nextDouble();
        System.out.println("ingrese la operacion (1=suma,2=resta,3=Multi,4=division)");
        p=input.nextInt();
        if(p==1){
           s=n+n2;
            System.out.println("la suma de los numeros es: "+s);
        } if(p==2){
           r=(n-n2);
            System.out.println("la resta de los numeros es: "+r);
        } if(p==3){
           m=n*n2;
            System.out.println("la multiplicacion de los numeros es: "+m);
        } if(p==4){
           d=(n/n2);
            System.out.println("la division de los numeros es: "+d);
        }
       */
//eje14
/*
double n1,n2,n3,promedio;
        System.out.println("ingrese la primera nota");
        n1=input.nextInt();
          System.out.println("ingrese la segunda nota");
        n2=input.nextInt();
          System.out.println("ingrese la tercera nota");
        n3=input.nextInt();
        promedio=(n1+n2+n3)/3;
        if(promedio>=6){
            System.out.println("usted aprobo");
            System.out.println(promedio);
        }else{
            System.out.println("no pasa");
            System.out.println(promedio);
        }
*/
//EJE15
/*
for (int  i = 1;  i < 100;  i++) {
    if(i%2==0){
        System.out.println(i);
    }
            
        }

  */      
    }    

}
