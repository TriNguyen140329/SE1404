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
        System.out.println("0! = " + MyToys.cF(0)); //expect 1
        System.out.println("-5! = " + MyToys.cF(-5)); //expect Exception
    }
    
}
