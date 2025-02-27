class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        return 1.2f;
    }
}

public class Main {
    public static void main(String[] args) {
        // Unit Test for Cash class
        Exchange exchange = new FakeExchange();

        // Test setup
        // Exchange exchange = new NYSE("someAccessKey");
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Test 'in' method of Cash
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}
