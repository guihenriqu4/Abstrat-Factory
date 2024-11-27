import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número do tipo de transporte desejado:");
        System.out.println("1 - Patinete Elétrico");
        System.out.println("2 - Bicicleta Elétrica");
        System.out.println("3 - Bicicleta Convencional");
        System.out.println("4 - Patins");
        System.out.println("5 - Skate");
        int choice = scanner.nextInt();

        TransportFactory factory = null;
        Transport transport = null;

        switch (choice) {
            case 1:
                factory = new ElectricTransportFactory();
                transport = factory.createScooter();
                break;
            case 2:
                factory = new ElectricTransportFactory();
                transport = factory.createBike();
                break;
            case 3:
                factory = new HumanPoweredTransportFactory();
                transport = factory.createBike();
                break;
            case 4:
                factory = new HumanPoweredTransportFactory();
                transport = factory.createRollerSkates();
                break;
            case 5:
                factory = new HumanPoweredTransportFactory();
                transport = factory.createSkateboard();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        if (transport != null) {
            transport.ride();
        } else {
            System.out.println("Não foi possível criar o transporte selecionado.");
        }
    }
}