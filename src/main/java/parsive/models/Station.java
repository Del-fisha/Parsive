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
@Table(name = "Station")
public class Station implements Serializable {

    @Id
    private UUID id;
    private String name;
    private String altName;

}


/*
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
*/