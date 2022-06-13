package repition;

public class Example2 {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 3);
        Cat tom2 = new Cat("Tom", 3);

    // == != TODO: checks the memory address of the
    // TODO: class instances and not the values associated with them.
     // Todo::: to compare objects the equals() method is used.
    }
}

class Cat{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
