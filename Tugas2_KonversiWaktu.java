import java.util.Scanner;
//Nama   : Andi syafaat
//Nim    : 13020200020
//Tanggal: 23-maret-2022
//Waktu  : 12:20 Wib

public class KonversiWaktu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jam, menit, detik, konversi;
            System.out.print("Berapa detik yang ingin anda konversikan : ");
            konversi = input.nextInt();

            jam     = konversi/3600;
            menit   = (konversi%3600)/60;
            detik   = (konversi%3600)%60;
            
            System.out.println("Konversi dari : "+konversi+" detik, Adalah : ");
            System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
        }
    }

    
    
}
