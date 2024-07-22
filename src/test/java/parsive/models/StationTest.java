package parsive.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {
    Station stationOneName;
    Station stationTwoName;
    Station stationThreeName;

    @BeforeEach
    void setUp() {
        stationOneName = new Station();
        stationOneName.setName("Гражданский проспект");

        stationTwoName = new Station();
        stationTwoName.setName("Невский проспект");
        stationTwoName.setName2("Гостиный двор");

        stationThreeName = new Station();
        stationThreeName.setName("Садовая");
        stationThreeName.setName2("Спасская");
        stationThreeName.setName3("Сенная площадь");
    }

    @Test
    void testToStringOneName() {
        String expectedOutput = "Гражданский проспект";
        String actualOutput = stationOneName.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о станции с одним названием " +
                "не соответствует ожидаемому");
    }

    @Test
    void testToStringTwoName() {
        String expectedOutput = "Невский проспект - Гостиный двор";
        String actualOutput = stationTwoName.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о станции с двумя названиями " +
                "не соответствует ожидаемому");
    }

    @Test
    void testToStringThreeName() {
        String expectedOutput = "Садовая - Спасская - Сенная площадь";
        String actualOutput = stationThreeName.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о станции с тремя названиями " +
                "не соответствует ожидаемому");
    }
}