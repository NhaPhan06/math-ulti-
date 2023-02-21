/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nhaphan.mathUtil.core.test;

import com.nhaphan.mathutil.core.MathUtility;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author PhongNha
 */
public class MathUtilityTest {
    
    
    //Kiểm thử ngoại lệ thì sao?
    // tức là hàm getF đc thiết kế rằng nếu đưa n cà chớn
    //thi hàm ném ra ngoại lệ
    //tức getF(-5) ném ra ngoại lệ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowException(){
            //GETF() with wrong n
            MathUtility.getFactorial(-5);
            //neu chi go lenh nay ko thi chi ra exception is throw
            //Ham minh thiet ke thi phai ra mau xanh
            //phai so sanh co ngoai le chua
            //ta can them lenh da co ngoai le chua
            //junit 4 khong dung ham assert de do ngoai le nhung junit 5 thu co
    }
    
    

    @Test
    //trong hàm này sẽ chứa các test case để test getF()
    //với n hop le trong khoang 0-20
    public void testFactorialGivenRightArgumentReturnWell(){
        //Test case 1: 
        //Expected value = 1 hy vong  n = 0 vao thi ham tra ve 1
        int n = 0;
        long expectedValue = 1; 
        long actualValue = MathUtility.getFactorial(n);  
        Assert.assertEquals(expectedValue,actualValue);
        
        //Test case 2: 
        //n = 5 hy vong Expected value = 120  
        Assert.assertEquals(120,MathUtility.getFactorial(5));
        
        //Test case 3: 
        //n = 6 hy vong Expected value = 720  
        Assert.assertEquals(720,MathUtility.getFactorial(6));
        
        //Test case 4: 
        //n = 4 hy vong Expected value = 24 
        Assert.assertEquals(24,MathUtility.getFactorial(4));
    }
}
