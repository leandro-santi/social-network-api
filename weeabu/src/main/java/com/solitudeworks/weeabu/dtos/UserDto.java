package com.solitudeworks.weeabu.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record UserDto(
        @NotEmpty String username,
        String about,
        @NotEmpty String email,
        @NotEmpty @Size(min = 8, max = 16) String password
) {
}
