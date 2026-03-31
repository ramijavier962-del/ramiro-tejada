
package practico1MInombre;

import java.util.Arrays;
import java.util.Scanner;


public class yo {
    public static void main(String[] args) {
        //hacer que se muestre mi nomre y mi edad y todo eso
        //ejersicio 1
        /*
        int EDAD=16;
        double ALTURA=1.77;
        String NOMBRE="Ramiro Tejada",PAIS="Argentina",CASADO="soltero";
        String Provincia="La Rioja",LOCALIDAD="Nonogasta";
        System.out.println("Mi nombre es: "+NOMBRE);
        System.out.println("Tengo: "+EDAD+"Anios");
        System.out.println("SOY DE "+PAIS);
        System.out.println("DE LA PROVINCIA DE "+Provincia);
        System.out.println("y vivo en: "+LOCALIDAD+",Y ESTOY: "+CASADO);
         */
        //ejersicio2
        //crear un programa para hacer un gmail
        /*
        System.out.println("###CREANDO GMAIL###");
        System.out.println(" ");
        String NOMBRE="Lionel",N2="Andres",APELLIDO="Messi";
        String Nombredeempresa="CEN-Tecnoligia";
        String nomredominio="CEN.TECH.COM.AR";
        System.out.println(" NOMBRE DE USUARIO: "+NOMBRE+""+N2+""+APELLIDO);
        System.out.println("NOMBRE DE EMPRESA:"+Nombredeempresa);
        System.out.println("NOMBRE DE DOMINIO:"+nomredominio);
        System.out.println("");
        System.out.println("CREANDO GMAIL ....");
        System.out.println("");
        System.out.println(NOMBRE+"_"+N2+"_"+APELLIDO+"@"+nomredominio);
        System.out.println("");
         */
        //ejersicio3
        //Crea un programa que solicite al usuario ingresar sus datos de empleado.
        Scanner Scanner = new Scanner (System.in);   
        /*
        String nombre;
        int edad;
        double salario;
        
        System.out.println("Ingrese su nombre");
        nombre= Scanner.nextLine();
        System.out.println("");
       System.out.println("Ingrese su edad");
       edad=Scanner.nextInt();
        System.out.println("");
        System.out.println("ingrese su suledo");
        salario=Scanner.nextDouble();
        
        System.out.println("guardando....");
        System.out.println("");
        System.out.println("su nombre es: "+nombre);
        System.out.println("su edad es: "+edad);
        System.out.println("su salario es de: "+salario);
        System.out.println("");
*/
        
        //ejersicio4
        //RECETA
        /*
        String NRECETA,INGRE,minutos,dificul;
        
        System.out.println("ingrese el nombre de la receta");
        NRECETA=Scanner.nextLine();
        
        System.out.println("ingrese todos los ingredientes principañes");
        INGRE=Scanner.nextLine();

        System.out.println("ingrese los minutos");
       minutos=Scanner.nextLine(); 

        System.out.println("que grado de dificultad tiene?(facil,medio,dificil)"); 
        dificul=Scanner.nextLine();
        
        System.out.println("nombre de la receta: "+NRECETA);
        
        */
        
        /*
        //edad para conducir
        //eje5
        int edad;
        
        System.out.println("ingrese su edad para verificar su legalidad");
        edad=Scanner.nextInt();
        
        if(edad>=16){
            System.out.println("usted tiene: "+edad+"anios");
            System.out.println("por lo tanto usted puede manejar");
        }else{
            System.out.println("usted no cumple la edad para manejar");
        }
        */
        
        //eje6
        String Gusto,c="Chocolate",V="Vainilla",F="Frutilla",D="Dulce de leche";
        
        System.out.println("ingrese su sabor de helado");
        Gusto=Scanner.nextLine(); 
        
        if(Gusto.equals(c)){
            
            System.out.println("este sabor (chocolate) esta disponible");
            
        }else if(Gusto.equals(V)){
            
            System.out.println("este sabor (vainilla) esta disponible");
            
        }else if(Gusto.equals(F)){
            
            System.out.println("este sabor (Frutilla) esta disponible");
            
        }else if(Gusto.equals(D)){
            
            System.out.println("este sabor (Dulce de leche) esta disponible");
            
        }else{
            System.out.println("no hay sabor");
        }
        
        
        
        
        
}
}