package clean.code.design_patterns.requirements;

public class MinimumOrder implements Order{
    private Order order;

    public MinimumOrder(Order order) {
        this.order = order;
    }

    @Override public int sum(int nr, String restaurant){
        int suma = order.sum(nr, restaurant);
        if (suma < 30)
            System.out.println("Comanda trebuie sa coste minim 30 de lei!");
        else
            System.out.println("Comanda acceptata!");
        return suma;
    }
}
