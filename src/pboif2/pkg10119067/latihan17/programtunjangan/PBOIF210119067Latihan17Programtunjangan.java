/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi Program : Program Tunjangan
 */
public class PBOIF210119067Latihan17ProgramTunjangan {
 /**
     * @param args the command line arguments
     */
    
    public static double inputUserGaji() {
        Scanner scanner = new Scanner(System.in);  
       /**mendapatkan gaji pokok user */
       System.out.print("Berapa gaji pokok anda perbulan?: ");
       double gajiPokok = scanner.nextInt();
       return gajiPokok;
    }
    
    public static String inputUserStatus() {
        Scanner scanner = new Scanner(System.in);
        /** mendapatkan status user */
       System.out.print("Status anda? (Menikah/Belum): ");
       String status = scanner.nextLine();
       return status;
    }
    
    public static double tunjangan (double gajiPokok, String status) {
        double tunjangan;
        if (status.equals("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== Program Tunjangan =====");
        double gajiPokok = inputUserGaji();
        String status = inputUserStatus();
        double tunjangan = tunjangan(gajiPokok,status);
        double gajiTotal=tunjangan+gajiPokok;
        
        System.out.println();
        System.out.println("===== Hasil Perhitungan Gaji Anda =====");
        System.out.println("Gaji Pokok\t:" + gajiPokok);
        System.out.println("Tunjangan\t:" + tunjangan);
        System.out.println("Gaji Total\t:" + gajiTotal);
        System.out.println("Developed by : Andreas Danhago");
        
    }
       
}