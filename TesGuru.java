import java.util.Scanner;

public class TesGuru {
   public static void main(String[] args) {
      Scanner input =  new Scanner(System.in);
      System.out.println("Nama :");
      String nama = input.nextLine();
      System.out.println("Id :");
      int id = input.nextInt();
      System.out.println("IPK :");
    double Masukan = input.nextDouble();
      

      Guru zidan = new Guru();
      Guru wahyu = new Guru();
      Guru ari = new Guru();
      Guru ilham = new Guru();

      zidan.nip = 1111;
      zidan.nama = "Zidan";
      zidan.mapel = "bahasa jawa"; 
      zidan.status = "Full-time";
      zidan.print();
      
      wahyu.nip = 1112;
      wahyu.nama = "wahyu";
      wahyu.mapel = "Olahraga";
      wahyu.status = "Full-Time";
      wahyu.print();

      ari.nip = 1112;
      ari.nama = "ari";
      ari.mapel = "Olahraga";
      ari.status = "Full-Time";
      ari.print();

      ilham.nip = 1112;
      ilham.nama = "ilham";
      ilham.mapel = "Olahraga";
      ilham.status = "Full-Time";
      ilham.print();
      
   
   }
}