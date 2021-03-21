package com.javacourse.OOP;

import static com.javacourse.OOP.Constant.PROCESSOR_ARCHITECTURE;

public class ProcessorX86 extends Processor {
    private final String ARCHITECTURE = "X86";

    public String getArchitecture() {
        return ARCHITECTURE;
    }

    public ProcessorX86(double frequency, double cache, int bitCapacity) {
        super(frequency, cache, bitCapacity);
    }

    @Override
    public String getDetails() {
        String result = super.getDetails();
        return result + ", architecture: " + ARCHITECTURE;
    }

    @Override
    public String dataProcess(String data) {
        return String.format(PROCESSOR_ARCHITECTURE, ARCHITECTURE, data).toUpperCase();
    }

    @Override
    public String dataProcess(long data) {
        return String.format(PROCESSOR_ARCHITECTURE, ARCHITECTURE, data).toUpperCase();
    }
}
