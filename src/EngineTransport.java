public class EngineTransport extends TransportSettings {
    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    public void checkEngine() {

        System.out.println("Check engine");
    }

    public void service() {
        super.service();
        checkEngine();
    }
}
