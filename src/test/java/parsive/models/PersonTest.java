package parsive.models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import parsive.ConfigurationClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = {ConfigurationClass.class})
class PersonTest {
    @Test
    void contextLoads() {
    }

    @Test
    void testToStringWithFullName() {
        Person person = new Person();
        person.setSecondName("Иванов");
        person.setName("Иван");
        person.setPatronymic("Иванович");

        String expectedOutput = "Иванов Иван Иванович";
        String actualOutput = person.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о человеке с полным именем " +
                "не соответствует ожидаемому");
    }

    @Test
    void testToStringWithMissingFields() {
        Person person = new Person();
        person.setSecondName("Петров");

        String expectedOutput = "Неустановленное лицо";
        String actualOutput = person.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о человеке с неполным именем " +
                "не соответствует ожидаемому");
    }

    @Test
    void testToStringWithNoName() {
        Person person = new Person();

        String expectedOutput = "Неустановленное лицо";
        String actualOutput = person.toString();

        assertEquals(expectedOutput, actualOutput, "Вывод информации о человеке без имени " +
                "не соответствует ожидаемому");
    }
}