package com.epam.rd.autotasks;

public class CarouselRun {

    protected final int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;

    public int next() {
        int beforeDecreasing;
        int decrement=0;
        if (isFinished())

            return -1;
        else {
            beforeDecreasing = array[position];
            array[position] -= decrement;
            do {
                position++;
                if (position == array.length) {
                    decrement++;
                    position = 0;
                }
            } while ((array[position] <= 0) && !isFinished());
        }
        return beforeDecreasing;
    }

    public boolean isFinished() {
        for (int el : array)
            if (el > 0)
                return false;
        return true;
    }

}
