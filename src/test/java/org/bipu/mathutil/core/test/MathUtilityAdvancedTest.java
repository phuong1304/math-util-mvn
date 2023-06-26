/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.bipu.mathutil.core.test;

import static org.bipu.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author bipu
 */
public class MathUtilityAdvancedTest {

    //Hàm trả về mảng 2 chiều gômg nhiều dòng, 2 cột
//    0-> 1
//    1-> 1
//    2-> 2
//    6-> 720
//    mảng 2 chiều, cột 0 là n, cột 1 là exp
//    n  
    public static Object[][] initTestData() {
//        int a[] ={5,10,15,20};
        Object testData[][] = {{0, 1},
        {1, 1},
        {2, 2},
        {4, 24},
        {5, 1200}};

        return testData;
    }

    @ParameterizedTest   //tham số hóa ( em sẽ lấy mảng data để đem xún)
    @MethodSource("initTestData")  //có junit
    public void checkFactorialGivenRightArgumentReturnsWell(int n,long expected) {
                                                           //cột 0    cột 1
        assertEquals(expected, getFactorial(n));

    }

}

//BẮT NGOẠI LỆ: TỨC LÀ HÀM GETF() TRẢ VỀ
//NGOẠI LỆ KHI ĐƯA N CÀ CHỚN -1,-2,N > 20
//JUNIT ĐƯA RA HÀM MỚI, AssertThrows()
//hàm này lại xài LAMDA EXPRESSION, THƯ S5 CẤM VẮNG
//VÌ ÔNG SẼ GIẢNG CĂN BẢN LAMDA LÀ GÌ?
//              DỊCH:  CHỈ CÒ CÁI DÂY NỊT

//TDD: Test Driven Development: là kỹ thuật cho dân dev
// nói về việc viết code chính cần phải dcd kiểm tra nga về chất lượng
// nên viết code chính đan xen, xen kẽ cùng với việc thiết kế
// các test case để test code chính
//Lập trinhf mà viết code chính và code test (Junit, Unit Test)
// đan xen kẽ nhau thì đc gọi là TDd
//Viết CODE HƯỚNG THEO VIỆC KIỂM THỬ NGAY CODE

//DDT: Data  *chưa xong*
