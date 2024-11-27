public class ElectricTransportFactory extends TransportFactory {
    @Override
    public Transport createScooter() {
        return new ElectricScooter();
    }

    @Override
    public Transport createBike() {
        return new ElectricBike();
    }

    @Override
    public Transport createBicycle() {
        System.out.println("Bicicletas movidas à bateria não disponíveis.");
        return null;
    }

    @Override
    public Transport createRollerSkates() {
        System.out.println("Patins movidos a bateria não disponíveis.");
        return null;
    }

    @Override
    public Transport createSkateboard() {
        System.out.println("Skates movidos a bateria não disponíveis.");
        return null;
    }
}