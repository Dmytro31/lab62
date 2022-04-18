package com.company;

public class Main {
    public static void main(String[] args) {
        FirstCourse fc = new FirstCourse(17,1.75, "Dima" );
        System.out.println(fc);
        SecondCourse sc = new SecondCourse(19, 1.83,"Victor" );
        System.out.println(sc);
        ThirdCourse tc = new ThirdCourse(20, 1.85, "Andriy" );
        System.out.println(tc);
    }
}
