package parsive.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "event")
public class Event implements Serializable {

    @Id
    private UUID id;
    private Station station;
    private LocalDateTime date;
    private Person person;

}

/*
*
*     @Override
    public String toString() {
        return String.format("Дата события: %s\nСтанция: %s\nДанные о человеке: %s\n",
                date.format(FormatterDateAndTime.OUTPUT_FORMATTER), station, person);
    }
*
* */