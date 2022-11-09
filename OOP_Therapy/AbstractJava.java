package InheriAndPoly;
// trừu tượng: ẩn các tiến trình; hiện kết quả tới người dùng
// abstract: lớp trừu tượng: có các abstract method hoặc non-abstract method
// muốn khai báo 1 phương thức nhưng muốn nó được sử dụng bởi các subclass, khai báo lớp parent ở dạng abstract
// abstract method ko có phần thân
abstract class Bike{
    private int maxSpeed;
    abstract void run();
    public void show(){
        System.out.println("Bike is showing !!!");
    }
}

class Honda4 extends Bike{

    void run() {
        System.out.println("Honda4 is running !!!");        
    }
    
}

class Yamaha4 extends Bike{

    void run(){
        System.out.println("Yamaha4 is running !!!");
    }

}

public class AbstractJava {
    public static void main(String[] args) {
        Honda4 honda4 = new Honda4();
        honda4.run();

        Yamaha4 yamaha4 = new Yamaha4();
        yamaha4.run();

        yamaha4.show();

        // ngoài ra ta có thể gọi đối tượng từ lớp cha và Upcasting lên
        Bike bike = new Yamaha4();
        bike.run();

    }
}
