package tile;

public class Tile implements ITile {

    private int width;
    private int length;

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getArea() {
        return width * length;
    }
}
