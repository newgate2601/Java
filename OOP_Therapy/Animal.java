package InheriAndPoly;

public class Animal {
    int speedlimit = 90;
    private int age ;
    private String name;
    private float weight;

    public void makeNoise(){
        System.out.println("Animal is noising !!!");
    }

    public void move(){
        System.out.println("Animal is moving");
    }

    public void saySomeThing(){
        System.out.println("Bla bla bla ....");
    }

    public Animal(int age, String name, float weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Animal() {
    }

    public void eat(){
        System.out.println("Mlem Mlem");
    }

}
