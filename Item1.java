


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Item1 {
    private int state;
    public Item1(int a){
        state=a;
    }

    public int getState() {                                                     //pedimos el estado del objeto
        return state;
    }

    public void setState(int state) {                                           //establecemos si el objeto fue usado
        this.state = state;
    }
    
    public void masHp(){                                                        //restauramos la salud del personaje en 20 puntos pero esta solo se puede restaurar hasta 100
        if (Aventura.p1.getHp()>80) { 
                Aventura.p1.setHp(100);
            }else{ Aventura.p1.setHp(Aventura.p1.getHp()+20); }
    }
}
