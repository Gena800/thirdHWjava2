public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println("Имт: " + service.calculate(100, 1.85));


    }
}