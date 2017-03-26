/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.v03;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class Lector {
    static Scanner leer = new Scanner (System.in);
    
    public static String leer(int sign){ 
        if (sign==1){System.out.println("Ingrese un numero negativo");                
        }else{if (sign==0) {System.out.println("Ingrese un numero positivo");
        }else{System.out.println("Ingrese un numero");}        
        }
        String ans= leer.nextLine();
        return ans;
    }   
    
    public static float validarFloat(int signo){
        boolean i=false;
        float var=0;
        while(i==false){
            try{
            var=Float.parseFloat(leer(signo));
                if (var<=7 && var>=0) {i=true;         
                }else {System.out.println("Error, número no aceptado, intente denuevo");}                                            
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros enteros (no espacios, simbolos ni vacio)");
            }
        }
        System.out.println("Numero aceptado");
        return var;
    }
    public static int validarInt(int signo){
        boolean i=false;
        int var=0;
        while(i==false){
            try{
            var=Integer.parseInt(leer(signo));
                if (var>=0) {i=true;         
                }else {System.out.println("Error, número no aceptado, intente denuevo");}                                       
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros enteros (no espacios, simbolos ni vacio)");
            }
        }
        System.out.println("Numero aceptado");
        return var;
    }
    
    public static float validarH(int signo){
        boolean i=false;
        float var=0;
        while(i==false){
            try{
            var=Float.parseFloat(leer(signo));
                if (var>=0) {i=true;         
                }else {System.out.println("Error, número no aceptado, intente denuevo");}                                       
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros  (no espacios, simbolos ni vacio)");
            }
        }
        System.out.println("Numero aceptado");
        return var;
    }
}
