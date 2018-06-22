package com.data.structure.vector;

public class Application {

    public static void main(String[] args) {
        Student student = new Student("John");
        Student student2 = new Student("David");
        Student student3 = new Student("Smith");

        Vector vector = new Vector();
        vector.add(student);
        vector.add(student2);

        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.contain(student));
        System.out.println(vector.contain(student3));
//        System.out.println(vector.get(1444));

        vector.add(0, new Student("Bob"));
        System.out.println(vector);

//        vector.add(5, new Student("Bob"));
//        System.out.println(vector);

        vector.remove(1);
        System.out.println(vector);

        for (int i=0; i < 300; i++) {
            vector.add(new Student("Bla " + i));
        }
        System.out.println(vector);

    }
}
