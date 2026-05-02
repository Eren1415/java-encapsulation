public class muhendis extends calisan {
    String bolum;

    public muhendis(String ad, String soyad, String bolum) {
        super(ad, soyad);
        this.bolum = bolum;
    }

    
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Bölüm: " + bolum);
    }
}