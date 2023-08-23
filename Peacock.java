public class Peacock extends Bird{

    private String pattern;
    private String patternColor;

    // constructors
   public Peacock(String nColor, int nHeight, double nAge) {
        super("Peacock", nColor, nHeight, nAge, 49999.99);
        this.pattern = "eye";
        this.patternColor = "Green feathers with blue eyes";
    }

    public Peacock(String nColor, int nHeight, double nAge, String nPattern, String nPColor) {
        super("Peacock", nColor, nHeight, nAge, 49999.99);
        this.pattern = nPattern;
        this.patternColor = nPColor;
    }

    // setter methods
    public void setPattern(String nPattern) {
        this.pattern = nPattern;
    }

    public void setPatternColor(String nPColor) {
        this.patternColor = nPColor;
    }

    // getter methods
    public String getPattern() {
        return pattern;
    }

    public String getPatternColor() {
        return patternColor;
    }

    // toString()
    public String toString() {
        return super.toString() + "\nFeather Pattern: " + pattern + "\nFeather Pattern Color: " + patternColor;
    }
 }