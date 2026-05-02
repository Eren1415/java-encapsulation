public class teknisyen extends calisan {
    String dal;

    public teknisyen(String ad, String soyad, String dal) {
        super(ad, soyad);
        this.dal = dal;
    }

    
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Dal: " + dal);
    }
}