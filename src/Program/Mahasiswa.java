package Program;

import java.util.*;


public class Mahasiswa {

    private String nim;
    private String nama, ipk;
    public static List<Mahasiswa> sMahasiswa = new ArrayList<>();
    

    public Mahasiswa() {
    }
        
    public Mahasiswa(String nim, String nama, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    
    public void sortIpk() {
        Collections.sort(sMahasiswa, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa t, Mahasiswa t1) {
                return t.getIpk().compareTo(t1.getIpk());
            }
            
        });
        int i=1;
        for (Mahasiswa mahasiswa : sMahasiswa) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim: " +mahasiswa.getNim() + " \nNama: "+mahasiswa.getNama()+ " \nIPK: " + mahasiswa.getIpk());
        }
    }
    
    
    public void sortNama() {
        Collections.sort(sMahasiswa, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa t, Mahasiswa t1) {
                return t1.getNama().compareTo(t.getNama());
            }
            
        });
        int i=1;
        for (Mahasiswa mahasiswa : sMahasiswa) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim: " +mahasiswa.getNim() + " \nNama: "+mahasiswa.getNama()+ " \nIPK: " + mahasiswa.getIpk());
        }
    }
    
    public void sortNim() {
        Collections.sort(sMahasiswa, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa t, Mahasiswa t1) {
                return t.getNim().compareTo(t1.getNim());
            }
            
        });
        int i=1;
        for (Mahasiswa mahasiswa : sMahasiswa) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim: " +mahasiswa.getNim() + " \nNama: "+mahasiswa.getNama()+ " \nIPK: " + mahasiswa.getIpk());
        }
    }
    
    public void isiData(String nim, String nama, String ipk) {
        sMahasiswa.add(new Mahasiswa(nim, nama, ipk));
        //System.out.println(nama);
    }
    
    public void tampilData() {
        int i=1;
        for (Mahasiswa mahasiswa : sMahasiswa) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("IPK: " + mahasiswa.ipk);
        }
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getIpk() {
        return ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }
    

    @Override
    public String toString() {
        String str = "Nim: " + nim + "\n" +
                     "Nama: " + nama + "\n" + 
                     "IPK: " + ipk;
        return str;
    }
    
    
}