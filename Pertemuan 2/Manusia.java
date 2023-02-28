public class Manusia {
    String name;
    String age;

    public Manusia(String name, String age){
        this.name = name;
        this.age = age;
    }

    void makan(){
        System.out.println(name + " sedang makan");
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
}