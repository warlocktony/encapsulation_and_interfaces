public class ServiceStation implements Service {
    public void check(TransportSettings transportSettings) {
        if(transportSettings != null){
            System.out.println("Service " + transportSettings.getModelName());
            transportSettings.service();

        }
    }
}
