package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static <T> T[] callUnsafe(T t1, T t2) {
        return unsafe(t1,t2);
    }

    private static <T> T[] unsafe(T ... args) {
        return args;
    }

    public static void main(String[] args) {
        MyClass<String> c1 = new MyClass<String>("Frank") {
            @Override
            void processData() {
                System.out.println("Processing " + getData());
            }
        };
        c1.processData();


        // Allow the diamond operator with anonymous classes
        // if the argument type of the inferred type is denotable

        MyClass<String> c2 = new MyClass<>("James") {
            @Override
            void processData() {
                System.out.println("Processing " + getData());
            }
        };
        c2.processData();

        MyClass<Integer> c3 = new MyClass<>(1000) {
            @Override
            void processData() {
                System.out.println("Processing " + getData());
            }
        };
        c3.processData();

        // Cannot infer the type of a non-denotable type (intersection type)
        //   MyClass<T extends Comparable<T> & Serializable> c4 = new MyClass<> {}
    }
}
