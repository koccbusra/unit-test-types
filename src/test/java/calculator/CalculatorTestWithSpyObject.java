package calculator;

import floor.IFloor;
import floor.Floor;
import tile.ITile;
import tile.Tile;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestWithSpyObject {

    @Test
    void calculateTileCount() {
        //Arrange
        int expectedCount = 200;

        IFloor floorSpy = Mockito.spy(new Floor());
        floorSpy.setLength(600);
        floorSpy.setWidth(500);
        Mockito.verify(floorSpy).setLength(600);
        Mockito.verify(floorSpy).setWidth(500);

        ITile tileSpy = Mockito.spy(new Tile());
        tileSpy.setLength(50);
        tileSpy.setWidth(30);
        Mockito.verify(tileSpy).setLength(50);
        Mockito.verify(tileSpy).setWidth(30);

        Calculator calculator = new Calculator();
        calculator.setFloor(floorSpy);
        calculator.setTile(tileSpy);

        //Act
        int actualCount = calculator.calculateTileCount();

        //Assert
        assertEquals(expectedCount, actualCount);
    }
}