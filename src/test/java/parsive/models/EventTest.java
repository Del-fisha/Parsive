package parsive.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventTest {
    Station station1;
    Person person1;
    Event event1;

    Station station2;
    Person person2;
    Event event2;

    @BeforeEach
    void setUp() {
        station1 = new Station();
        station1.setName("Приморская");
        person1 = new Person();
        person1.setSecondName("Иванов");
        person1.setName("Борис");
        person1.setPatronymic("Николаевич");
        event1 = new Event();
        event1.setPerson(person1);
        event1.setStation(station1);
        event1.setDate(LocalDateTime.of(2024, 12, 5, 23, 19));

        station2 = new Station();
        station2.setName("Сенная площадь");
        station2.setName2("Спасская");
        station2.setName3("Садовая");
        person2 = new Person();
        event2 = new Event();
        event2.setPerson(person2);
        event2.setStation(station2);
        event2.setDate(LocalDateTime.of(2024, 3, 21, 7, 25));

    }

    @Test
    void testToStringEvent() {
        String expectedOutput = """
                Дата события: 05 декабря 2024 23:19
                Станция: Приморская
                Данные о человеке: Иванов Борис Николаевич
                """;
        String actualOutput = event1.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о событии " +
                "не соответствует ожидаемому");
    }

    @Test
    void testToStringEventUnknownPerson() {
        String expectedOutput = """
                Дата события: 21 марта 2024 07:25
                Станция: Сенная площадь - Спасская - Садовая
                Данные о человеке: Неустановленное лицо
                """;
        String actualOutput = event2.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о событии " +
                "не соответствует ожидаемому");
    }
}