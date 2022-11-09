package InheriAndPoly;

public class UpDownCasting {

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
    }

    public static void main(String[] args) {

// UP CASTING

        Animal myAnimal = new Dog(); // upCasting: s chỉ có các thành phần của lớp cha Animal và bên trên nó chứ ko lấy được thành phần bên dưới
        //Dog dog = new Animal(); không tương thức
        //myAnimal.growl();        tuy là upcasting nhưng myAnimal không thể thực hiện method riêng của Dog
        System.out.println(myAnimal.speedlimit); // myAnimal = Dog nhưng speedimit là không phải ghi đè nên là 90 chứ kp 150 

        doAnimalStuff(myAnimal);
        myAnimal.makeNoise(); // sử dụng phương thức ghi đè của Dog nhưng không sử dụng các phương thức riêng
        Dog dog = new Dog();
        doAnimalStuff(dog);
        
        System.out.println("/////////////");
// DOWN CASTING

        if(myAnimal instanceof Dog){
            Dog myDog = (Dog)myAnimal;
            myDog.growl();
            myDog.makeNoise(); 
            
            ( (Dog) myAnimal).setNumTeeth(12);
            System.out.println( ((Dog)myAnimal).getNumTeeth() );

        }
               

    }
}
