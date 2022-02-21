package GenericsTest;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericAbstractClass<T> {
    //creamos una propiedad de tipo List
    List<T> arrayList = new ArrayList<>();

    //Definimos constructor
    public GenericAbstractClass(List arrayOfNumbers){
        this.arrayList = arrayOfNumbers;
    }

    //Definimos metodo de multiplica numeros
    public T productOperation(int index1, int index2){
        if (arrayList.get(index1)instanceof Integer &&
        arrayList.get(index2)instanceof Integer){
            Integer valor1Parsed = Integer.parseInt(String.valueOf(arrayList.get(index1)));
            Integer valor2Parsed = Integer.parseInt(String.valueOf(arrayList.get(index2)));
            Integer productResult = valor1Parsed*valor2Parsed;
            return (T) productResult;
        }
        if (arrayList.get(index1)instanceof Long &&
                arrayList.get(index2)instanceof Long){
            Long valor1Parsed = Long.parseLong(String.valueOf(arrayList.get(index1)));
            Long valor2Parsed = Long.parseLong(String.valueOf(arrayList.get(index2)));
            Long productResult = valor1Parsed*valor2Parsed;
            return (T) productResult;
        }
        if (arrayList.get(index1)instanceof Double &&
                arrayList.get(index2)instanceof Double){
            Double valor1Parsed = Double.parseDouble(String.valueOf(arrayList.get(index1)));
            Double valor2Parsed = Double.parseDouble(String.valueOf(arrayList.get(index2)));
            Double productResult = valor1Parsed*valor2Parsed;
            return (T) productResult;
        }
        if (arrayList.get(index1)instanceof Float &&
                arrayList.get(index2)instanceof Float){
            Float valor1Parsed = Float.parseFloat(String.valueOf(arrayList.get(index1)));
            Float valor2Parsed = Float.parseFloat(String.valueOf(arrayList.get(index2)));
            Float productResult = valor1Parsed*valor2Parsed;
            return (T) productResult;
        }else {
            return (T)"No se pueden multiplicar Strings";
        }
    }
}
