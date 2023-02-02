package com.epam.rd.autotasks;
public class GraduallyDecreasingCarouselRun extends CarouselRun {
    int decrement = 1;

    @Override
    public int next() {
        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
                if (position == array.length) {
                    decrement++;
                }
            }
        }
        beforeDecreasing = array[position];
        array[position++] -= decrement;
        return beforeDecreasing;
    }
}
