import java.util.ArrayList;

public class Topping implements Iterator {
    private ArrayList<String> menu;
    private int index;

    public Topping() {
        menu = new ArrayList<String>();
        menu.add("Kitkat");
        menu.add("Oreo");
        menu.add("Red bean");
        menu.add("Peanut");
        menu.add("Caramel");
        menu.add("M&M");
        menu.add("Cotton Candy");
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
        return (index+1)+" : "+menu.get(index++);
    }

    public String toString() {
        return "======== Size Ice-Cream ========";
    }
}
