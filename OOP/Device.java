package com.javacourse.OOP;

public class Device {
    private Processor processor;
    private Memory memory;

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Device{" +
                "processor=" + processor.getDetails() +
                ", memory=" + memory.getMemoryInfo() +
                '}';
    }

    public Device(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }


    public void save(String[] data) {
        String[] currentMemoryCell = this.memory.getMemoryCell();
       if (data.length > currentMemoryCell.length) {         throw new IllegalArgumentException();
       }
        for (int i = 0; i < currentMemoryCell.length && i < data.length; i++) {
            this.memory.save(data[i]);
        }
    }

    public String[] readAll() {
        String[] result = new String[this.memory.getMemoryCell().length];
        String[] currentMemoryCell = this.memory.getMemoryCell();
        for (int i = 0; i < currentMemoryCell.length; i++) {
            result[i] = currentMemoryCell[i];
        }
        this.memory.clearMemoryCell();
        return result;
    }

    public void dataProcessing() {
        String[] currentMemoryCell = this.memory.getMemoryCell();
        for (int i = 0; i < currentMemoryCell.length; i++) {
            if (currentMemoryCell[i] != null) {
                currentMemoryCell[i] = currentMemoryCell[i].concat("__converted");
            }
        }
        this.memory.setMemoryCell(currentMemoryCell);
    }

    public int getTotalMemory() {
        return this.memory.getMemoryInfo().getTotalMemory(); }

    public double getOccupiedMemory() { return this.memory.getMemoryInfo().getOccupiedMemory(); }

    public String getSystemInfo() {
        return String.format("%s %s", this.memory.getMemoryInfo(), this.processor.getDetails());
    }


}