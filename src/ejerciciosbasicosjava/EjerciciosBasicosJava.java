/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;



/**
 *
 * @author rioja
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        if(finDeSemana){
    return true;
}
if(numBellotas >= 40 && numBellotas <= 60 ){
    return true;
}
return false;
    }
    
    public boolean multas(int velocidad, boolean birthday){
        if(birthday){
    return true;
}
if(velocidad >= 40 && velocidad <= 60 ){
    return true;
}
return false;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios=new EjerciciosBasicosJava();
        System.out.print(ejercicios.fiestaArdillas(30, false));
        System.out.print(ejercicios.fiestaArdillas(50, false));
        System.out.print(ejercicios.fiestaArdillas(70, true));
    }
    
}
