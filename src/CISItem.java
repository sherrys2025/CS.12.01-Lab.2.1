public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' + ", ";
    }
}
