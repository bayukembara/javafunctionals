package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

       int incre = incrementByOneFunction.apply(2);
       System.out.println(incre);

     }

    static Function<Integer,Integer> incrementByOneFunction = number -> number++;

    static int increment(int number){
        return number + 1;
    }
}
