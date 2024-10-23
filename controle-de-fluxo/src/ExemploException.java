import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploException {
    public static void main(String[] args) {
        // EXCEPTION
        // RUNTIME EXCEPTION 

        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
