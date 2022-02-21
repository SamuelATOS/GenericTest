package Testing1;

import java.util.ArrayList;
import java.util.List;

public class Main<T> {

    public static void main(String[] args) {
        Main objeto1 = new Main<>();
        objeto1.ArrayFiller(5,10);
        objeto1.imprimirArray();
        System.out.println("Product = "+objeto1);

        List<Integer> deCadenaInteger = new ArrayList<>();
        deCadenaInteger.add(10);
        deCadenaInteger.add(15);
        System.out.println(deCadenaInteger.get(0)+deCadenaInteger.get(1));

        int ResultadoSuma = 0;

    }
    // creamos un objeto de tipo array
    List<T> ArrayNum = new ArrayList<>();

    // asignamos dos parametros de tipo T al metodo que rellena 2 indexes al arraylist
    public void ArrayFiller(T parametroRandom, T parametroAcambiar){
        for ( int i = 0; i<10; i++){
            ArrayNum.add(i, parametroRandom);
        }
        ArrayNum.set(1,parametroAcambiar);

    }

    public void imprimirArray(){
        for(int i=0 ; i<10; i++){
            System.out.println(ArrayNum.get(i));
        }
        System.out.println("Valor especifico:" + ArrayNum.get(2));
//        System.out.println("Suma" + (ArrayNum.get(3) + ArrayNum.get(4)));
    }
    /*
    public void Suma2indexes(T ramdomValue, T parametroAcambiar){
        T ResultadoSuma =  ramdomValue + parametroAcambiar;
        return ResultadoSuma;
    }*/

//    public void suma(){
//        ArrayNum.
//    }

//    public void sum()""
}
