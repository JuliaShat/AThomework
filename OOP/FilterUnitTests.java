package com.javacourse.OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterUnitTests {
    private List<Device> listOfDevices = new ArrayList<>();

    Device myComputer1 = new Device(new ProcessorArm(3.8,8,64), new Memory(new String[8]));
    Device myComputer2 = new Device(new ProcessorArm(4.5,9,64), new Memory(new String[9]));
    Device myComputer3 = new Device(new ProcessorArm(4.5,9,64), new Memory(new String[9]));
    Device myComputer4 = new Device(new ProcessorArm(3.8,8,64), new Memory(new String[8]));
    Device iphone9 = new Device(new ProcessorArm(1.7,5,32), new Memory(new String[5]));
    Device samsungS10 = new Device(new ProcessorX86(1.2,6,32), new Memory(new String[6]));
    Device samsungS20 = new Device(new ProcessorX86(1.5,4,32), new Memory(new String[4]));
    Device samsungA7 = new Device(new ProcessorX86(1.2,5,32), new Memory(new String[5]));
    Device samsungA8 = new Device(new ProcessorX86(1.5,4,32), new Memory(new String[4]));
    Device iphone10 = new Device(new ProcessorX86(1.7,3,32), new Memory(new String[3]));

    String [] data = {"100", "102", "104", "108"};
    String [] data1 = {"100", "102", "104", "108", "110", "111"};

    Device [] devices = new Device[]{myComputer1, myComputer2, myComputer3, myComputer4, iphone9, iphone10, samsungS10, samsungS20, samsungA7, samsungA8};

@Test
    public void test_filtrateByArchitecture(){
    List<Device> expected = new ArrayList<>();
    expected.add(myComputer1);
    expected.add(myComputer2);
    expected.add(myComputer3);
    expected.add(myComputer4);
    expected.add(iphone9);
    List<Device> actual = Filter.filtrateByArchitecture(devices, "ARM");
    Assertions.assertEquals(expected, actual);
}

    @Test
    public void test_filtrateByCash(){
        List<Device> expected = new ArrayList<>();
        expected.add(myComputer2);
        expected.add(myComputer3);
        List<Device> actual = Filter.filtrateByCash(devices, 9);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_filtrateByFrequency() {
        List<Device> expected = new ArrayList<>();
        expected.add(myComputer1);
        expected.add(myComputer4);
        List<Device> actual = Filter.filtrateByFrequency(devices, 3.8);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test_filtrateByBitCapacity(){
        List<Device> expected = new ArrayList<>();
        expected.add(myComputer1);
        expected.add(myComputer2);
        expected.add(myComputer3);
        expected.add(myComputer4);
        List<Device> actual = Filter.filtrateByBitCapacity(devices, 64);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_filtrateByTotalMemoryMoreThan(){
        List<Device> expected = new ArrayList<>();
        expected.add(myComputer1);
        expected.add(myComputer2);
        expected.add(myComputer3);
        expected.add(myComputer4);
        List<Device> actual = Filter.filtrateByTotalMemoryMoreThan(devices, 6);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_filtrateByTotalMemoryLesserThan(){
        List<Device> expected = new ArrayList<>();
        expected.add(iphone10);
        List<Device> actual = Filter.filtrateByTotalMemoryLesserThan (devices, 4);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test_filtrateByOccupiedMemoryLesserThan() {
        List<Device> expected = new ArrayList<>();
        myComputer1.save(data);
        myComputer2.save(data1);
        expected.add(myComputer3);
        expected.add(myComputer4);
        expected.add(iphone9);
        expected.add(samsungS10);
        expected.add(samsungS20);
        expected.add(samsungA7);
        expected.add(samsungA8);
        expected.add(iphone10);
        List<Device> actual = Filter.filtrateByOccupiedMemoryLesserThan(devices, 20.0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_filtrateByOccupiedMemoryMoreThan() {
        List<Device> expected = new ArrayList<>();
        myComputer1.save(data);
        myComputer2.save(data1);
        expected.add(myComputer1);
        expected.add(myComputer2);
        List<Device> actual = Filter.filtrateByOccupiedMemoryMoreThan(devices, 40.5);
        Assertions.assertEquals(expected, actual);
    }

}
