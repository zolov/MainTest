package com.skaii;

import java.util.Scanner;

/**
 * WhatIsSqr.
 *
 * @author Igor_Zolov
 */
public class WhatIsSqr {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (true) {
            if (reader.hasNextInt()) {
                int number = reader.nextInt();
                System.out.println("Вы ввели: " + number);
                break;
            } else {
                System.out.println("____");
                break;
            }
        }
    }
}
