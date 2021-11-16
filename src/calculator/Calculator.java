package calculator;

public class Calculator {

    int vol;

    public int plus(int x, int y) {
        vol = x + y;
        return vol;
    }

    public int minus(int x, int y) {
        vol = x - y;
        return vol;
    }

    public int divide(int x, int y) {
        vol = x / y;
        return vol;
    }

    public int multiplie(int x, int y) {
        vol = x * y;
        return vol;
    }

}
