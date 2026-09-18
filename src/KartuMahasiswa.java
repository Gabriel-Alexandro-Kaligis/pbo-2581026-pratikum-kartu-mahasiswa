import java.util.Scanner;

public class KartuMahasiswa {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("NIK (16 digit)   : ");
    long nik = input.nextLong();

    System.out.print("Umur             : ");
    int umur = input.nextInt();

    System.out.print("Tinggi badan cm  : ");
    double tinggiBadan = input.nextDouble();

    System.out.print("Golongan darah   : ");
    char golonganDarah = input.next().charAt(0);

    System.out.print("Sudah menikah    : ");
    boolean sudahMenikah = input.nextBoolean();


    input.nextLine();

    System.out.print("Nama lengkap     : ");
    String namaLengkap = input.nextLine();

    System.out.println();
    System.out.println("===== KARTU MAHASISWA =====");
    System.out.println("Nama       : " + namaLengkap);
    System.out.println("NIK        : " + nik);
    System.out.println("Umur       : " + umur + " tahun");
    System.out.println("Tinggi     : " + tinggiBadan + " cm");
    System.out.println("Gol darah  : " + golonganDarah);
    System.out.println("Menikah    : " + sudahMenikah);

    input.close();
  }
}