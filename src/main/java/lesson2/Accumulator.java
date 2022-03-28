package lesson2;

public class Accumulator {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void accomulate(int number) {
        counter += number;
    }

}
