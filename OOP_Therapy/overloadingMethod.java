package InheriAndPoly;

class Adder{
    
    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b){
        return a+b;
    }

}


public class overloadingMethod {          // nạp chồng: tăng tính đa dạng hàm, tăng giảm tham số, thay đổi dataType
    
    public static void main(String[] args) {
        System.out.println( Adder.add(1,2)   );
        System.out.println( Adder.add(1,2,3));
        System.out.println(Adder.add(1.2,11.3));
    }

}
