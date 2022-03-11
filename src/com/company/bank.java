package com.company;

import java.util.Scanner;

public class bank {
    Scanner in = new Scanner(System.in);
    float n;
    float p;
    float g;

    public int loan() {
        System.out.println("select type of loan:");
        System.out.println("\n1.Personal loan\t2.housing loan\t3.educational loan\t4.gold loan");
        int lt = in.nextInt();
        return lt;
    }

    public void input() {
        System.out.println("Enter Loan Amount and Duration(in months)");
        System.out.println("Loan Amount:");
        p = in.nextFloat();
        System.out.println("Loan Tenure(in Months:");
        n = in.nextFloat();
    }

    public void education() {
        System.out.println("Education Loan");
        System.out.println("Enter Loan Amount ");
        System.out.println("Loan Amount:");
        p = in.nextFloat();
        System.out.println("Loan Tenure id 4 years:");
        n = 48F;
    }

    public float calintrest(float r) {

        float x = (r / 12);
        float y = (x / 100);
        float c = y;

        float pow = 1.0F;
        y = 1 + y;
        for (int i = 0; i < n; i++) {
            pow *= y;
        }
        float interest = p * c * (pow / (pow - 1));

        return interest;
    }

    public void goldinput() {
        System.out.println("Enter Loan Amount and Duration(in months)");
        System.out.println(" Amount of Gold in grams:");
        g = in.nextFloat();
        System.out.println("today's price is  Rs:3939 for a gram");
        System.out.println("Loan Tenure (in Months max of 36 months):");
        n = in.nextFloat();
        System.out.println("Rate of Interest is 7");
        p = 3939 * g;
    }

}

class sbi extends bank {

    sbi() {

        System.out.println("Welcome to SBI");
        int lt = loan();
        System.out.println("selected Loan type is:" + lt);
        switch (lt) {
            case 1:     //personal loan
                personal();
                break;
            case 2:
                home();
                break;
            case 3:
                edu();
                break;
            case 4:
                gold();
                break;
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
        float r = 7.0F;
        float interest = calintrest(r);
        System.out.println("\nEducation Loan EMI Is:" + interest + "for a time span of " + n + " months ");
        System.out.println("\nTotal Amount Payable is:" + interest * n);
        return 0;
    }

    public float gold() {

        goldinput();
        float r = 7.0F;
        float interest = calintrest(r);
        System.out.println("\nGold Loan EMI Is:" + interest + " for a time span of " + n + " \tmonths ");
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
            case 1:     //personal loan
                personal();
                break;
            case 2:
                home();
                break;
            case 3:
                edu();
                break;
            case 4:
                gold();
                break;
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
            case 1:     //personal loan
                personal();
                break;
            case 2:
                home();
                break;
            case 3:
                edu();
                break;
            case 4:
                gold();
                break;
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
            case 1:     //personal loan
                personal();
                break;
            case 2:
                home();
                break;
            case 3:
                edu();
                break;
            case 4:
                gold();
                break;
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
