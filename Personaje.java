/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Jorge
 */
public class Personaje {
        /*
    0=hospital
    1=bosque
    2=caverna
    */
    
    
    private int pos;
    private int atk;
    private int hp;
    private int def;
    public Personaje(int atack, int health, int defense,int lugar){
        atk=atack;
        hp=health;
        def=defense;
        lugar=pos;
    }

    public int getPos() {                                                       //pedimos la posicion
        return pos;
    }

    public void setPos(int pos) {                                               //establecemos la posicion
        this.pos = pos;
    }

    public int getAtk() {                                                       //pedimos el ataque
        return atk;
    }

    public void setAtk(int atk) {                                               //establecemos el ataque
        this.atk = atk;
    }

    public int getHp() {                                                        //pedimos los puntos de vida
        return hp;
    }

    public void setHp(int hp) {                                                 //establecemos los puntos de vida
        this.hp = hp;
    }

    public int getDef() {                                                       //pedimos la defensa
        return def;
    }

    public void setDef(int def) {                                               //establecemos la defensa
        this.def = def;
    }
    
    public String lugar(){                                                      //Este metodo traduce la variable pos a un string
        int a=getPos();
        if (a==0) {
            return "Hospital";
        }else { if (a==1) {
                return "Bosque";
            }else if (a==2) {
                return "Caverna";
            }else{ return "Posicion inicial";}}
    }
        
    public void caminar(){
        Random rand= new Random(); 
                                                                                 //Este metodo elije un lugar al azar de entre los 3 disponibles. 
                                                                                 //(el if evita que se camine al mismo sitio donde se encontraba)
        int a = rand.nextInt(3);
        if (a!=pos){
            pos=a;
            anunciar();
        }else{ caminar(); }
        
    }
    
    public void anunciar(){                                                     //aqui decimos la ubicacion del personaje
        if (pos==0) {
            //hospital
            System.out.println("Estas entrando en un hospital");
        }else{if (pos==1) {
                //bosque
                System.out.println("Estas entrando en un bosque");
            }else{
            //caverna
            System.out.println("Estas entrando a una caverna");
        }
        }
    }
    
    public void mostrarEst(){
                                                                                //Con este metodo mostramos estado
        System.out.println("Estado:");
        System.out.println("Salud:              "+getHp());
        System.out.println("Posición actual:    "+lugar());
        System.out.println("Ataque:             "+getAtk());
        System.out.println("Defensa:            "+getDef());
    }
    
}
