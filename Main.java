/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class Main {
    public Main(){}
    Scanner leer = new Scanner(System.in);
     //int i = sc.nextInt();
    Aventura adv=new Aventura();
    public void menu(int a){                                                    //menu de opciones
        switch(a){
            case 1: adv.usarObj();
                break;
            case 2: adv.caminar();
                break;
            case 3: adv.mostrarEst();
                break;
            default: loop(); break;
        }
                
    }
    
    public void preguntar(){                                                    //Mostramos opciones al jugador
        System.out.println("Ingrese un numero para realizar una accion:");
        System.out.println("1)  Usar Objeto");
        System.out.println("2)  Caminar");
        System.out.println("3)  Mostrar estado del personaje");
        System.out.println("Cualquier otro numero repetira esta pantalla");
        System.out.println("");
    }
    
    
    public void loop(){                                                         //permitimos que el juego se mantenga en ejecucion con un "ciclo"
        preguntar();
        menu(validar());
        loop();
    }
    
    public String leer(){                                                       //leemos las entradas
        System.out.println("Ingrese un numero entero");
        String ans= leer.nextLine();
        return ans;
    }
    
    public int validar(){                                                       //validamos las entradas
        boolean i=false;
        int var=0;
        while(i==false){
            try{
            var=Integer.parseInt(leer());
            i=true;
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros enteros (no espacios, simbolos ni vacio)");
            }
        }
        System.out.println("Numero aceptado");
        System.out.println("-------------------------------------------------");
        
        return var;
    }
    
    public void start(){                                                        //Mostramos una descripcion del juego
        System.out.println("  __________________________________");
        System.out.println("|| El explorador: juego de aventura ||");
        System.out.println("||__________________________________||");
        System.out.println("||                                  ||");
        System.out.println("Entras a una aventura explorando distintas ubicaciones.");
        System.out.println("Encontrarás objetos en estos lugares los cuales podrás usar y estos objetos determinarán tu futuro.");
        System.out.println("Usalos en el momento determinado, y una vez que no puedas encontrar mas objetos tu aventura habrá terminado.");
        System.out.println("Adelante...");
        adv.caminar();
        loop();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Main main = new Main();
        main.start();                                                           //comenzamos el juego
    }
    
}
