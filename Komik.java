package Pertemuan9;
class Komik extends Produk {
    int volume;

    Komik(String judul, String penulis, int volume) {
        super(judul, penulis);
        this.volume = volume;
    }
}

class Games extends Produk {
    String platform;

    Games(String judul, String penulis, String platform) {
        super(judul, penulis);
        this.platform = platform;
    }
}
