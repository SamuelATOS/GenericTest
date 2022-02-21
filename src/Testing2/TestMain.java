package Testing2;

public class TestMain {
    public static void main(String[] args) {
        //Naming person = new Naming();
        //person.setName("Samuel");
        //System.out.println(person.getName());
        Naming personName = new Naming("Samuel");
        System.out.println(personName.name);
        Naming personAge = new Naming(4);
        System.out.println(personAge.age);

    }
}
