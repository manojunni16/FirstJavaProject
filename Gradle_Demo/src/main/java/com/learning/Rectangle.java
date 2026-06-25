package com.learning;
import java.util.Scanner;


public class Rectangle {
    int length, width;
    public void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = sc.nextInt();
    }


    public int calculate_perimeter() {
        return 2 * (length + width);
    }
    static void main() {
        Rectangle rect = new Rectangle();
        rect.acceptData();
        int perimeter = rect.calculate_perimeter();
        System.out.println("Perimeter of rectangle: " + perimeter);
    }


}
