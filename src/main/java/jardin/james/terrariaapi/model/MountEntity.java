package jardin.james.terrariaapi.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/24/2020 - 3:07PM
 */

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Component
@Entity
@Table(name = "mount")
public class MountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mount")
    private long id;

    @NotBlank
    @Column(name = "mount_name")
    private String mountName;

    @NotBlank
    @Column(name = "item_name")
    private String itemName;

    @NotBlank
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "mount_speed")
    private int mountSpeed;

    @NotNull
    @Column(name = "jump_height")
    private int jumpHeight;
}
