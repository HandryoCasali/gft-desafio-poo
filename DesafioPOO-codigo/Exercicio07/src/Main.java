import models.Gerente;
import models.Supervisor;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("João", 29, 5000);
        Supervisor sv = new Supervisor("Paulo", 25, 3500);
        Vendedor v = new Vendedor("Maria", 18, 2000);

        System.out.println(g);
        System.out.println(sv);
        System.out.println(v);
    }
}