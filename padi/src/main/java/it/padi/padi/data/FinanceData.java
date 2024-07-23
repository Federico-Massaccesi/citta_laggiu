package it.padi.padi.data;

import it.padi.padi.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class FinanceData extends BaseEntity {

    private Double entrate;
    private Double spese;
}
