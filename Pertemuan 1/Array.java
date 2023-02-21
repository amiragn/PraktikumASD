public class Array {
    public static void main(String[] args) {
        String[] satuDimensi = {"nol", "satu", "dua", "tiga"};
        String[][] duaDimensi = {{"nol nol", "nol satu"}, {"satu nol", "satu satu"}};
        int baris = 5;
        int kolom = 4;
        String[][] arrayTes = new String[baris][kolom];

        System.out.println(satuDimensi[0]);
        System.out.println(duaDimensi[1][1]);

        for(int i =0; i<satuDimensi.length;i++){
            System.out.println(satuDimensi[i]);
        }

        for(int i = 0; i < duaDimensi.length; i++){
            for(int j = 0; j < duaDimensi.length; j++){
                System.out.println(duaDimensi[i][j]);
            }
        }

        // belum bisa diprint karena arrayTes kosong
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.println(arrayTes[i][j]);
            }
        }
    }
}