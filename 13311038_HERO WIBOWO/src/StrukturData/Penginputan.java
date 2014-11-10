package StrukturData;

import java.util.Scanner;

public class Penginputan {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Makanan  : ");
        String NM = input.nextLine();
        
        System.out.print("Input Harga   : ");
        int Harga = input.nextInt();
        
        System.out.print("Bayar Tunai   : ");
        int Bayar = input.nextInt();
        
        int kembalian = Bayar-Harga;
   
        String PM;
     if (Harga>=100000)
     {
         PM ="Jumbo";
     }
     else 
     {
         PM ="Standar";
     }
     System.out.println("\n"+"Nama Paket    : "+PM);
     System.out.println("Total Harga   : "+Harga);
     System.out.println("kembalian     : "+kembalian);
     
    }
}