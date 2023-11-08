public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;

    private String operatingSystem;

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "storageCapacity=" + storageCapacity +
                ", model='" + model + '\'' +
                ", maker='" + maker + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' + ", ";
    }
}
