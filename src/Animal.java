public class Animal {
    String family;
    String name;
    int age ;
    boolean ismammal;


    public Animal (String family ,String name ,  int age , boolean ismammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.ismammal = ismammal;

    }
    @Override
    public String toString() {
        return "Animal{" + "family=" + family +   ", name=" + name  +
                ", age=" + age + ", isMammal=" + ismammal + '}';
    }
}
