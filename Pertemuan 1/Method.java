public class Method {
    public static void main(String[] args) {
        makan("shania");
        makan("mira");
        int hasilPangkat = getPangkat(5);
        System.out.println(hasilPangkat);
    }

    static void makan(String nama){
        System.out.println(nama + " sedang makan");
    }

    static int getPangkat(int angka){
        return angka*angka;
    }
}