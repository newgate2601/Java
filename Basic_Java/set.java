import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Phu");
        set.add("Thanh");
        set.add("Hoa");
        set.add("Phu");
        set.add("Quang");

        System.out.println(set);

        for(String s: set){
            System.out.print(s+" ");
        }

        System.out.println();

        if(set.contains("Phu")){
            System.out.println("Yes");
        }

    }
}
