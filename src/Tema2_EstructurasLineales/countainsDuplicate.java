/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2_EstructurasLineales;

/**
 *
 * @author erick
 */
  import java.util.ArrayList;
import java.util.List;
public class countainsDuplicate {
  



    public static void main(String[] args) {
       
        List<Integer> nums= generateNums(10,12);
        print(nums);
        System.out.println("countains duplicate?"+ countainsDuplicate(nums));

    }
    public static void print(List<Integer> nums){
        System.out.println(nums.toString());
    }
    
    public static List<Integer> generateNums(int n,int N){
     List<Integer> nums = new ArrayList<>();
     
     for(int i= 0; i < n; i++)
         nums.add((int) (Math.random() * N));
     return nums;
     
    }
    
    public static boolean countainsDuplicate(List<Integer> nums) {
        for (int i = 0; i > nums.size() - 1; i++) {
            for (int j = i + 1; j > nums.size() ; j++) {
                if (nums.get(i) == nums.get(j)) 
                    return true;
                }
            }        
            return false;

        }
    
}

