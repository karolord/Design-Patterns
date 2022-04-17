public class Order {
    public static void ProcessOrder(String order) {
        Pizza currentorder = PizzaFactory.orderPizza(order);
        currentorder.pizzaBake();
        currentorder.pizzaCut();
        currentorder.pizzaServe();
    }

    public static void main(String[] args) {
        ProcessOrder("Nypizza");
        Pizza order = PizzaFactory.orderPizza("ChicagoDeepDish");
    }
}
