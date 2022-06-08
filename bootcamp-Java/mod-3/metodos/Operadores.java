class Operadores {

    // metodos de operadores

    public static void soma(int numeroUm, int numeroDois) {
        int resultado = numeroUm + numeroDois;
        System.out
                .println("A soma do primeiro valor " + numeroUm + " e o segundo valor " + numeroDois + " = " + resultado);
    }

    public static void subtração(int numeroUm, int numeroDois) {
        int resultado = numeroUm - numeroDois;
        System.out.println(
                "A subtração do primeiro valor " + numeroUm + " e do segundo valor " + numeroDois + " = " + resultado);
    }

    public static void multiplicação(int numeroUm, int numeroDois) {
        int resultado = numeroUm * numeroDois;
        System.out.println("A multiplicação do primeiro valor " + numeroUm + " e do segundo valor " + numeroDois + " = "
                + resultado);

    }

    public static void divisão(int numeroUm, int numeroDois) {
        int resultado = numeroUm / numeroDois;
        System.out.println(
                "A divisão do primeiro valor " + numeroUm + " e do segundo valor " + numeroDois + " = " + resultado);

    }

    public static void mod(int numeroUm, int numeroDois) {
        int resultado = numeroUm % numeroDois;
        System.out.println("O que sobrou da divisão do primeiro valor " + numeroUm + " e do segundo valor " + numeroDois
                + " = " + resultado);

    }

    // public static void potenciação() {
    // int resultado = numeroUm ** numeroDois;
    // }

}