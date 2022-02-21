package GenericsTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(0,40);
        integerArrayList.add(1,20);
        integerArrayList.add(2,100);

        //Instanciamos la clase que contiene el metodo ProductOperation
        //con un objeto donde podamos pasarle el arrayList a sus parametros
        ClasedeIntegers integersProduct = new ClasedeIntegers(integerArrayList);
        //imprimimos el objeto con el que consumimos la accion de multiplicar
        System.out.println("Product of 2 indexes of an Integers Array: "+integersProduct.productOperation(0,2));

        List<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(0,22.5);
        doubleArrayList.add(1, 33.4);

        ClasedeIntegers doublesProduct = new ClasedeIntegers(doubleArrayList);
        System.out.println("Product of 2 indexes of a Double Array: "+doublesProduct.productOperation(0,1));

        List<String> stringsArrayList = new ArrayList<>();
        stringsArrayList.add(0,"Hola");
        stringsArrayList.add(1,"Mundo");

        ClasedeIntegers stringArrayList = new ClasedeIntegers(stringsArrayList);
        System.out.println("Product of 2 indexes of a String Array: "+stringArrayList.productOperation(0,1));

    }
}
