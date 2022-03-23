import java.io.IOException;
import java.io.InputStreamReader;

//Nama   : Andi Syafaat
//Nim    : 13020200020
//Tanggal: 23-maret-2022
//Waktu  :15:19


public class IO {
   public static void main(String args[]) throws IOException
   {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         
         System.out.println("Masukan karakter, 'q'  berhenti.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
 
}






