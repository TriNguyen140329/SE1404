/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Nat
 */
public class MyToys {
//    class contains useful function for multiple projects
//    so it'll be static
//    cF function: compute Factorial, calculate n!
//    n>=0 & 0!=1 & n<=15
//    for CI/continuous Integration, use Recursion later
    public static long cF(int n) {
        if(n<0 || n>15)
            throw new IllegalArgumentException("n must be between 0 - 15");
//        n=0
        if(n==0)
            return 1;
//        n in 1 - 15
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
