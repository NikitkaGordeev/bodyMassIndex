public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        double bmi = service.calculate(height, weight);
        int roundingBmi = (int) bmi;
        System.out.println("Индекс массы тела: " + roundingBmi);
    }
}