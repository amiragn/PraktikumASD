import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manusia shania = new Manusia("Shania", "20");
        Mahasiswa mira = new Mahasiswa("Mira", "20", "2151500000");
        mira.makan();
        mira.belajar();
        //shania.belajar();
        System.out.println(shania.name);
        //System.out.println(mira.nim);

        Mahasiswa[] mahasiswaArray = new Mahasiswa[2];

        for(int i = 0; i < mahasiswaArray.length; i++){
            String name = input.nextLine();
            String age = input.nextLine();
            String nim = input.nextLine();
            mahasiswaArray[i] = new Mahasiswa(name, age, nim);
        }
        System.out.println(mahasiswaArray[0].getName());
    }
}