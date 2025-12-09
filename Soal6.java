package Pertemuan9;
public class Soal6 {
    public static void main(String[] args) {

        Komikdua komik = new Komikdua("One Piece", "Oda", 980);
        Gamesdua game = new Gamesdua("Mobile Legends", "Moonton", 5);

        System.out.println(komik.getInfoProduk());
        System.out.println(game.getInfoProduk());
    }
}
