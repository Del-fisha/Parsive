package parsive.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Event {
    private int id;
    private Station station;
    private Person person;
    private LocalDateTime date; //ToDo Привести к DateTimeFormatter

    @Override
    public String toString() {
        return String.format("Дата события: %s\nСтанция: %s\nДанные о человеке: %s\n",
                date.toString(), station, person);
    }
}
