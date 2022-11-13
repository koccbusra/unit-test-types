package calculator;

import floor.Floor;
import org.junit.jupiter.api.Test;
import tile.Tile;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTestWithRealObject {

    @Test
    void calculateTileCount() {
        //Arrange
        int expectedCount = 200;

        Floor floor = new Floor();
        floor.setLength(600);
        floor.setWidth(500);

        Tile tile = new Tile();
        tile.setLength(50);
        tile.setWidth(30);

        Calculator calculator = new Calculator();
        calculator.setFloor(floor);
        calculator.setTile(tile);

        //Act
        int actualCount = calculator.calculateTileCount();

        //Assert
        assertEquals(expectedCount, actualCount);
    }
}