
public class ExercicioReturnMain {

    public static void main(String[] args) {

        int areaQuadrado = Quadrilateros.area(2);
        double areaRetangulo = Quadrilateros.area(40, 80);
        double areaTrapezio = Quadrilateros.area(20.30, 60.60, 70);

        System.out.println("Area do quadrado é de " +  areaQuadrado);
        System.out.println("Area do retangulo é de " + areaRetangulo);
        System.out.println("Area do trapezio é de " + areaTrapezio);
    }

}