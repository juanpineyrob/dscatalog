package com.devsuperior.dscatalog.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomError {
    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;
}
