package lesson1;

public class Maths {
    public int sum(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }
}
