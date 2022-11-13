package calculator;

import floor.FloorStub;
import org.junit.jupiter.api.Test;
import tile.TileStub;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestWithStubObject {

    @Test
    void calculateTileCount(){
        //Arrange
        int expectedCount = 200;

        FloorStub floorStub = new FloorStub();

        TileStub tileStub = new TileStub();

        Calculator calculator = new Calculator();
        calculator.setFloor(floorStub);
        calculator.setTile(tileStub);

        //Acttile
        int actualCount = calculator.calculateTileCount();

        //Assert
        assertEquals(expectedCount, actualCount);
    }

}
