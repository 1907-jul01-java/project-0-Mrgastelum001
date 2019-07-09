package com.revature;

import java.util.Scanner;

public class Accounts{
    double checkings;
    double savings;

    Accounts(double checkings, double savings){
        this.checkings = checkings;
        this.savings = savings;
    }

    void withdraw(String checkingOrSaving){
        double amount;
        
        System.out.println("Enter C for Checking");
        System.out.println("Enter S for Savings");
        if(checkingOrSaving == "C"){
            
            System.out.println("Enter amount you would like to withdraw from checking:");
        }
        else if(checkingOrSaving == "S"){
            System.out.println("Enter amount you would like to withdraw from savings:");
        }
        else{
            System.out.println("Not a valid option");
        }
    }
}