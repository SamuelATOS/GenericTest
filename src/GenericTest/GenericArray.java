package GenericTest;

import javax.swing.*;
import java.util.ArrayList;

public class GenericArray {
    public static void main(String[] args) {
        /*ArrayList numeros = new ArrayList<>();
        for (int i=0; i<8; i++){
            numeros.set(i, JOptionPane.showInputDialog("Introduce num" +(i+1)));

        }*/
        //declarar array
        String[] numeros = new String[5];
        //rellena array
        /*for (int i=0; i<5; i++){
            numeros[i]=JOptionPane.showInputDialog("introduce numero");
        }
        //recorre array
        for (int i=0; i<numeros.length; i++){
            System.out.println("Numero "+numeros[i]);
        }*/

        //this another way to declare a for bucle
        /*for (String elemento:numeros){
            System.out.println("Numero "+elemento);
        }*/

        // declararmos otra variable
        int[] numerosAleatorios = new int[10];
        //la rellenamos automaticamente con el metodo Math.random
        for (int i=0; i< numerosAleatorios.length;i++){
            numerosAleatorios[i]=(int)Math.round(Math.random()*100);
        }
        for (int i=0; i<numerosAleatorios.length;i++){
            System.out.print(numerosAleatorios[i]+" ");
        }
    }
}
