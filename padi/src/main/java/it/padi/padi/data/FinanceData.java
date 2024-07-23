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
    @Builder.Default
    private Double entrate = 0.0;
    @Builder.Default
    private Double spese = 0.0;
}
