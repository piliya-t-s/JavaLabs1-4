package ru.mirea.lab2.ex5d;

import java.util.*;

public class DogNursery {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Vvedite razmer pitomnika");
        int size = sc.nextInt();

        Dog[] dogs = new Dog[size];

        System.out.format("Vvedite %d sobak\n", size);
        sc.nextLine();

        String name;
        float age;

        for(int i = 0; i < size; i++){
            System.out.println("Vvedite klichku sobaki " + (i+1));
            name = sc.nextLine();
            System.out.println("Vvedite vozrast sobaki " + (i+1));
            age = sc.nextInt();
            dogs[i] = new Dog(age, name);
            sc.nextLine();
        }

        System.out.println(Arrays.toString(dogs));
    }
}
