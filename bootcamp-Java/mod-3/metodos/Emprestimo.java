class Emprestimo {

    public static double taxaSegundaParcela() {
        return 0.20;
    }

    public static double taxaTerceiraParcela() {
        return 0.30;
    }

    public static double taxaQuartaParcela() {
        return 0.40;
    }

    public static void calculo(double valor, int parcelas) {
        switch (parcelas) {
            case 2:
                double valorFinal = valor + (valor * taxaSegundaParcela());
                System.out.println("O valor da parcela sera de " + valorFinal);
                break;
            case 3:
                valorFinal = valor + (valor * taxaTerceiraParcela());
                System.out.println("O valor da parcela sera de " + valorFinal);
                break;

            case 4:
                valorFinal = valor + (valor * taxaQuartaParcela());
                System.out.println("O valor da parcela sera de " + valorFinal);
                break;

            default:
                System.out.println("Não é possivel fazer parcelas acima de 4 vezes ");
        }
    }
}