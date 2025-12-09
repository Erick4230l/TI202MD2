/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3_EstructurasNoLineales.Recursividad;

/**
 *
 * @author erick
 */
public class FibonacciTest {

    public static void main(String[] args) {
        System.out.println("-----FIBONACCI BAD-----");
        System.out.println(Fibonacci.fibonacciBad(5));
        System.out.println(Fibonacci.fibonacciBad(6));
        System.out.println(Fibonacci.fibonacciBad(7));

        System.out.println("-----FIBONACCI GOOD-----");
        long[] r1 = Fibonacci.fibonacciGood(5);
        System.out.println("F(5) = " + r1[0]);

        long[] r2 = Fibonacci.fibonacciGood(6);
        System.out.println("F(6) = " + r2[0]);

        long[] r3 = Fibonacci.fibonacciGood(7);
        System.out.println("F(7) = " + r3[0]);

    }

}
