package some;



/**
 * TeaPod.
 *
 * @author Igor_Zolov
 */

public class TeaPod {

    public static int bt = 100;

    private String color;
    private int volume;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getVolume() {
        return volume;
    }

    public TeaPod(String color, int volume) {
        this.color = color;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Цвет: " + color + ", Объём: " + volume;
    }

    public static void main(String[] args) {

        var g = "";

        var s = "SSSSSSSS";

        var len = s.length();

        System.out.println(len);
    }
}
