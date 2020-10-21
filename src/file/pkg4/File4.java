/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.pkg4;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class File4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nama, kelas, keterangan;
        int nilaiTugas1, nilaiTugas2, nilaiUh1, nilaiUh2, nilaiUts, nilaiUas, totalNilai;
        Scanner input = new Scanner (System.in);
        
        System.out.println("=====================================");
        System.out.println("---NILAI ULANGAN AKHIR SISWA/SISWI---");
        System.out.println("=====================================");

         System.out.print("Nama : ");
          nama = input.nextLine();
        
         System.out.print("Kelas : ");
          kelas = input.nextLine();
        
         System.out.print("Nilai Tugas 1 : ");
          nilaiTugas1 = input.nextInt();
        
         System.out.print("Nilai Tugas 2 : ");
          nilaiTugas2 = input.nextInt();
        
         System.out.print("Nilai Ulangan Harian 1 : ");
          nilaiUh1 = input.nextInt();
        
         System.out.print("Nilai Ulangan Harian 2 : ");
          nilaiUh2 = input.nextInt();
        
         System.out.print("Nilai UTS : ");
          nilaiUts = input.nextInt();
        
        totalNilai = (nilaiTugas1 + nilaiTugas2 + nilaiUh1 + nilaiUh2 + nilaiUts)/5;
        System.out.println("Nilai Akhirnya adalah " +totalNilai);
        
        if (totalNilai > 85 && totalNilai <= 100){
            System.out.println("Predikat : A");
             System.out.println("Keterangan : Baik Sekali");
              System.out.println("--SELAMAT ATAS PREDIKAT TERBAIKMU!--");
            
           }else if (totalNilai > 75 && totalNilai <= 85){
            System.out.println("Predikat : B");
             System.out.println("Keterangan : Baik");
              System.out.println("--TINGKATKAN TERUS PRESTASIMU!--");
            
           } else if (totalNilai > 60 && totalNilai <= 75){
            System.out.println("Predikat : C");
             System.out.println("Keterangan : Cukup"); 
              System.out.println("--TINGKATKAN BELAJARMU DAN JANGAN PUTUS ASA!--");
            
            } else if (totalNilai <= 60){
            System.out.println("Predikat : D");
             System.out.println("Keterangan : Buruk"); 
              System.out.println("--TERUS BELAJAR DAN TETAP SEMANGAT!--");
                
            }
    }
    
}
