package Pertemuan9;
public class Soal5 {
    public static void main(String[] args) {

        Komik komik = new Komik("Naruto", "Masashi Kishimoto", 72);
        Games game = new Games("God of War", "Sony", "Playstation");

        System.out.println(komik.getInfoProduk());
        System.out.println(game.getInfoProduk());
    }
}
