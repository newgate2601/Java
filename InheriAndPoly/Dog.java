package InheriAndPoly;

public class Dog extends Animal{

    int speedlimit = 150;

    private int numTeeth;

    public void makeNoise(){
        System.out.println("Woof Woof");
    }

    public void growl(){
        System.out.println("Grrrrr");
    }

    public int getNumTeeth() {
        return numTeeth;
    }

    public void setNumTeeth(int numTeeth) {
        this.numTeeth = numTeeth;
    }

    public Dog(int age, String name, float weight, int numTeeth) {
        super(age, name, weight);
        this.numTeeth = numTeeth;
    }

    public Dog() {}

    public void dogEat(){
        super.eat();
    }

}
