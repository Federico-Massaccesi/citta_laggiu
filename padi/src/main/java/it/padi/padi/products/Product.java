package it.padi.padi.products;

import it.padi.padi.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Product  extends BaseEntity {

    private String name;

    private String imageUrl;

    private Double price;
    @Builder.Default
    private Integer quantity = 0;

}
