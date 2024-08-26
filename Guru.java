import java.util.Scanner;
public class Guru{
     
     int nip;
     String nama;
     String status;
     String mapel;

     public Guru() {
          nip = 0;
          nama = "kosong";
          status = "kosong";
          mapel = "Kosong";
     }

     public void print(){
          System.out.println("NIP =" +nip);
          System.out.println("nama =" +nama);
          System.out.println("mapel = " +status);
          System.out.println("mapel =" +mapel);
     }
}