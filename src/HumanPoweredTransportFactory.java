public class HumanPoweredTransportFactory extends TransportFactory {
    @Override
    public Transport createScooter() {
        System.out.println("Patinetes movidos à bateria não disponíveis.");
        return null;
    }

    @Override
    public Transport createBike() {
        System.out.println("Bicicletas movidas à bateria não disponíveis.");
        return null;
    }

    @Override
    public Transport createBicycle() {
        return new Bicycle();
    }

    @Override
    public Transport createRollerSkates() {
        return new RollerSkates();
    }

    @Override
    public Transport createSkateboard() {
        return new Skateboard();
    }
}