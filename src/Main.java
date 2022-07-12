public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.7; //Рост в местрах
        double weight = 56; //Вес в кг
        double MyIndex = service.calculate(weight,height);
        System.out.println("Индекс массы тела:");
        System.out.println(MyIndex);
    }
}