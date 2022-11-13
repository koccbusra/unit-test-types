package calculator;

import floor.Floor;
import tile.Tile;

public class Calculator {

    private Floor floor;
    private Tile tile;

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public int calculateTileCount(){
        return floor.getArea() / tile.getArea();
    }
}