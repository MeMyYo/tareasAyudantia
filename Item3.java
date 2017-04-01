/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Item3 {
    private int state;
    public Item3(int a){
        state=a;
    }    

    public int getState() {                                                     //pedimos el estado del objeto
        return state;
    }

    public void setState(int state) {                                           //establecemos si el objeto fue usado
        this.state = state;
    }
    
    public void dañar(){                                                        //Reducimos la salud del personaje por la "pelea contra el mounstro"
        if ((Aventura.p1.getHp()+Aventura.p1.getDef()+Aventura.p1.getAtk()-70)>100) {
                    Aventura.p1.setHp(100);
            }else{ Aventura.p1.setHp(Aventura.p1.getHp()+Aventura.p1.getDef()+Aventura.p1.getAtk()-70); }
    
    }
    
}
