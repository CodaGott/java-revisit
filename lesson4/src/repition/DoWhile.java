package repition;

public class DoWhile {
    public static void main(String[] args) {

        //TODO:::>>> Logical operators. (&&,   &,    ||,   |,   !)
        int i = 1;

        do {
            System.out.println("This must run!");
            i++;
        }
        while (i < 0);
        System.out.println("I is " + i);

        //TODO: not operator (!)
        // ---changes boolean to the opposite value.---

        boolean b = false;

        boolean result = !b;

        System.out.println("Result is: " +result);

        int e = 9;
        int f = 2;

        boolean result2 = !(e > f);

        System.out.println("Result 2 : "+ result2);

    }
}
