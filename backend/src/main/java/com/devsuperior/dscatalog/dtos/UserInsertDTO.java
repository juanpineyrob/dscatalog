package com.devsuperior.dscatalog.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor @SuperBuilder
@AllArgsConstructor
@Getter
@Setter
public class UserInsertDTO extends UserDTO {
    private String password;
}
