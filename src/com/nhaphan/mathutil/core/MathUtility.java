/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhaphan.mathutil.core;

/**
 *
 * @author PhongNha
 */
public class MathUtility {

    public static final double PI = 3.145;

    //hàm tính n giai thừa 1*2*3*...*N
    //trong do khong co giai thua am
    // 0! =1! = 1 qua uoc 0! = 1
    //vi giai thua tang gia tri rát nhanh 20! vua du cho kieu long 21! vuot qua
    // QUY UOC hàm nay tinh tu 0 - 20
    //co 2 cach viet ham nay viet for truyen thong va de quy recurtion
    public static final long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        if(n == 0 || n == 1)
            return 1;
        // sống sót đến giai đoạn này là n từ 2..20
        long product = 1;// biến khởi động cho tích nhân dồn
        for (int i = 2; i <=n; i++) 
            product *= i;
        
        return product;     
    }

}
