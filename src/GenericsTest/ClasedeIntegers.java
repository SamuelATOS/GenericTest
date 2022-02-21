package GenericsTest;

import java.util.List;

//Creamos una clase que herede el metodo multiplicar pero que solo trabaje con Integers
public class ClasedeIntegers extends GenericAbstractClass<Integer> {
    //Definimos el constructor
    public ClasedeIntegers(List arrayOfNumbers) {
        super(arrayOfNumbers);
    }
}
