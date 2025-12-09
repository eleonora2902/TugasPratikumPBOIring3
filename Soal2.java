package Pertemuan9;
class Segitiga {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

public class Soal2 {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(10, 15);
        System.out.println("Luas segitiga = " + s.hitungLuas());
    }
}
