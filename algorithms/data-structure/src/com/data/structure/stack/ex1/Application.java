package com.data.structure.stack.ex1;

public class Application {

    public static void main(String[] args) {
        System.out.println("First In is Last Out");
        Stack stackCustom = new Stack();

        System.out.println(stackCustom.isEmpty());

        stackCustom.push("David");
        System.out.println(stackCustom);

        stackCustom.push("Smith");
        System.out.println(stackCustom);

        stackCustom.push("Sebastian");
        System.out.println(stackCustom);

        stackCustom.push("Arnold");
        System.out.println(stackCustom);

        System.out.println("Remove : " + stackCustom.pop());
        System.out.println(stackCustom);

        System.out.println(stackCustom.isEmpty());

        System.out.println("Remove : " + stackCustom.pop());
        System.out.println(stackCustom);

        System.out.println("Remove : " + stackCustom.pop());
        System.out.println(stackCustom);

        System.out.println("Remove : " + stackCustom.pop());
        System.out.println(stackCustom);
    }
}
