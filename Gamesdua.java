package Pertemuan9;
class Gamesdua extends Produk {
    int waktuMain;

    Gamesdua(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    String getInfoProduk() {
        return super.getInfoProduk() + ", Waktu Main: " + waktuMain + " jam";
    }
}
