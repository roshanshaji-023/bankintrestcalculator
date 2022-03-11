package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bank b=new bank();
        Scanner in=new Scanner(System.in);
        System.out.println("--------------Bank Interest Calculator--------------");
        System.out.println("\n Welcome");
        System.out.println("\n Input Your Name:");
        String name=in.nextLine();
        System.out.println("Hello "+name+" Select the Bank ");
        System.out.println("\n!.State Bank of India \t2.South Indian Bank \t3.HDFC Bank \t4.Federal Bank");
        System.out.println("\n Enter your choice(1-4)");
        int choice=in.nextInt();
        switch (choice){
            case 1:
                    bank sbi=new sbi();
                break;
            case 2:
                bank bank1=new sib();
                break;
            case 3:
                bank bank2=new hdfc();
                break;
            case 4:
                bank bank3=new federal();
                break;

            default:
                System.out.println("enter a valid choice:");
                break;


        }
    }
}
