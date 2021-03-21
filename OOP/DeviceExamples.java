package com.javacourse.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeviceExamples {
    private List<Device> listOfDevices = new ArrayList<>();

    Device myComputer1 = new Device(new ProcessorArm(3.8,8,64), new Memory(new String[8]));
    Device myComputer2 = new Device(new ProcessorArm(2.6,9,64), new Memory(new String[9]));
    Device myComputer3 = new Device(new ProcessorArm(4.5,9,64), new Memory(new String[9]));
    Device myComputer4 = new Device(new ProcessorArm(3.8,8,64), new Memory(new String[8]));
    Device iphone9 = new Device(new ProcessorArm(1.7,5,32), new Memory(new String[5]));
    Device samsungS10 = new Device(new ProcessorX86(1.2,6,32), new Memory(new String[6]));
    Device samsungS20 = new Device(new ProcessorX86(1.5,4,32), new Memory(new String[4]));
    Device samsungA7 = new Device(new ProcessorX86(1.2,5,32), new Memory(new String[5]));
    Device samsungA8 = new Device(new ProcessorX86(1.5,4,32), new Memory(new String[4]));
    Device iphone10 = new Device(new ProcessorX86(1.7,3,32), new Memory(new String[3]));

    Device [] devices = new Device[]{myComputer1, myComputer2, myComputer3, myComputer4, iphone9, iphone10, samsungS10, samsungS20, samsungA7, samsungA8};

}
