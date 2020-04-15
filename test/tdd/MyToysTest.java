/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;

/**
 *
 * @author Nat
 */
public class MyToysTest {
    
//    for quality testing
//    for each test functions, need testing datas, expected outputs and test-runs
//    check outputs, compare to expected outputs
//    if wrong: false with testing data OR code
//    use Test Results as output
    
//    test when cF() runs successfully,
//    In nature, each test case is a function
    @Test //turn a function with JUnit into main function
    public void testSuccessfulCases() {
        assertEquals(1, cF(0)); //compare function print GREEN if match, RED if not
        assertEquals(20, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    //in case of Exception, not a comparable value
    //Exceptions are unexpected => can estimate outcome
    // => cannot compare => cannot use assert()
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCase() {
        cF(-5);
        cF(-6);
    }
    
    //Even when test returns RED, Clean & Build with ant still works perfectly, and create /.jar/ file
    //because ant doesn't concern logic errors
    //ant can only do what it's supposed to in /build.xml/ and /build-impl.xml/
    //must tell ant only creates /.jar/ when jUnit return GREEN
    //by modify files at line 1005 in NetBean 8 or line 1204 in NetBean 11
    //add test between compile and -pre-pre-jar -> run test after compile
}
