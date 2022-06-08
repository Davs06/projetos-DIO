import java.util.Scanner;

class ControleFluxoMain {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        
        
        
        // exercicio dia da semana
        String diaSemana ;

        System.out.println("entre com o dia da semana");
        diaSemana = sc1.next();
        
        switch (diaSemana) {
            case "segunda":
                System.out.println("Dia 1");break;
            case "terca ":
                System.out.println("Dia 2");break;
            case "quarta":
                System.out.println("Dia 3");break;
            case "quinta":
                System.out.println("Dia 4");break;
            case "sexta":
                System.out.println("Dia 5");break;
            case "sabado":
                System.out.println("Dia 6");break;
            case "domingo":
                System.out.println("Dia 7");break;
        }

    }
}