package com.javacourse.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Filter {
    public static List<Device> filtrateByArchitecture (Device[] devices, String arch) {
            List<Device> res = new ArrayList<>();
            for (int i = 0; i < devices.length; i++) {
                if (devices[i].getProcessor().getArchitecture().equals(arch)) {
                    res.add(devices[i]);
                }
            }
            return res;
        }

        public static List<Device> filtrateByCash (Device[] devices, double cash) {
            List<Device> res = new ArrayList<>();
            for (int i = 0; i < devices.length; i++) {
                if (devices[i].getProcessor().getCache() == cash) {
                    res.add(devices[i]);
                }
            }
            return res;
        }

    public static List<Device> filtrateByBitCapacity(Device[] devices, double bitCapacity) {
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getProcessor().getBitCapacity() == bitCapacity) {
                res.add(devices[i]);
            }
        }
        return res;
    }

    public static List<Device> filtrateByFrequency(Device[] devices, double frequency) {
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getProcessor().getFrequency() == frequency) {
                res.add(devices[i]);
            }
        }
        return res;
    }

    public static List<Device> filtrateByTotalMemoryMoreThan(Device[] devices, int value) {
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getTotalMemory() > value) {
                res.add(devices[i]);
            }
        }
        return res;
    }

    public static List<Device> filtrateByTotalMemoryLesserThan(Device[] devices, int value) {
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getTotalMemory() < value) {
                res.add(devices[i]);
            }
        }
        return res;
    }

    public static List<Device> filtrateByOccupiedMemoryLesserThan(Device[] devices, double value) {
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getOccupiedMemory() < value) {
                res.add(devices[i]);
            }
        }
        return res;
    }

    public static List<Device> filtrateByOccupiedMemoryMoreThan(Device[] devices, double value) {
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getOccupiedMemory() > value) {
                res.add(devices[i]);
            }
        }
        return res;
    }

}
