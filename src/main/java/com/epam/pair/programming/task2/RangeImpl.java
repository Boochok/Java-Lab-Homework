package com.epam.pair.programming.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RangeImpl implements Range {
    private long low;
    private long up;

    public RangeImpl(long low, long up) {
        this.low = low;
        this.up = up;
    }

    @Override
    public boolean isBefore(Range otherRange) {
        if (this.up < otherRange.getLowerBound()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAfter(Range otherRange) {
        if (this.low > otherRange.getUpperBound()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isConcurrent(Range otherRange) {
        if (this.up == otherRange.getUpperBound() && this.low == otherRange.getLowerBound()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public long getLowerBound() {
        return this.low;
    }

    @Override
    public long getUpperBound() {
        return this.up;
    }

    @Override
    public boolean contains(long value) {
        if (value <= this.up && value >= this.low) {
            return true;
        } else {
            return false;
        }
    }

    List<Long> longs = new ArrayList<>();
    @Override
    public List<Long> asList() {
        for (long i = this.low; i <= this.up; i++) {
            longs.add(i);
        }
        return longs;
    }

    @Override
    public Iterator<Long> asIterator() {
        return longs.iterator();
    }
}
