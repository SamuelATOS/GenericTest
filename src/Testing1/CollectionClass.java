package Testing1;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass<T> {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,10);
        list.add(1,2);
        list.add(2,3);
        list.add(3,20);
        list.add(4,23);
        System.out.println("Max value is "+Collections.min(list));
        System.out.println("Min value is "+Collections.min(list));
        System.out.println(list);
    }
    /*
    public minValue(T index1, T index2){
        T index1 = this


    }*/

}
