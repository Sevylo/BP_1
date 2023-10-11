/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer_1;
import java.util.Scanner;

public class for_nomer1 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Menampilkan bilangan Ganjil");
        System.out.print("Masukan Angka= ");
        int a = scan.nextInt();
        System.out.println("Baris Bilangan Ganjilnya = ");
        
        for(int i=1; i <= a; i += 2){
            System.out.println(i+" ");
        }
    }
}
