package id.ac.uad.mahasiswa;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by kipli on 25/10/15.
 */
public class MainApplication {

   public static void main(String[] args){

       int tugas,uas,uts,angka;
       String nama,nim,huruf;
       Scanner test = new Scanner(System.in);
       System.out.println("...::: INPUT DATA MAHASISWA :::...");
       System.out.print("Masukan Nama       : ");
       nama = test.next();
       System.out.print("Masukan NIM        : ");
       nim = test.next();
       System.out.print("Nilai Tugas        : ");
       tugas = test.nextInt();
       System.out.print("Nilai UTS         : ");
       uts = test.nextInt();
       System.out.print("Nilai UAS         : ");
       uas = test.nextInt();
       System.out.println("\n");

       System.out.println("Data yang Anda Masukan :");
       System.out.println("Nama           :"+nama);
       System.out.println("NIM            :"+nim);
       System.out.println("Nilai Tugas    :"+tugas);
       System.out.println("Nilai UTS      :"+uts);
       System.out.println("Nilai UAS      :"+uas);

       angka=20*tugas/100+30*uts/100+50*uas/100;

       System.out.println("\nNilai rata rata : "+angka);

       if(angka>=80)
           System.out.println("Nilai Huruf : A");
       else if(angka>=65 && angka<80)
           System.out.println("Nilai Huruf : B");
       else if(angka>=45 && angka < 65)
           System.out.println("Nilai Huruf : C");
       else if(angka>60)
           System.out.println("Nilai Huruf : D");
       else
           System.out.println("Nilai Huruf : E");


   }
}
