package ru.mirea.lab2.ex4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Vvedite razmer shopa");
        int size = sc.nextInt();

        Shop shop = new Shop(size);

        System.out.format("Vvedite %d tovarov\n", size);
        sc.nextLine();

        for(int i = 0; i < size; i++){
            shop.setUnit(i, sc.nextLine());
        }

        System.out.println("Kakoy tovar nuzhno naiti");
        String search = sc.nextLine();
        int res = shop.findUnit(search);

        if(res == -1){
            System.out.println("netu");
        } else {
            System.out.println(search + " na pozicii " + res);
        }
        System.out.println(shop);
    }
}
