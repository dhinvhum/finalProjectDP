import java.util.ArrayList;

public class Size implements Iterator{
    private ArrayList<String> menu;
    private int index;

    public Size() {
        menu = new ArrayList<String>();
        menu.add("S");
        menu.add("M");
        menu.add("L");
        menu.add("XL");
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
