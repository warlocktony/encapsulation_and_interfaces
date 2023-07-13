public class TransportSettings {
    private String modelName;
    private int wheelsCount;

    public TransportSettings(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }
    public void updateTyre() {
        System.out.println("Change tyre");
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void service() {
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }

}
