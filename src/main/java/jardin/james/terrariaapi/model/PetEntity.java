package jardin.james.terrariaapi.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/22/2020 - 3:01PM
 */

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Component
@Entity
@Table(name = "pet")
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private long id;

    @NotBlank
    @Column(name = "pet_name")
    private String petName;

    @NotBlank
    @Column(name = "item_name")
    private String itemName;

    @NotBlank
    @Column(name = "tooltip")
    private String tooltip;
}
