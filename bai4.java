package com.example.kiemthunangcao.test;

public class bai4 {

    public double average(int[] numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("Array cannot be empty");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
