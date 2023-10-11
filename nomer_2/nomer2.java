/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomer_2;
import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Segitiga Dengan Angka");
        System.out.print("Masukan Angka= ");
       int a = scan.nextInt();
        
       for(int i=1; i <= a; i++){
           for(int j =1; j<=i; j++){
            System.out.print(j+"");
        }
           System.out.println("");
       }
        
    } 
    
}
