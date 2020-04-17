/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1404;

import util.MyToys;

/**
 *
 * @author Nat
 */
public class SE1404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MyToys.cF(5)); //expect 120
        System.out.println("6! = " + MyToys.cF(6)); //expect 720
//        System.out.println("0! = " + MyToys.cF(0)); //expect 1
//        System.out.println("-5! = " + MyToys.cF(-5)); //expect Exception
    }
    
}


//Conclusion: Manually Clean & Build + have ant run Test -> require man-power
//=> Automatic method: 
//  Dev push code to Git Server
//  a tool will watch Git, if change happens
//  take new code to a local computer
//  call ant
//  run test, if return GREEN -> create /.jar/ file
//  Thus, if Dev push code up, ant return RED, won't be accepted, until ant return GREEN
//  CI/ continuous Integration
//  This tool is Jenkins, TeamCity,...

//next step: config Jenkins to work with Git
//                             work with ant to Clean & Build
//                             work with JDK to ...
//                             work with Gmail to sen confirm mail
//           create jobs/ : build-app schedule