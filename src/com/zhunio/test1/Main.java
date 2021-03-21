package com.zhunio.test1;

import java.net.CookieManager;
import java.net.CookieStore;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        X x1 = new X();
//        X x2 = new X(5);
        X x3 = new Z();
        X x4 = new Y();
        Y y1 = new Z();
//        Y y2 = new X();
//        Y y3 = (Y) x1;
        Y y4 = (Y) x3;
        Y y5 = (Y) x4;
//        Z z1 = new X();
//        Z z2 = (Z) new Y();
        Z z3 = (Z) x3;

        question5();
        question8();
    }

    public static void question5() {
        // a)
        CookieManager manager = new CookieManager();
        // b)
        CookieStore store = manager.getCookieStore();
        // c)
//        import java.net.CookieManager;
//        import java.net.CookieStore;
    }

    private static void question8() {
        Doctor[] doctors = new Doctor[]{
                new Student("Student1"),
                new Student("Student2"),
                new Student("Student3"),
                new Student("Student4"),
                new Student("Student5"),
                new Student("Student6"),
                new Student("Student7"),
                new Student("Student8"),
                new Student("Student9"),
                new Student("Student10"),
                new Family("Family1"),
                new Family("Family2"),
                new Family("Family3"),
                new Family("Family4"),
                new Family("Family5"),
                new Family("Family6"),
                new Family("Family7"),
                new Family("Family8"),
                new Family("Family9"),
                new Family("Family10"),
                new Surgeon("Surgeon1"),
                new Surgeon("Surgeon2"),
                new Surgeon("Surgeon3"),
                new Surgeon("Surgeon4"),
                new Surgeon("Surgeon5"),
                new Surgeon("Surgeon6"),
                new Surgeon("Surgeon7"),
                new Surgeon("Surgeon8"),
                new Surgeon("Surgeon9"),
                new Surgeon("Surgeon10"),
        };

        var names = getStudentNames(doctors);
        System.out.println(Arrays.toString(names));
    }

    private static String[] getStudentNames(Doctor[] doctors) {
        ArrayList<String> names = new ArrayList<>();

        for (Doctor doctor: doctors) {
            if (doctor instanceof Student) {
                Student student = (Student) doctor;
                names.add(student.getName());
            }
        }

        return names.toArray(new String[]{});
    }

}
