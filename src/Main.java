import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("");
//        Map<String, String> region;
        Scanner sc = new Scanner(System.in);
        String testSormRegion = "MRGCE";
        Map<String, String> region = new HashMap<>();
        region.put("MRGCE", "msk");
        region.put("MRGSZ", "nw");
        region.put("MRGPV", "vnw");
        region.put("MRGUR", "vnw");
        region.put("MRGUG", "ug");
        region.put("MRGDV", "sb");
        region.put("MRGSI", "sb");

        String testForisRegion = region.get(sc.nextLine().trim());

        System.out.println(testForisRegion);

//        System.out.println("Введите тип фигуры");
//        Double result = choseFigure();
//
//        System.out.println("Площадь фигуры = " + result);
    }

    private static Double choseFigure(){
        Scanner sc = new Scanner(System.in);
        return switch (sc.nextLine()) {
            case "Прямоугольник" -> calcRectangleArea();
            case "Круг" -> calcCircleArea();
            case "Треугольник" -> calcTriangleArea();
            default -> {
                System.out.println("Неизвестная фигура");
                yield null;
            }
        };
    }

    private static Double calcRectangleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника");
        Double a = sc.nextDouble();
        System.out.println("Введите ширину прямоугольника");
        Double b = sc.nextDouble();
        return a * b;
    }

    private static Double calcCircleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        Double r = sc.nextDouble();
        return (Double) (Math.PI * Math.pow(r, 2));
    }

    private static Double calcTriangleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую длину треугольника");
        Double a = sc.nextDouble();
        System.out.println("Введите вторую длину треугольника");
        Double b = sc.nextDouble();
        System.out.println("Введите третью длину треугольника");
        Double c = sc.nextDouble();
        Double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    /** testMethod - метод калькулятор
     * @param a - первое число
     * @param b - второе число
     * @param operation - операция
     * @return результат вычисления
     */
    private static Double testMethod(Double a, Double b, String operation){
        if (operation.equals(("+"))){
            return a + b;
        } else if (operation.equals("-")){
            return a - b;
        } else if (operation.equals("*")){
            return a * b;
        } else if (operation.equals("/")){
            if (b == 0){
                return null;
            } else {
                return a / b;
            }
        } else {
            return null;
        }
    }
}