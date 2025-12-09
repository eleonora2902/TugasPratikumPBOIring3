package Pertemuan9;
class Hewan {
    String nama;
    int jumlahKaki;
    
    Hewan(String nama, int jumlahKaki) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
    }
    
    void info() {
        System.out.println("- " + nama + " Berkaki" + jumlahKaki);
    }
}
