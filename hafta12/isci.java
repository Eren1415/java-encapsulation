public class isci extends calisan {
    String vardiye;

    public Isci(String ad, String soyad, String vardiye) {
        this.ad = ad;
        this.soyad = soyad;
        this.vardiye = vardiye;
    }

    
    public void bilgileriYazdir() {
        System.out.println("Ad: " + ad + ", Soyad: " + soyad);
        System.out.println("Vardiya: " + vardiye);
    }
}
