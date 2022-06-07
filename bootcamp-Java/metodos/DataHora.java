class DataHora {

    public static void MensagemHora(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Bom dia ");
                bomDia();
                break;

            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Boa tarde");
                boatarde();
                break;

            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Boa noite");
                boaNoite();
                break;

                
                default:
                System.out.println("Não existe esse horario");
                break;
                
            }
    }

    public static void bomDia() {
        System.out.println("bom dia");
    }

    public static void boatarde() {
        System.out.println("boa tarde");
    }

    public static void boaNoite() {
        System.out.println("boa noite");
    }
}