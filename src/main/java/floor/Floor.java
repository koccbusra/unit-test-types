package floor;

public class Floor {

    private int width;
    private int length;

    public int getArea() {
        return width * length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
