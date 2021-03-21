package com.javacourse.OOP;


import java.util.Arrays;

import static com.javacourse.OOP.Constant.NO_SUCH_ELEMENTS;
import static com.javacourse.OOP.Constant.NULL_MEMORY_EXCEPTION;


public class Memory {
            private String[] memoryCell;
            private final MemoryInfo MEMORY_INFO;
            private final static boolean IS_DEV = true;
            private int size = 0;

            public String[] getMemoryCell() {
                return memoryCell;
            }

            public void setMemoryCell(String[] memoryCell) {
                this.memoryCell = memoryCell;
            }

            public void clearMemoryCell() {
                this.memoryCell = new String[this.memoryCell.length];
                this.size = 0;
                MEMORY_INFO.setOccupiedMemory(0);
            }

            public int getSize() {
                return size;
            }

            public Memory(String[] memoryCell) {
                if (memoryCell == null) {
                    throw new IllegalArgumentException(NULL_MEMORY_EXCEPTION);
                }
                this.memoryCell = memoryCell;
                showMemoryCell();
                this.MEMORY_INFO = new MemoryInfo(memoryCell.length, 0);
            }

            private void showMemoryCell() {
                if (IS_DEV) {
                    System.out.println(Arrays.toString(memoryCell));
                }
            }

            public String readLast() {
                for (int i = memoryCell.length - 1; i >= 0; i--) {
                    if (memoryCell[i] != null) {
                        showMemoryCell();
                        return memoryCell[i];
                    }
                }
                showMemoryCell();
                return NO_SUCH_ELEMENTS;
            }

            public String removeLast() {
                for (int i = memoryCell.length - 1; i >= 0; i--) {
                    if (memoryCell[i] != null) {
                        String removingValue = memoryCell[i];
                        memoryCell[i] = null;
                        size--;
                        showMemoryCell();
                        MEMORY_INFO.setOccupiedMemory(100 * size / MEMORY_INFO.getTotalMemory());
                        return removingValue;
                    }
                }
                showMemoryCell();
                return NO_SUCH_ELEMENTS;
            }

            public boolean save(String value) {
                for (int i = memoryCell.length - 1; i >= 0; i--) {
                    if (memoryCell[i] == null) {
                        memoryCell[i] = value;
                        size++;
                        showMemoryCell();
                        MEMORY_INFO.setOccupiedMemory(100 * size / MEMORY_INFO.getTotalMemory());
                        return true;
                    }
                }
                showMemoryCell();
                return false;
            }

            public MemoryInfo getMemoryInfo() {
                return this.MEMORY_INFO;
            }

            class MemoryInfo {
                private final int totalMemory;
                private double occupiedMemory;

                @Override
                public String toString() {
                    return "MemoryInfo{" +
                            "totalMemory=" + totalMemory +
                            ", occupiedMemory=" + occupiedMemory +
                            '}';
                }

                public MemoryInfo(int totalMemory, double occupiedMemory) {
                    this.totalMemory = totalMemory;
                    this.occupiedMemory = occupiedMemory;
                }

                public void setOccupiedMemory(double occupiedMemory) {
                    this.occupiedMemory = occupiedMemory;
                }

                public int getTotalMemory() {
                    return totalMemory;
                }

                public double getOccupiedMemory() {
                    return occupiedMemory;
                }
            }
        }




