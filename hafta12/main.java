public class main {
    public static void main(String[] args) {
        teknisyen teknisyen = new teknisyen("Ahmet", "Yılmaz", "Elektrik");
        muhendis muhendis = new muhendis("Ayşe", "Demir", "Yazılım");
        isci isci = new isci("Mehmet", "Kaya", "Gece");

        teknisyen.bilgileriYazdir();
        System.out.println("-----");
        muhendis.bilgileriYazdir();
        System.out.println("-----");
        isci.bilgileriYazdir();
    }
}