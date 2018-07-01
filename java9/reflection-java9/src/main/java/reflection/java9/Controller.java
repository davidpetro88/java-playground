package reflection.java9;

import java.util.List;

public class Controller {
    private List<String> product = List.of("Item 1","Item 2", "Item 3" );

    public Controller(){}
    public Controller(String string){}
    public Controller(String string, String string2){}

    public List<String> getProduct() {
        return product;
    }
}
