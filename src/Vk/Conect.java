package Vk;

import java.util.Scanner;

public class Conect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username;
        String password;

        System.out.println("Log in:");
        System.out.println("Indtast username: ");
        username = input.nextLine();

        System.out.println("Indtast password: ");
        password = input.nextLine();

   Login login= new Login("Diva",123);

    }

}

