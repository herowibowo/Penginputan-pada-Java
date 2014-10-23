
package id.blits.Input;

import java.util.Scanner;


public class InputanNilai {

    public static void main(String[] args) {
       
     Scanner input = new Scanner(System.in);
       
       System.out.print("Tugas Besar :");
       double tugas1 = input.nextDouble();
       
       System.out.print("Tugas Kecil :");
       double tugas2 = input.nextDouble();
       
       System.out.print("Quis1       :");
       int Quis1 = input.nextInt();
       
       System.out.print("Quis2       :");
       int Quis2 = input.nextInt();
       
       System.out.print("Uts         :");
       double utsjadi = input.nextDouble();
       
       System.out.print("Uas P       :");
       double UasP = input.nextDouble();
       
       System.out.print("Uas T       :");
       double UasT = input.nextDouble();
       
       
       Double hasil1 = 0.7*tugas1;
       Double hasil2 = 0.3*tugas2;
       
       double uas1 = 0.6*UasP;
       double uas2 = 0.4*UasT;
       
       int quiseluruh = (Quis1+Quis2)/2;
       double hasilseluruh = hasil1+hasil2;
       double hasiluas = uas1+uas2;
       
       double Tugasakhir = 0.5*hasilseluruh;
       double Utsakhir   = 0.25*utsjadi;
       double uasakhir =   0.30*hasiluas;
       
       System.out.println("Tugas :  "+Tugasakhir);
       System.out.println("Quis  :  "+quiseluruh);
       System.out.println("Uts   :  "+Utsakhir);
       System.out.println("Uas   :  "+uasakhir);
       System.out.println("====== PBO =======");
       
       
       
       
    }
}
