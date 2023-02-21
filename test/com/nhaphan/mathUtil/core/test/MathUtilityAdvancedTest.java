/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhaphan.mathUtil.core.test;

import com.nhaphan.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Lhanh
 */
@RunWith(value = Parameterized.class)
/*
Báo với JUnit rằng code trong class này t sẽ tách data và hàm
so sánh riêng biệt vs nhau - Data driven testing 
tách thì phải có kỹ thuật nhồi/ fill data trở lại lệnh so sánh
fill trở lại thông qua biến - biến chứa vuale đc thay đổi
DDT có anh em nương tựa với Parameterized - tham số data
 */
public class MathUtilityAdvancedTest {

// chuẩn bị mảng 2 chiều để chứa data trong các test case
// sẽ dùng
// quy ước mảng phải là static public
    @Parameterized.Parameters
    public static Object[][] initData() {

        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}

        };
     
    }
       // map từng cặp data ở trên vào 2 biến, đẩy 2 biến này vào assertEqual()
    @Parameterized.Parameter(value = 0)// lấy cột 0 của mảng gán vào
    public int n;
    
    @Parameterized.Parameter(value = 1)// lấy cột 1 của mảng gán vào
    public long expected;
    
    // test hoy
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(expected,(long)MathUtility.getFactorial(n));
    }

   
}
