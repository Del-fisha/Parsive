package parsive.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Station {
    private String name;
    private String name2;
    private String name3;

    @Override
    public String toString() {
        if (name2 != null && name3 != null) {
            return String.join(" - ", name, name2, name3);
        } else if (name2 != null) {
            return String.join(" - ", name, name2);
        } else {
            return name;
        }
    }
}
