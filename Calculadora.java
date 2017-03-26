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
public class Calculadora {
    static float num1;
    static float num2;
    
    
    /**
     *
     * @param value1
     * @param value2
     */
    public Calculadora(float value1, float value2){
        num1=value1;
        num2=value2;
    }
    
    public void set1(float n){
        this.num1=n;
    }
    
    public void set2(float n){
        this.num2=n;
    }
     
    
    
    public static float suma(){
        //System.out.println("la suma entre "+num1+" y "+num2+" es: "+(num1+num2));
        return num1+num2;
    }
    
    public float resta(){
        //System.out.println("la resta entre "+num1+" y "+num2+" es: "+(num1-num2));
        return num1-num2;
    }
    
    public float mult(){
        //System.out.println("la multiplicación entre "+num1+" y "+num2+" es: "+(num1*num2));
        return num1*num2;
    }
    
    public float div(){
        if (num2==0){                                                           //Preguntamos a la maquina si la variable es cero para evitar errores
            System.out.println("La división por cero no se encuentra definida");//Entonces si es cero se muestra un "error"
            return 0;
        }else{
            //System.out.println("la division entre "+num1+" y "+num2+" es: "+(num1/num2));
            return num1/num2;
        }
        
        
    }

    
}
