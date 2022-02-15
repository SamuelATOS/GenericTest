package Test;

public class Naming {
    protected String name;
    int age;

    public Naming(int age) {
        this.age = age;
    }

    public Naming(String name){
        this.name = name;
    }

   /* public void setName(String name){
        // this.name refers to the class field thus object name
        //while = name refers to name of parameter that is passed in
        this.name = name;
    }
    public String getName(){
        return name;
    }

*/
}
