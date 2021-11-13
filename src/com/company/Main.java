package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void addElementToList(ArrayList<Integer> list, int lengthOfList) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < lengthOfList; i++) {
            list.add(input.nextInt());
        }
    }

    public static void printElementsFromList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    public static void addElementsToListAndPrint(ArrayList<Integer> list, int lengthOfList) {
        addElementToList(list, lengthOfList);
        printElementsFromList(list);
    }

    public static void main(String[] args) {
// ===================================================================
        ArrayList<String> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Please input number of the students currently attending the course: ");
        int numberOfStudents = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Please input the name of student #" + (i + 1));
            studentList.add(input.next());
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentList.get(i) + " ");
        }

// ===================================================================
        ArrayList<Integer> ageList = new ArrayList<>();
        System.out.println("Please input your ages: ");
        addElementsToListAndPrint(ageList, numberOfStudents);
// ===================================================================
        ArrayList<Integer> yearList = new ArrayList<>();
        System.out.println("Please input your year of birth: ");
        addElementsToListAndPrint(yearList, numberOfStudents);
    }

}
