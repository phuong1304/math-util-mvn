/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bipu.mathutil.core;

// class này sẽ mô phỏng lại cái class java.util.Math
// huyền thoại, mà bên trong có các hàm static nổi tiếng
// Math.sqrt() Math.sin() Math.random() và con số PI nổi tiếng
public class MathUtility {
    public static final double PI = 3.1415;
    
    // hàm tính n! = 1.2.3..n
    // thiết kế hàm này như sau
    // 0! = 1! = 1
    // ko có âm giai thừa. Nếu đưa -1!, -5!: NÉM NGOẠI LỆ
    // vì giai thừa tăng rất nhanh, 20 giai thừa là đủ cho long
    // long: 18 con số 0
    // 21 giai thừa kiểu long ko chứa đc
    // hàm chỉ cho phép n = 0..20
    // đưa n > 20: NÉM NGOẠI LỆ
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
//                    
//        if(n == 0 || n == 1)
//            return 1;
//        
//        long product = 1; // biến gom tích nhân với nhau
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
    
      public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
                    
        if(n == 0 || n == 1)
            return 1;
        
      return n * getFactorial(n - 1);
    }// đệ quy - recursion
    
}
//5!=1.2.3.4.5=4!x 5= 5x4!
// 4!=4x 3!
//3!= 3 x 2!
//2! = 2x1!
//1! = 1; //DỪng
//N! = N x (N-1)!
