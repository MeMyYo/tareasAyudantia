/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Item2 {
    private int state;
    public Item2(int a){
        state=a;
    }

    public int getState() {                                                     //Pedimos el estado del objeto
        return state;
    }

    public void setState(int state) {                                           //establecemos si el objeto fue usado
        this.state = state;
    }
    
    public void masAtk(){                                                       //aumentamos el ataque del personaje
        Aventura.p1.setAtk(20);
    }
}
