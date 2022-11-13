package tile;

public class Tile implements ITile {

    private int width;
    private int length;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getArea() {
        return width * length;
    }
}
