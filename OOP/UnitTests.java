package com.javacourse.OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTests{
    ProcessorX86 prX86 = new ProcessorX86(1.2,6,32);
    ProcessorArm prArm = new ProcessorArm(3.8,8,64);
    String [] array = new String[]{"101", "100", "102", "104", "108"};
    Memory memory = new Memory(array);
    String [] array1 = new String[]{"101", "100", "102", "104", null};
    Memory memory1 = new Memory(array1);
    Device device = new Device(new ProcessorArm(2.84,3,32), new Memory(new String[6]));
    Device device1 = new Device(new ProcessorX86(1.5,4,64), new Memory(new String[4]));



    @Test
    public void test_getDetails_ProcessorX86(){
        String actual = prX86.getDetails();
        String expected = "Частота процессора: 1.2 GHz, кэш: 6.0 Mb, разрядность: 32-bit, architecture: X86";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_dataProcessString_ProcessorX86(){
        String actual = prX86.dataProcess("intelcore");
        String expected = "PROCESSOR IS USED ON ARCHITECTURE X86 INTELCORE";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_dataProcessLong_ProcessorX86(){
        String actual = prX86.dataProcess(657383756L);
        String expected = "PROCESSOR IS USED ON ARCHITECTURE X86 657383756";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_getDetails_ProcessorArm(){
        String actual = prArm.getDetails();
        String expected = "Частота процессора: 3.8 GHz, кэш: 8.0 Mb, разрядность: 64-bit, architecture: ARM";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_dataProcessString_ProcessorArm(){
        String actual = prArm.dataProcess("INTELinside");
        String expected = "processor is used on architecture arm intelinside";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_dataProcessLong_ProcessorArm(){
        String actual = prArm.dataProcess(657383756L);
        String expected = "processor is used on architecture arm 657383756";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_readLast_Memory(){
        String actual = memory.readLast();
        String expected = "108";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_removeLast_Memory() {
        String actual = memory.removeLast();
        String expected = "108";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_saveFalse_Memory() {
        boolean actual = memory.save("111");
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_saveTrue_Memory() {
        boolean actual = memory1.save("113");
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_save_Device() {
        device.save(new String[]{"104", "108"});
        String [] memoryCell = new String[]{null, null, null, null, "108","104"};
        Assertions.assertArrayEquals(memoryCell, device.getMemory().getMemoryCell());
    }

    @Test
    public void test_readAll_Device() {
        device.save(new String[]{"101", "100", "102"});
        String [] memoryCell = new String[]{null, null, null, "102", "100","101"};
        String[] expected = memoryCell;
        String[] actual = device.readAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_dataProcessing_Device() {
        device1.save(new String[]{"100", "102", "104", "108"});
        device1.dataProcessing();
        String [] memoryCell = new String[]{"108__converted", "104__converted", "102__converted", "100__converted"};
        Assertions.assertArrayEquals(memoryCell, device1.getMemory().getMemoryCell());
    }

    @Test
    public void test_getSystemInfo_Device() {
        device.getSystemInfo();
        String expected = "MemoryInfo{totalMemory=6, occupiedMemory=0.0} Частота процессора: 2.84 GHz, кэш: 3.0 Mb, разрядность: 32-bit, architecture: ARM";
        String actual = device.getSystemInfo();
        Assertions.assertEquals(actual, expected);
    }
}
