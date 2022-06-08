
public class ExercicioMetodosMain {

    public static void main(String[] args) {

        // operadores matematicos
        System.out.println("Calculadora");
        Operadores.soma(15, 20);
        Operadores.subtração(50, 17);
        Operadores.multiplicação(9, 9);
        Operadores.divisão(20, 5);
        Operadores.mod(21, 5);

        // Hora do dia
        System.out.println( "\nInforme o horario e veja se é dia tarde ou noite");
        DataHora.MensagemHora(5);
        DataHora.MensagemHora(15);
        DataHora.MensagemHora(22);
        DataHora.MensagemHora(27);

        // emprestimo
        System.out.println("\nInforme o valor e o numero de parcelas ");
        Emprestimo.calculo(1000, 2);
        Emprestimo.calculo(1000, 3);
        Emprestimo.calculo(1000, 4);
        Emprestimo.calculo(1000, 5);
    }
}