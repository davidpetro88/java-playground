package com.data.structure.stack.ex2;

import java.util.Stack;

public class Application {

    public static void main(String[] args) {
        Stack stackUtil = new Stack();

        System.out.println(stackUtil.isEmpty());

        stackUtil.push("Smith");
        System.out.println(stackUtil);

        stackUtil.push("David");
        System.out.println(stackUtil);

        stackUtil.push("Sebastian");
        System.out.println(stackUtil);

        stackUtil.push("Arnold");
        System.out.println(stackUtil);

        System.out.println("Remove : " + stackUtil.pop());
        System.out.println(stackUtil);

        System.out.println(stackUtil.isEmpty());

        System.out.println("Peek : " + stackUtil.peek());
        System.out.println(stackUtil);
    }
}
