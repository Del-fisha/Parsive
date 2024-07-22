package parsive.models;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.time.LocalDateTime;

@Getter
@Setter
public class Person {
    private String secondName;
    private String name;
    private String patronymic; //Отчество
    private LocalDateTime birthday;
    private List pictureList; //ToDo Определить в каком типе содержатся изображения
    private String notes; // Для записей комментариев при добавлении лица

    @Override
    public String toString() {
        if (secondName != null && name != null && patronymic != null) {
            return String.join(" ",secondName, name, patronymic);
        } else {
            return "Неустановленное лицо";
        }
    }
}
