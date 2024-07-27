package parsive.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Person")
public class Person implements Serializable {

    @Id
    private UUID id;
    private String name;
    private String patronymic; //Отчество
    private String lastName;
    //private List pictureList; //ToDo Определить в каком типе содержатся изображения
    //private LocalDateTime birthday;
    private Boolean isKnown;
    private String notes; // Для записей комментариев при добавлении лица


}


/*
*     @Override
    public String toString() {
        if (secondName != null && name != null && patronymic != null) {
            return String.join(" ",secondName, name, patronymic);
        } else {
            return "Неустановленное лицо";
        }
    }
* */