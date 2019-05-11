import java.util.ArrayList;
public class List {
    public List(Iterator I){
        ArrayList<Iterator> allmenu = new ArrayList<Iterator>();
        allmenu.add(I);
        for (Iterator menu : allmenu) {
            System.out.println(menu);
            while (menu.hasnext())
                System.out.println(menu.next());
        }
    }
}
