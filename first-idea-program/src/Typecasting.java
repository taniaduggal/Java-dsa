import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type conversion
//        float num1 = input.nextInt();
//        float num2 = input.nextInt();
//
//        float sum = num1 + num2;
//        System.out.println(sum);

        //type casting
//      int sum = (int)(67.78f);
//        System.out.println(sum);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
        //257 % 256 = 1
//         System.out.println(b);
//         byte a = 40;
//         byte b = 50;
//         byte c = 100;
//         int d = (a * b) / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'a';
//        System.out.println(number);
//        System.out.println("नमस्ते");
        //java follows unicode
//        System.out.println(3 * 6879.8f);  rules of promotion

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
//        float + int - double = double
        System.out.println((f*b)+" "+(i/c)+" "+" "+(d*s));
        System.out.println(result);


    }
}
