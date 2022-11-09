import java.util.ArrayList;

public class arrayList {
     public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 9 ; i >=0; i--){
            list.add(i);
        }

        System.out.println(list);

        list.remove(0); // delete index: 0
        System.out.println(list);

        list.remove(list.get(1)); // delete list[1]
        System.out.println(list);

        list.add(1);
        System.out.println(list);

        list.add(1,1);
        System.out.println(list);

     }
}
