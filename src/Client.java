import model.CrustType;
import model.Pizza;
import model.Pizza.Builder;
import model.SizeType;

public class Client {
    public static void main(String[] args) {
        Pizza marguerita = new Pizza.Builder()
                .size(SizeType.LARGE)
                .crust(CrustType.THIN)
                .addTopping("tomate")
                .addTopping("manjericao")
                .build();

        Pizza peperoni = new Pizza.Builder()
                .addTopping("pepperoni")
                .build();

        Pizza.Builder builder;

        builder = new Pizza.Builder();

        Pizza vegetariana = builder.size(SizeType.SMALL)
                .crust(CrustType.WHOLE_WHEAT)
                .cheese("mussarela")
                .addTopping("pimentao")
                .addTopping("cebola")
                .addTopping("azeitona")
                .build();

        builder = new Builder();
        builder.crust(CrustType.GLUTEN_FREE);
        builder.cheese("Queijo vegano");
        builder.addTopping("tomate");
        builder.addTopping("rucula");
        builder.addTopping("cogumelos");
        Pizza semGluten = builder.build();

        System.out.println(marguerita);
        System.out.println(peperoni);
        System.out.println(vegetariana);
        System.out.println(semGluten);
    }
}