package calculator;

import floor.IFloor;
import tile.ITile;

public class Calculator {

    private IFloor floor;
    private ITile tile;

    public void setTile(ITile tile) {
        this.tile = tile;
    }

    public void setFloor(IFloor floor) {
        this.floor = floor;
    }

    public int calculateTileCount(){
        return floor.getArea() / tile.getArea();
    }
}