public class Toucan extends Bird {
    private String beakColor;
    private String beakTexture;

    // constructors
    public Toucan(String nColor, int nHeight, double nAge) {
        super("Toucan", nColor, nHeight, nAge, 24999.99);
        this.beakColor = "Yellow";
        this.beakTexture = "Smooth";
    }

    public Toucan(String nColor, int nHeight, double nAge, String nBCol, String nBTex) {
        super("Toucan", nColor, nHeight, nAge, 24999.99);
        this.beakColor = nBCol;
        this.beakTexture = nBTex;
    }

    // setter methods
    public void setBeakColor(String nBCol) {
        beakColor = nBCol;
    }

    public void setBeakTexture(String nBTex) {
        beakTexture = nBTex;
    }

    // getter methods
    public String getBeakColor() {
        return beakColor;
    }

    public String getBeakTexture() {
        return beakTexture;
    }

    // toString()
    public String toString() {
        return super.toString() + "\nBeak Color: " + beakColor + "\nBeak Texture: " + beakTexture;
    }
}