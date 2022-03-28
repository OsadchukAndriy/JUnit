package lesson1;

import lesson1.Maths;

public class Program {
    public static void main(String[] args) {
        Maths maths = new Maths();
        int sum  = maths.sum(5);
        System.out.println("Sum : " + sum);
    }
}
