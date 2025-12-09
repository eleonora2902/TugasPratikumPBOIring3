package Pertemuan9;
class Komikdua extends Produk {
    int halaman;

    Komikdua(String judul, String penulis, int halaman) {
        super(judul, penulis);
        this.halaman = halaman;
    }

    String getInfoProduk() {
        return super.getInfoProduk() + ", Halaman: " + halaman;
    }
}
