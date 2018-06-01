package com.example.TryWithResources;


public class Main {

    public static void main(String[] args) {
        // Pre-JDK 7 Example
        System.out.println("\nPre JDK 7");
        System.out.println("---------");
        for (int i = 0; i < 4; i++) {
            preJDK7(i);
            System.out.println("---------");

        }

        // JDK 7 Example with try-with-resources statement
        System.out.println("\nJDK 7");
        System.out.println("---------");
        for (int i = 0; i < 4; i++) {
            jdk7(i);
            System.out.println("---------");

        }

        // JDK 7 Example with try-with-resources statement
        // with suppressed exception handled
        System.out.println("\nJDK 7 - Suppressed ");
        System.out.println("---------");
        for (int i = 0; i < 4; i++) {
            jdk7Suppressed(i);
            System.out.println("---------");
        }

        // JDK 9 Example with try-with-resources
        System.out.println("\nJDK 9");
        System.out.println("---------");
        for (int i = 0; i < 4; i++) {
            jdk9(i);
            System.out.println("---------");
        }
        System.out.println("\nJDK 9 Multiple");
        System.out.println("---------");
        for (int i = 0; i < 4; i++) {
            jdk9Multiple(i);
        }

    }

/*
    Typical code used before JDK 7 introduced the
    try-with-resource statement.
    Notice the finally block a well as the try/catch
    within the finally block.
*/

    public static void preJDK7 (int resID){

        MyResource res = null;

        try {
            res = new MyResource(resID);
            res.process();
        } catch (Exception ex) {
            System.out.println("Handling " +  ex.toString());
        } finally {
            try {
                if (res != null)
                    res.close();
            } catch (Exception ex) {
              //  ex.printStackTrace();
                System.out.println("Handling " + ex.toString());
            }
        }
    }

    /*
     Typical code used since JDK 7.
     Notice the object created in the try statement
     Also, notice the lack of a finally statement.

     The resource must implement AutoCloseable for
     the close method to be called automatically.

     However, notice what happens when an Exception
     occurs BOTH during the usage of the resource
     AND when the close method is called.
     */


    public static void jdk7 (int resID){
        try (MyResource res = new MyResource(resID)){
            res.process();
        } catch (Exception ex) {
           // ex.printStackTrace();
            System.out.println("Handling " + ex.toString());
        }
    }

    /*
        This example handles the suppressed exception that
        is thrown when BOTH the usage of the resource
        AND the close method throw exceptions
     */

    public static void jdk7Suppressed (int resID){
        try (MyResource res = new MyResource(resID)){
            res.process();
        } catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println("Handling " + ex.toString());
            int numSuppressed = ex.getSuppressed().length;
            for (int i = 0; i < numSuppressed; i++) {
                System.out.println("Handling suppressed " + ex.getSuppressed()[i].toString());
            }
        }
    }

    /*  The JDK9 example shows that the resource can be
        instantiated outside the try block. However, it must
        be final OR effectively final for this to compile.
        This is because the compiler MUST be sure about
        which close method to call.
     */

    public static void jdk9(int resID) {
        MyResource res = new MyResource(resID);
        try (res) {
            res.process();
            // If we create a new res object
            // then it is no longer effectively final
            // and will result in a compiler error
            //
            // If you remove the comment from the line
            // below you will see the error

            // res = new MyResource(0);

        } catch (Exception ex) {
//            ex.printStackTrace();
            System.out.println("Handling " + ex.toString());

        }
    }

    /*
       This is another JDK9 example showing
       how you can use several resources in the try block.
       In this case 2 are instantiated outside the block and
       one inside the block
    */

    public static void jdk9Multiple(int resID) {
        MyResource res = new MyResource(resID);
        MyResource res2 = new MyResource(resID);
        try (res; res2; final MyResource res3 = new MyResource(resID)) {
            res.process();
            res2.process();
            res3.process();
        } catch (Exception ex) {
         //   ex.printStackTrace();
            System.out.println("Handling " + ex.toString());

        }
    }


    /*

    try {
        Create the resource
        use the resource
    } catch (SomeException e) {
        Handle e
    } finally {
        if resource != null {
           try {
                close the resource
           } catch (SomeOtherException e) {
        }
    }
     */

        /* Note the resource is created in the statement
          if the resourse Implements AutoCloseable then the close
          method of the resource will be called automatically.
          There is not need for a finally block!

          But what if the exception is thrown in the close method?
          Then the exception is suppressed

    try (create the resource) {
        use the resource
    } catch (SomeException e) {
        Handle e
    }
     */



}
