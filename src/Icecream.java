import java.util.ArrayList;
public class Icecream implements Iterator {
    private ArrayList<String> menu;
    private int index;

    public Icecream() {
        menu = new ArrayList<String>();
        menu.add("Chocolate");
        menu.add("Chocolate Chip");
        menu.add("Vanilla");
        menu.add("Coffee");
        menu.add("Green Tea");
        menu.add("Lemon");
        menu.add("Mixed-Berry");
        menu.add("Banana");
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    @Override
    public boolean hasnext() {
        if (index == menu.size())
            return false;
        else
            return true;
    }

    @Override
    public String next() {

        return (index+1)+" : "+  menu.get(index++);
    }

    public String toString() {
        return "========= Ice-Cream =========";
    }
}

