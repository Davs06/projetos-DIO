class Quadrilateros {

    public static void area(double lado) {
        System.out.println("A area do quadrado é igual " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A area do retangulo é igual " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio:" + ((baseMaior + baseMenor) * altura) / 2);
    }

    // public static void area(double lado1, double lado2) {
    //     System.out.println("A area do retangulo é igual " + lado1 * lado2);
    // } ***** não é só mudar o nome do parametro e sim o tipo de paraemtro
    // EX: Mudar double para float 
}