
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparators {
    public static void main(String[] args){
        List<Integer>l=new ArrayList<>();
        l.add(4);
        l.add(22);
        l.add(2);
        l.add(37);
        //Collections.sort(l);
        Collections.sort(l,(a,b)->Integer.compare(b,a));//reverse order
        System.out.println(l);
        l.sort((a,b)->Integer.compare(a,b));
        System.out.println(l);

        
    }
}
