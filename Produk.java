package Pertemuan9;
class Produk {
    String judul;
    String penulis;

    Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    String getInfoProduk() {
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}
