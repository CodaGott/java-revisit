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

        //TODO::: >>> && --- and operator

        // TODO:::>>> with && operator they both have to be true
        //  for the expression to be true.
        //  T && T = true.
        //  T && F = false.
        //  F && F = false.

        boolean b1 = true;
        boolean b2 = false;

        boolean res = b1 && b2;
        System.out.println("Res: " + res);

    }
}
