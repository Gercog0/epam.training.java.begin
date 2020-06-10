package service;

import by.training.hometask1.entity.PointEmulator;
import by.training.hometask1.exception.UserException;
import by.training.hometask1.service.GeometryOperation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GeometryOperationTest {
    GeometryOperation geometryOperation;

    @BeforeClass
    public void setUp() {
        geometryOperation = new GeometryOperation();
    }

    @Test
    public void calculateLengthOfCircle_valid() {
        try {
            double radius = 10;
            double expected = Math.PI * 20;
            double actual = geometryOperation.calculateLengthOfCircle(radius);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test
    public void calculateLengthOfCircle_invalid() {
        try {
            double radius = 10;
            double expected = 1;
            double actual = geometryOperation.calculateLengthOfCircle(radius);
            assertNotEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateLengthOfCircle_incorrectData_invalid() throws UserException {
        geometryOperation.calculateLengthOfCircle(-23423);
    }

    @Test
    public void calculateAreaOfCircle_valid() {
        try {
            double radius = 10;
            double expected = Math.PI * 100;
            double actual = geometryOperation.calculateAreaOfCircle(radius);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test
    public void calculateAreaOfCircle_invalid() {
        try {
            double radius = 10;
            double expected = 2;
            double actual = geometryOperation.calculateAreaOfCircle(radius);
            assertNotEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateAreaOfCircle_incorrectData_invalid() throws UserException {
        geometryOperation.calculateLengthOfCircle(-134233);
    }

    @Test
    public void calculateNearestPoint_valid() {
        PointEmulator pointOne = new PointEmulator(21, 56);
        PointEmulator pointTwo = new PointEmulator(3, 4);
        PointEmulator expected = pointTwo;
        PointEmulator actual = geometryOperation.calculateNearestPoint(pointOne, pointTwo);
        assertSame(actual, expected);
    }

    @Test
    public void calculateNearestPoint_invalid() {
        PointEmulator pointOne = new PointEmulator(21, 56);
        PointEmulator pointTwo = new PointEmulator(3, 4);
        PointEmulator expected = pointOne;
        PointEmulator actual = geometryOperation.calculateNearestPoint(pointOne, pointTwo);
        assertNotSame(actual, expected);
    }

    @Test
    public void calculateAreaInscribedSquare_valid() {
        try {
            double expected = 15;
            double actual = geometryOperation.calculateAreaInscribedSquare(30);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test
    public void calculateAreaInscribedSquare_invalid() {
        try {
            double expected = 4224;
            double actual = geometryOperation.calculateAreaInscribedSquare(30);
            assertNotEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateAreaInscribedSquare_incorrectData_invalid() throws UserException {
        geometryOperation.calculateAreaInscribedSquare(-34223);
    }

    @Test
    public void calculateDifferenceSquares_valid() {
        try {
            double expected = 0.5;
            double actual = geometryOperation.calculateDifferenceSquares(30);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test
    public void calculateDifferenceSquares_invalid() {
        try {
            double expected = 4224;
            double actual = geometryOperation.calculateDifferenceSquares(30);
            assertNotEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateDifferenceSquares_incorrectData_invalid() throws UserException {
        geometryOperation.calculateDifferenceSquares(-34223);
    }

    @Test
    public void calculateSolutionFunctionOnSegment_valid() {
        String expected = "x= 1.0\ttg(x)= 1.5574077246549023\n";
        String actual = geometryOperation.calculateSolutionFunctionOnSegment(1, 1, 0.5);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateSolutionFunctionOnSegment_invalid() {
        String expected = "x= 1.0\ttg(x)= 17.0";
        String actual = geometryOperation.calculateSolutionFunctionOnSegment(1, 1, 0.5);
        assertNotEquals(actual, expected);
    }

    @AfterClass
    public void tierDown() {
        geometryOperation = null;
    }
}
