package calculator;

import floor.FloorFake;
import org.junit.jupiter.api.Test;
import tile.TileFake;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestWithFakeObject {

    @Test
    void calculateTileCount(){
        //Arrange
        int expectedCount = 200;

        FloorFake floorFake = new FloorFake();
        floorFake.setLength(600);
        floorFake.setWidth(500);

        TileFake tileFake = new TileFake();
        tileFake.setLength(50);
        tileFake.setWidth(30);

        Calculator calculator = new Calculator();
        calculator.setFloor(floorFake);
        calculator.setTile(tileFake);

        //Act
        int actualCount = calculator.calculateTileCount();

        //Assert
        assertEquals(expectedCount, actualCount);
    }
}
