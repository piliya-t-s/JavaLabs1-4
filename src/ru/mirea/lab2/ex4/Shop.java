package ru.mirea.lab2.ex4;

import java.util.Arrays;

public class Shop {
    private String[] storage;
    private int size;

    public Shop(int size) {
        this.size = size;
        this.storage = new String[size];
    }

    public int findUnit(String value){
        for(int i = 0; i < this.size; i++){
            if(this.getUnit(i).equals(value)){
                return i;
            }
        }

        return -1;
    }

    public void setUnit(int index, String value){
        if(index < this.size){
            this.storage[index] = value;
        }
    }

    public String getUnit(int index){
        return this.storage[index];
    }

    @Override
    public String toString() {
        return "Shop{" +
                "storage=" + Arrays.toString(storage) +
                ", size=" + size +
                '}';
    }
}
