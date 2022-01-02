package wrapperClass;

import object.Student;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {

        byte b = 2;

        Byte bt = new Byte(b);
        System.out.println(bt);

        short s = 7;

        Short sh = new Short(s);
        System.out.println(sh);

        char c = 'a';
        Character ch = new Character('b');

        System.out.println(ch);

        Integer integer = new Integer(4);

        Float fl = new Float(3.4);
        Double db = new Double(4.5);
        Long lg = new Long(1234);

        Boolean bl = new Boolean(true);
        System.out.println(bl);


        int i = new Integer(22);// UnBoxing --> when java converts Wrapper class object to primitive data

        Integer number = 3; // AutoBoxing --> when java converts primitive data to Wrapper class object

        System.out.println(number.toString().concat("random text"));
        Student st = new Student();

        // array
        int[] numbers = {i, number};
        System.out.println(number * 25);
    }
}
