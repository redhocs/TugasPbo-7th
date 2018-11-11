package Program;

import java.util.Scanner;

public class Utama{
    
public static void TampilData() {    
    }

    
    public static void SortingData(){
        int pil = 0;
        Program.Mahasiswa mhs =  new Program.Mahasiswa();
        Scanner s = new Scanner(System.in);
        do{    
        System.out.println("\nSorting Data Mahasiswa");
                    System.out.println("=================");
                    System.out.println("1. Berdasarkan Nim");
                    System.out.println("2. Berdasarkan Nama");
                    System.out.println("3. Berdasarkan IPK");
                    System.out.println("4. Kembali ke awal");
                    System.out.print("Pilih: ");
                    pil = s.nextInt();
                    if (pil == 1) {
                        mhs.sortNim();
                    } else if (pil == 2) {
                        mhs.sortNama();
                    } else if (pil == 3) {
                        mhs.sortIpk();
                    }
        }while (pil!=4);
}
    
    public static void InputData() {
        Program.Mahasiswa mahasiswa = new Program.Mahasiswa();
        Scanner s = new Scanner(System.in);
        System.out.println("\nInput Data");
        System.out.println("=============");
        System.out.print("Nim : ");
        String nim = s.nextLine();
        System.out.print("Nama: ");
        String nama = s.nextLine();
        System.out.print("IPK : ");
        String ipk = s.nextLine();
        mahasiswa.isiData(nim, nama, ipk);
    }
    
    public static void main(String[] args) {
        Program.Mahasiswa mhs =  new Program.Mahasiswa();
        int pil = 0;/*Mahasiswa*/
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("\nTugas Tentang Class-Object");
            System.out.println("==========================");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Urut data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    InputData();
                    break;
                case 2:
                    mhs.tampilData();
                    break;
                case 3:
                    SortingData();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }        
           
        } while (pil != 4);
        
        
    }
}
