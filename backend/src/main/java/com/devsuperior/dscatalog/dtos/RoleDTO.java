package com.devsuperior.dscatalog.dtos;

import com.devsuperior.dscatalog.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoleDTO {
    private Long id;
    private String authority;

    public RoleDTO(Role entity) {
        id = entity.getId();
        authority = entity.getAuthority();
    }

}
