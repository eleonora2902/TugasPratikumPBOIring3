package Pertemuan9;
public class Soal1 {
    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");
        System.out.println("- hewan berkaki dua");
        System.out.println("- hewan Berkaki Enam");
        System.out.println("- hewan berkaki empat");
        System.out.println("- hewan berkaki delapan");
        System.out.println();

        System.out.println("Contoh hewan:");
        Hewan h1 = new Kangguru();
        Hewan h2 = new Capung();
        Hewan h3 = new Kucing();
        Hewan h4 = new Belalang();

        h1.info();
        h2.info();
        h3.info();
        h4.info();
    }
}

