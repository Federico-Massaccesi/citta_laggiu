package it.padi.padi.user;

import it.padi.padi.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Guest  extends BaseEntity {

    private String name;

    @Builder.Default
    private Integer debt = 0;
}
