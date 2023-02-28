public class Mahasiswa extends Manusia{
    private String nim;

    public Mahasiswa(String name, String age, String nim) {
        super(name, age);
        this.nim = nim;
    }

    void belajar(){
        System.out.println(name + " sedang belajar");
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
}