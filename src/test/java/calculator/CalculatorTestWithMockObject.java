package calculator;

import floor.Floor;
import floor.IFloor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tile.ITile;
import tile.Tile;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestWithMockObject {

    @Test
    void calculateTileCount() {
        //Arrange
        int expectedCount = 200;

        IFloor floorMock = Mockito.mock(IFloor.class);
        Mockito.when(floorMock.getArea()).thenReturn(300000);

        ITile tileMock = Mockito.mock(ITile.class);
        Mockito.when(tileMock.getArea()).thenReturn(1500);

        Calculator calculator = new Calculator();
        calculator.setFloor(floorMock);
        calculator.setTile(tileMock);

        //Act
        int actualCount = calculator.calculateTileCount();

        //Assert
        assertEquals(expectedCount, actualCount);
    }
}
