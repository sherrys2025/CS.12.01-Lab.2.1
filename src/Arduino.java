public class Arduino extends ElectronicItem{
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Arduino{" + super.toString() +
                "version='" + version + '\'' +
                '}';
    }
}
