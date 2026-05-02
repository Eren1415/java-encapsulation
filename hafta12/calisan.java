public class calisan {
    String ad;
    String soyad;

    public calisan(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public void bilgileriYazdir() {
        System.out.println("Ad: " + ad + ", Soyad: " + soyad);
    }
}