package InheriAndPoly;

public class Static {
    static int count = 0; // bộ nhớ lấy count 1 lần, khởi tạo thì giá trị count vẫn thế
                          // this và super không dùng được với static
    Static(){
        count ++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Static s1 = new Static(); // count = 1
        Static s2 = new Static(); // 2
        Static s3 = new Static(); // 3
    }

}
