package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int EMPTY = -1;
    private final int FULL = 11;
    private final int NUMBER_SIZE = 12;

    private final int[] numbers = new int[NUMBER_SIZE];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
