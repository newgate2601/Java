package InheriAndPoly; 


public class overRidingMethod { // ghi đè
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
    }
}

// overriding cùng tên method với parent của nó
// cùng parameter với parent 
// không thể override static method