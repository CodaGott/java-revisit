package repition;

public class Example {

    public static void main(String[] args) {
        var i = 1;

        var s = "Hello";

//        while (true){
//            System.out.println(i);
//            i++;
//            if (i == 11){
//                break;
//            }
//        }
//        System.out.println("THE END!!!");

        while (i < 10){
            i++;
            if (i % 2 == 0){
                System.out.println(i + " is an even number");
            }
        }
    }
}
