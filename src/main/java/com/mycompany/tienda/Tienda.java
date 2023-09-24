package com.mycompany.tienda;
import java.util.Scanner;
/**
 * Porgrama que pseudo-simula una tienda (papeleria).
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Tienda {
    public static void main(String[] args) {
        /*Se tiene una tienda de utiles escolares con 5 productos, los cuales se tiene el nombre del producto, el costo y stock.
1. Que el usuario introduzca el nombre del producto, sino se encuentra el producto diga “Producto no encontrado.”
2.-Si el producto se localiza, solicitar a el usuario la cantidad que se va a llevar, si la cantidad es mayor al stock diga “No contamos con la suficiente mercancía.”
3.-Si se cuenta con la cantidad de mercancía indicar el total a pagar.
        */
        
        Scanner sn=new Scanner(System.in);
        
        System.out.println("Ingrese el número del producto que quiere adquirir");
        System.out.println("Lapiz: 1");
        System.out.println("Pluma: 2");
        System.out.println("Tijeras: 3");
        System.out.println("Cuaderno: 4");
        System.out.println("Resistol: 5");
        
        int producto=sn.nextInt();
    
        //LAPICES
        if (producto==1){
            System.out.println("¿Cuantos articulos desea adquirir?");
            int cantidad=sn.nextInt();{
                if(cantidad>10){
                    System.out.println("No tenemos esa cantidad de articulos.");
                }else{
                    int costo=5;
                    int total=costo*cantidad;
                    System.out.println("Usted pagara "+total+" pesos.");
                    System.out.println("Por la cantidad de "+cantidad+" lapices.");
                }
            }   
        }
        
        //PLUMAS
        if (producto==2){
            System.out.println("¿Cuantos articulos desea adquirir?");
            int cantidad=sn.nextInt();{
                if(cantidad>8){
                    System.out.println("No tenemos esa cantidad de articulos.");
                }else{
                    int costo=7;
                    int total=costo*cantidad;
                    System.out.println("Usted pagara "+total+" pesos.");
                    System.out.println("Por la cantidad de "+cantidad+" plumas.");
                }
            }
        }
        //TIJERAS
        if (producto==3){
            System.out.println("¿Cuantos articulos desea adquirir?");
            int cantidad=sn.nextInt();{
                if(cantidad>10){
                        System.out.println("No tenemos esa cantidad de articulos.");
                }else{
                    int costo=15;
                    int total=costo*cantidad;
                    System.out.println("Usted pagara "+total+" pesos.");
                    System.out.println("Por la cantidad de "+cantidad+" tijeras.");
                }
            }
        }
        
        //CUADERNOS
        if (producto==4){
            System.out.println("¿Cuantos articulos desea adquirir?");
            int cantidad=sn.nextInt();{
                if(cantidad>10){
                    System.out.println("No tenemos esa cantidad de articulos.");
                }else{
                    int costo=20;
                    int total=costo*cantidad;
                    System.out.println("Usted pagara "+total+" pesos.");
                    System.out.println("Por la cantidad de "+cantidad+" cuadernos.");
                }
            }
        }
        //RESISTOL
        if (producto==5){
            System.out.println("¿Cuantos articulos desea adquirir?");
            int cantidad=sn.nextInt();{
                if(cantidad>10){
                    System.out.println("No tenemos esa cantidad de articulos.");
                }else{
                    int costo=10;
                    int total=costo*cantidad;
                    System.out.println("Usted pagara "+total+" pesos.");
                    System.out.println("Por la cantidad de "+cantidad+" resistol.");
                }
            }
        }
        
    }
}
