/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer_1;
import java.util.Scanner;

public class while_nomer1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Menampilkan bilangan Ganjil");
        System.out.print("Masukan Angka= ");
        int a = scan.nextInt();
        System.out.println("Barisan Angka Ganjilnya= ");
        int c =1;
        while(a >= c){
            System.out.println(c +"  ");
            c += 2;
        }
    }
    
}
