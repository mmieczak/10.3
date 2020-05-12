import data.DuplicateException;
import data.NamesHolder;

public class Tester {

    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder(new String[5]);

        try {
            namesHolder.add(null);
            namesHolder.add("Rick");
            namesHolder.add("rick");
            namesHolder.add("Ala");
            //namesHolder.add("Ala");         //DuplicateException
            namesHolder.add("6thElement");  //ArrayIndexOutOfBoundsException
            namesHolder.remove("Tom");
            System.out.println(namesHolder.toString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println(namesHolder.toString());
        }
    }
}
