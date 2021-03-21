package com.javacourse.OOP;

import static com.javacourse.OOP.Constant.PROCESSOR_INFO;

public abstract class Processor {
    private double frequency;
    private double cache;
    private int bitCapacity;

    public Processor (double frequency, double cache, int bitCapacity) {
        this.frequency = frequency;
        this.cache = cache;
        this.bitCapacity = bitCapacity;
    }

    public double getCache() {
        return cache;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getBitCapacity() {
        return bitCapacity;
    }

    public abstract String dataProcess(String data);

    public abstract String dataProcess(long data);

    public String getDetails() {
        return String.format(PROCESSOR_INFO, frequency, cache, bitCapacity);
    }

    public abstract String getArchitecture();


}
