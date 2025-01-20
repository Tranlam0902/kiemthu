package com.example.kiemthunangcao.buoi2;

public class bai2 {
    public  int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
