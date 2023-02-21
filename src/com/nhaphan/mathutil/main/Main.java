/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nhaphan.mathutil.main;

import com.nhaphan.mathutil.core.MathUtility;

/**
 *
 * @author PhongNha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalAccessException {
        testFactorialGivenRightArgumentRunWell();
        testFactorialGivenWrongArgumentThrowException();
    }
    
    
    //Thiết kế hàm getF() là : chi tỉnh n! từ 0-20
    //nếu đứa n<0 hoặc n>20 thì ham sẽ ko tinh ném và ra ngoại lệ
    public static void testFactorialGivenWrongArgumentThrowException(){
        //Test case 4: Test getF() n = 19;, wrong argument
        //Expected value: Exception is throw
        int n = 20;
        System.out.println("Test "  + n + " expected =  Exception | actual = ");
        long actualValue = MathUtility.getFactorial(n);
        
    }
    
    //dev phai co trach nhiem test code cua minh dung hay sai
    //truoc khi lap rap no voi class khac
    //co nhieu qua tac dat ten ham cho viec kiem thu ham 
    //thuong ten ham bao ham nhung y nghia cua viec kiem thu 
    // vi dung ham ben duoi test tinh giai thua trong tinh huong
    // case n dung chuan ta hy vong ham chay dung 
    // n = 5 thi tra ve 120
    //tuc 5 ! = 120
    public static void testFactorialGivenRightArgumentRunWell() throws IllegalAccessException{
        //Test case 1
        //Expected value = 1 hy vong  n = 0 vao thi ham tra ve 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);       
        System.out.println("Test "  + n + " expected = " + expectedValue + " | actual = " + actualValue);
    
        //Test case 2: Test getFactorial with n = 1
        //Expected value = 1 hy vong ham tra ve 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test "  + n + " expected = " + expectedValue + " | actual = " + actualValue);
        
        //Test case 3: Test getFactorial(3)
        //test value = 3
        n = 3;
        expectedValue = 6;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test "  + n + " expected = " + expectedValue + " | actual = " + actualValue);
    }
    
}
