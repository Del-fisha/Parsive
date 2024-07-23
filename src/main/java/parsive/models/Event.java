package parsive.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Setter
@Component
public class Event {
    private int id;
    private Station station;
    private Person person;
    private LocalDateTime date;

    @Override
    public String toString() {
        return String.format("Дата события: %s\nСтанция: %s\nДанные о человеке: %s\n",
                date.format(FormatterDateAndTime.OUTPUT_FORMATTER), station, person);
    }
}
