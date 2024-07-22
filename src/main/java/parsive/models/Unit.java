package parsive.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "units")
public class Unit {

    @Id
    UUID id;
    String name;
    UUID parentId;
    Integer price;
    Date updateDate;

}
