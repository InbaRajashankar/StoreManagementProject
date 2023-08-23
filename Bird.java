// to create bird
public class Bird {
    private String type;
    private String color;
    private int height;
    private double age;

    private double price;

    public Bird() {
        this.type = "Cardinal";
        this.color = "Red";
        this.height = 22;
        this.age = 0.5;
        this.price = 1999.99;
    }

    public Bird(String nType, double nPrice) {
        this.type = nType;
        this.color = "Red";
        this.height = 22;
        this.age = 0.5;
        this.price = nPrice;
    }

    public Bird(String nType, String nColor, int nHeight, double nAge, double nPrice) {
        this.type = nType;
        this.color = nColor;
        this.height = nHeight;
        this.age = nAge;
        this.price = nPrice;
    }

    // setter methods
    public void setColor(String nColor) {
        this.color = nColor;
    }

    public void setHeight(int nHeight) {
        this.height = nHeight;
    }

    public void setAge(double nAge) {
        this.age = nAge;
    }

    // getter methods
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getAge() {
        return age;
    }

    // toString()
    public String toString() {
        return "Type: " + type + "\nColor: " + color + "\nHeight: " + height + "\nAge: " + age;
    }
}