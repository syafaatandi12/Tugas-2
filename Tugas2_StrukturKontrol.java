import java.util.Scanner;
//Nama   : Andi Syafaat
//Nim    : 13020200020
//Tanggal: 22 maret 2022
//Waktu  : 17:00
public class StrukturKontrol {
    public static void main(String[] args) {
        //deklarasi variabel
        int umur;
        //membuat scanner baru
        Scanner input = new Scanner(System.in);
        //menampilkan output ke user
        System.out.print("Masukkan Umur Anda : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel umur
        umur = input.nextInt();
       
        // jika di masuukan umur 16 berarti yang akan tampil Anda belum dewasa
        // karena syarat untuk menampilkan Anda sudah Dewasa adalah 17 
        if (umur >= 17){
            System.out.println("Anda Sudah Dewasa");
        }else{
            System.out.println("Anda Belum Dewasa");
        }
    }
    
}
