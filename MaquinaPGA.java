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
public class MaquinaPGA {
    static float PGA[][];
    static int cantidad;
    static float THS;
     public MaquinaPGA(){
        this.PGA= new float[2][cantidad];
    }
    
    public static void crearArreglo(){
        cantidad=Lector.validarInt(0);
        
    }
    
    public static void guardarArreglo(){
        float validador=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < cantidad; j++) {
                if (i<1) {
                    System.out.println("Ingrese los promedios de sus respectivas aignaturas"); 
                    System.out.println("Asignatura N°"+(j+1));
                    PGA[i][j]=Lector.validarFloat(0);
                }else{
                    System.out.println("Ingrese las horas de clase por semana de sus respectivas asignaturas");
                    System.out.println("Asignatura N°"+(j+1));
                    PGA[i][j]=Lector.validarH(0);
                    validador=PGA[i][j]+validador;
                }
                
            }
            if (validador>144){
                System.out.println("Error, el número de horas supera el límite de una semana, vuelva a intentarlo");
                guardarArreglo();
            }
        }
        THS=validador;
        //mostrarArreglo();
        
    }
    
    public static void preguntar(){
        System.out.println("¿Cuantas asignaturas cursa o cursó?");
    }
    
    public static void mostrarArreglo(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.print(PGA[i][j]);
                System.out.print("   ");
            }
            System.out.println("");
        }
    }
    
    public static void formPGA(){
        Calculadora test = new Calculadora(0,0);
        float val1;
        float acum=0;
        for (int i = 0; i < cantidad; i++) {
            test.set1(PGA[1][i]);
            test.set2(THS);
            val1=test.div();
            test.set1(PGA[0][i]);
            test.set2(val1);
            acum=test.mult()+acum;
        }
        System.out.println("PGA es: "+acum);
        
        
    }
}
