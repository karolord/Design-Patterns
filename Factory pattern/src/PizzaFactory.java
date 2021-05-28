public class PizzaFactory {
    public static Pizza orderPizza(String order) {
        if (order.equals("Nypizza")) {
            return new Nypizza();
        } else if (order.equals("ChicagoDeepDish")) {
            return new ChicagoDeepDish();
        } else if (order.equals("Neapolitian")) {
            return new NeapolitianPizza();
        } else {
            return null;
        }
    }
}
