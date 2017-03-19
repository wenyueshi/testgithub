/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgithub;

import java.math.BigInteger;//利用import，简化代码，BigInteger相当于t；java.math.BigInteger指一个大整数
import java.util.Scanner;

/**
 *
 * @author swy
 */
public class Testgithub {

    public static BigInteger summation(int n) {
        BigInteger sum = new BigInteger("0");//在BigInteger这个类下，创建一个对象sum，用new创建了这个实例
        if (n <= 1) {
            return BigInteger.ONE;    //因0！= 1  所以 n <= 1 时返回 1 
        }
        for (int i = 1; i <= n; i++) {
            sum = sum.add(factorial(i));
        }
        return sum;
    }

    /**
     * （递归）计算 n 的阶乘
     *
     * @param n
     * @return sum
     */
    public static BigInteger factorial(int n) {
        if (n > 0) {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        } else {      //因0！= 1   所以 n <= 1 时返回 1 
            return BigInteger.ONE;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please input an Integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("从1到" + n + "的阶乘的总和  = " + summation(n)); 
                       
    } 
        
    }

    // TODO code application logic here

