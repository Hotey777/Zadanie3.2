public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double y = 1.7; //Рост в местрах
        double x = 56; //Вес в кг
        double MyIndex = service.calculate(x,y);
        System.out.println("Индекс массы тела:");
        System.out.println(MyIndex);
    }
}