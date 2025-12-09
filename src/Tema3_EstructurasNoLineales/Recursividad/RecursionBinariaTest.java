/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3_EstructurasNoLineales.Recursividad;

public class RecursionBinariaTest {
    public static void main(String[] args) {
        int data[]= {2,4,6,8};
        int low =0;
        int high = data.length-1;
        System.out.println(RecursionBinaria.binarySum(data, 0, high));
        
        int data2[]= {2,3,4,5};
        int low2 =0;
        int high2 = data2.length-1;
        System.out.println(RecursionBinaria.binarySum(data2, 0, high2));
        
        int data3[]= {1,2,3,4};
        int low3=0;
        int high3= data3.length-1;
        System.out.println(RecursionBinaria.binarySum(data3, 0, high3));
    }
    
}
