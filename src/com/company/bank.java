package com.company;

import java.util.Scanner;

public class bank {                                             //parent class
    Scanner in = new Scanner(System.in);
    float n;
    float p;
    float g;

    public int loan() {                                         //method to print and input kind of loan from user
        System.out.println("\nselect type of loan:");
        System.out.println("\n1.Personal loan\t2.housing loan\t3.educational loan\t4.gold loan");
        System.out.println("-------------------------------------------------------------------");
        return in.nextInt();                                             //returns the value to the respective bank class
    }

    public void input() {                                       //method for inputting data for loans ->personal and home for each bank class
        System.out.println("\nEnter Loan Amount and Duration(in months)");
        System.out.println("\nLoan Amount:");
        p = in.nextFloat();
        System.out.println("Loan Tenure(in Months):");
        n = in.nextFloat();
        System.out.println("-------------------------------------------------------------------");
    }

    public void education() {                                     //method for inputting data for education loan
        System.out.println("Education Loan");
        System.out.println("Enter Loan Amount ");
        System.out.println("Loan Amount:");
        p = in.nextFloat();
        System.out.println("Loan Tenure is 4 years:");
        n = 48F;
        System.out.println("-------------------------------------------------------------------");
    }

    public float calintrest(float r) {                          //method to calculate simple interest

        float x = (r / 12);
        float y = (x / 100);
        float c = y;

        float pow = 1.0F;
        y = 1 + y;
        for (int i = 0; i < n; i++) {
            pow *= y;
        }

        return p * c * (pow / (pow - 1));
    }

    public void goldinput() {                                   //method for inputting data for gold Loan

        System.out.println("\nAmount of Gold in grams:");
        g = in.nextFloat();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\nToday's price is  Rs:3939 for a gram");
        System.out.println("\nLoan Tenure (in Months max of 36 months):");
        n = in.nextFloat();
        System.out.println("Rate of Interest is 7");
        System.out.println("-------------------------------------------------------------------");
        p = 3939 * g;       //principal amount

    }

}

class sbi extends bank {

    sbi() {

        System.out.println("Welcome to SBI");
        int lt = loan();
        System.out.println("selected Loan type is:" + lt);
        switch (lt) {
            case 1 -> personal();
            case 2 -> home();
            case 3 -> edu();
            case 4 -> gold();
        }
    }

    public float personal() {

        input();                    //call to input method in parent class
        System.out.println("Rate of Interest:(9.0-15.0)");
        float r = in.nextFloat();
        float interest = calintrest(r);     //call to method for interest calculation
        System.out.println("\nEMI Is:" + interest + "for a time span of " + n + "months");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float home() {
        input();                        //call to input method in parent class
        System.out.println("Rate of Interest is 7.5");
        float r = 7.5F;
        float interest = calintrest(r);              //call to method for interest calculation
        System.out.println("\nHome Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float edu() {

        education();                                     //call to input method in parent class
        System.out.println("Rate of Interest is 7.0");
        float r = 7.0F;
        float interest = calintrest(r);                //call to method for interest calculation
        System.out.println("\nEducation Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);

        return 0;
    }

    public float gold() {

        goldinput();                              //call to input method in parent class
        float r = 7.0F;
        float interest = calintrest(r);              //call to method for interest calculation
        System.out.println("\nGold Loan EMI Is:" + interest + " for a time span of " + n + "\tmonths ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);

        return 0;
    }


}


class sib extends bank {
    sib() {

        System.out.println("Welcome to SIB");
        int lt = loan();
        System.out.println("selected Loan type is:" + lt);
        switch (lt) {
            case 1 ->     //personal loan
                    personal();
            case 2 -> home();
            case 3 -> edu();
            case 4 -> gold();
        }
    }

    public float personal() {

        input();
        System.out.println("Rate of Interest:(9.0-15.0)");
        float r = in.nextFloat();
        float interest = calintrest(r);
        System.out.println("\nEMI Is:" + interest + "for a time span of " + n + "months");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float home() {

        input();
        System.out.println("Rate of Interest is 7.5");
        float r = 7.5F;
        float interest = calintrest(r);
        System.out.println("\nHome Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float edu() {

        education();
        System.out.println("Rate of Interest is 6.0");
        float r = 6.0F;
        float interest = calintrest(r);
        System.out.println("\nEducation Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float gold() {

        goldinput();
        float r = 7.25F;
        float interest = calintrest(r);
        System.out.println("\nGold Loan EMI Is:" + interest + " for a time span of " + n + " \tmonths ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }


}

class hdfc extends bank {
    hdfc() {

        System.out.println("Welcome to HDFC Bank ");
        int lt = loan();
        System.out.println("selected Loan type is:" + lt);
        switch (lt) {
            case 1 ->     //personal loan
                    personal();
            case 2 -> home();
            case 3 -> edu();
            case 4 -> gold();
        }
    }

    public float personal() {

        input();
        System.out.println("Rate of Interest:(9.0-15.0)");
        float r = in.nextFloat();
        float interest = calintrest(r);
        System.out.println("\nEMI Is:" + interest + "for a time span of " + n + "months");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float home() {

        input();
        System.out.println("Rate of Interest is 7.5");
        float r = 7.5F;
        float interest = calintrest(r);
        System.out.println("\nHome Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float edu() {

        education();
        System.out.println("Rate of Interest is 7.0");
        float r = 7.2F;
        float interest = calintrest(r);
        System.out.println("\nEducation Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float gold() {
        goldinput();
        float r = 7.750F;
        float interest = calintrest(r);
        System.out.println("\nGold Loan EMI Is:" + interest + " for a time span of " + n + " \tmonths ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }


}

class federal extends bank {
    federal() {

        System.out.println("Welcome to Federal Bank Of India");
        int lt = loan();
        System.out.println("selected Loan type is:" + lt);
        switch (lt) {
            case 1 ->     //personal loan
                    personal();
            case 2 -> home();
            case 3 -> edu();
            case 4 -> gold();
        }
    }

    public float personal() {

        input();
        System.out.println("Rate of Interest:(9.0-15.0)");
        float r = in.nextFloat();
        float interest = calintrest(r);
        System.out.println("\nEMI Is:" + interest + "for a time span of " + n + "months");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float home() {

        input();
        System.out.println("Rate of Interest is 7.5");
        float r = 7.5F;
        float interest = calintrest(r);
        System.out.println("\nHome Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float edu() {


        education();
        System.out.println("Rate of Interest is 7.0");
        float r = 6.9F;
        float interest = calintrest(r);
        System.out.println("\nEducation Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float gold() {

        goldinput();
        float r = 8.50F;
        float interest = calintrest(r);
        System.out.println("\nGold Loan EMI Is:" + interest + " for a time span of " + n + " \tmonths ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }


}
