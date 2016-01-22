
package arreglos;

import javax.swing.JOptionPane;

public class Arreglos {

   
    public static void main(String[] args) {
        
        /*int x[];   // con esto declaro el arreglo
         
        x = new int[3]; //con esto defino el tamaño del arreglo        
        
        x[0]=10;
        x[1]=5;     //los valores que toman las casiilas del arreglo
       
        x[2]=7;
        
        for(int i=0; i<x.length;i++){ // en este for la i va subiendo de nivel y eso permite mostrar los arreglos
            System.out.println("arreglo en indice: "+ i +"es igual a " + x[i]); //i es el contador por eso se coloca en el arreglo asi comocambia su valor cambia la casiila del arreglo
        }*/
        
    /* int num[]=new int[10];
 
        //Invocamos las funciones
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    } */  
    
     /*   //Indicamos el tamaño
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
 
        //Invocamos las funciones
        rellenarNumAleatorioArray(num, 0, 9); //este da los valores que se pueden elegir
 
        mostrarArray(num); //este es el que permite estrar el valor deseado 
    }
 
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b)); //el math floor redonde al mayor entero
        }                                                      //math random genera numeros aleatorios
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
        
    }*/
    
//Indicamos el tamaño
  /*      String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
 
        //Invocamos las funciones
        rellenarNumPrimosAleatorioArray(num, 1, 3);
 
        mostrarArray(num);
    }
 
    public static void rellenarNumPrimosAleatorioArray(int lista[], int a, int b){
 
        int i=0;
 
        //Usamos mejor un while, ya que solo aumentara cuando genere un primo
        while(i<lista.length){ //el while es un bucle que solo actua si se cumple la condicion
            int num=((int)Math.floor(Math.random()*(a-b)+b));
            if (esPrimo(num)){
                lista[i]=num;
                i++;
            }
        }
    }
    private static boolean esPrimo (int num){       
 
        //Un numero negativo, el 0 y el 1, son directamente no primos.
        if (num<=1){
            return false;
        }else{
 
            //declaracion
            int prueba;
            int contador=0;
            //Hacemos la raiz cuadrada y lo usamos para dividir el numero original
            prueba=(int)Math.sqrt(num);
            //Bucle que cuenta los numeros divisibles, podemos hacerlo con while
            for (;prueba>1;prueba--){
                if (num%prueba==0){
                    contador+=1;
                }
            }
            return contador < 1;
        }
    }
 
    public static void mostrarArray(int lista[]){ //esto es para mostrar el arreglo
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }*/

   /* int x[][];
    x = new int [3][3];
    int cont=0;
    x[0][0]=1;
    x[0][1]=2;
    x[0][2]=3;
    x[1][0]=1;
    x[1][1]=2;
    x[1][2]=3;
    x[2][0]=1;
    x[2][1]=2;
    x[2][2]=3;
    
    for(int i=0;i<x.length;i++){
        for(int j =0;j<x.length;j++){
            
            System.out.println("x["+i+"]["+j+"]= "+ x[i][j]);
     cont+=x[i][j];
        
        
        }
         
    }
   System.out.println("la suma del arreglo es "  + cont);
    }*/




}        
}

