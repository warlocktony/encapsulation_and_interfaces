public class Truck extends EngineTransport {
    public Truck(String modelName,int wheelsCount){
        super(modelName,wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Check trailer ");
    }

    public void service() {
        super.service();
        checkTrailer();
    }

}
