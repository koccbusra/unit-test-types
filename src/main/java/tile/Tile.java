package tile;

public class Tile {

    private int width;
    private int length;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return width * length;
    }
}
