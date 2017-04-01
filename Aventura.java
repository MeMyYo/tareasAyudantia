
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Aventura {
    int obj;
    String cosa;
    int end;
    Item1 pocion = new Item1(0);
    Item2 espada = new Item2(0);
    Item3 monstruo = new Item3(0);
    static Personaje p1 = new Personaje(5,100,10,3);
    public Aventura(){
        end=0;
    }
    
    public void mostrarEst(){                                                   //mostramos el estado del personaje
        p1.mostrarEst();
    }
    
    public void findObj(){                                                      //buscamos un objeto al azar y nos aseguramos de que no halla sido encontrado aún
        Random rand= new Random(); 
        int a = rand.nextInt(3);
        
        if (a==0){
            if (pocion.getState()==0){ obj=a; cosa="Pocion misteriosa"; } else { findObj(); }
        }else {if (a==1) {
                if (espada.getState()==0){ obj=a; cosa="Caja larga y angosta"; } else { findObj(); }
            }else{ if (monstruo.getState()==0){ obj=a; cosa="Piedra con simbolos grabados"; } else { findObj(); }}}        
    }
    
    public void verObj(){                                                       //Mostramos que objeto encontramos
        System.out.println("Has encontrardo: "+cosa);
    }
    
    public void usarObj(){                                                      //con este metodo usamos el objeto y nos aseguramos de que no se pueda volver a encontrar ni usar
        if (obj==0 && pocion.getState()==0) {
            pocion.masHp();
            pocion.setState(1);
            end++;
            System.out.println("Resulto ser una reconfortante pocion de restauracion, la cual deja tus puntos de salud en "+p1.getHp());
        }else {if (obj==1 && espada.getState()==0) {
            
            espada.masAtk();
               espada.setState(1);
               end++;
               System.out.println("Vaya!!, dentro has encontrado una espada, esta aumenta tu ataque a "+p1.getAtk());
            }else  if (obj==2 && monstruo.getState()==0) {
                monstruo.dañar();
                monstruo.setState(1);
                end++;
                System.out.println("Demonios!!!, al tocar la piedra aparecio un monstruo y tuviste que pelear con el.");
                System.out.println("Debido al ataque, defensa y salud que tenias tu pelea resulto de manera que tus puntos de salud quedaron en "+ p1.getHp());
            
            }else { System.out.println("No hay objetos que usar en el lugar");}
        }
        if (end==3) {                                                           //Con esto nos aseguramos que al acabarse los objetos terminará el juego
            System.out.println("Ya no quedan mas objetos en el juego");         //
            System.out.println("Estado final: ");                               //
            p1.mostrarEst();                                                    //
            System.out.println("");
            System.out.println("Fin del juego");
            System.exit(0);
        }
    }
    
    
    public void caminar(){                                                      //Llama al personaje a cambiar su posicion, luego encuentra un objeto y lo muestra
        p1.caminar();
        findObj();
        verObj();
    }
}
