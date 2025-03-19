/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.intermediatejava10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gavan
 */
public class IntermediateJava10 {

    public static void output(List list) {
        for (var item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Create array and convert to list.
        Character[] ray = {'a', 'w', 'e'};

        List<Character> list = Arrays.asList(ray);

        System.out.println("List is: ");
        output(list);

        // Reverse and print the lsit.
        Collections.reverse(list);
        System.out.println("After reverse: ");
        output(list);

        // Create new array and list.
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        // Copy contents of list into listCopy
        Collections.copy(listCopy, list);
    }
}
