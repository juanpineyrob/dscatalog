package com.devsuperior.dscatalog.dtos;

import com.devsuperior.dscatalog.entities.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor @SuperBuilder
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private Long id;

    @NotBlank(message = "Campo obligatorio")
    private String firstName;
    private String lastName;

    @Email(message = "Ingresar email valido")
    private String email;

    Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(User entity) {
        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        email = entity.getEmail();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));

    }
}
