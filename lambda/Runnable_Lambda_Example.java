package io.dowlath.javahidden.lambda;

/*
    Lambda is the function ( ie without name for the function )
    Its called ananymous function.

    () -> Single statement or Expression ; // Curly braces are not needed.

    () -> {
           <Multiple Statements>
          }   // If multiple statements curly braces are needed.
*/
public class Runnable_Lambda_Example {
    public static void main(String[] args) {
        // before  java 8 ( ie < 1.8 )
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside - Runnable - Example - 1");
            }
        };

        new Thread(runnable).start();

        // after  java 8 ( ie >= 1.8 )

        /* Lambda

           parameters     arrow      lambda body
              ()           ->            { }
        */
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnale Lambda Example - 2 ");
        };

        // with out curly braces....
        Runnable runnableLambda_withoutCurlyBraces = () -> System.out.println("w/o-cb Lambda Example - 2 ");

        new Thread(runnableLambda).start();

        new Thread(runnableLambda_withoutCurlyBraces).start();

        // One line function

        new Thread( () -> System.out.println("Inside Thread one line function")).start();
    }
}
