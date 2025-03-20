/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.intermediatejava10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gavan
 */
public class IntermediateJava10 {

    public static void output(Collection collection) {
        for (var item : collection) {
            System.out.print(item + " ");
        }
        System.out.println("");
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
        System.out.println("Copy of list: ");
        output(listCopy);

        Character[] charArr = new Character[3];
        List<Character> charList = Arrays.asList(charArr);

        // Fill collection with crap.
        Collections.fill(charList, 'X'); // Change all items to 'X'
        System.out.println("Content of charList: ");
        output(charList);
    }
}
