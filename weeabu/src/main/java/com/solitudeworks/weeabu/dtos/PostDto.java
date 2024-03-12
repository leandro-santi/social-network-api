package com.solitudeworks.weeabu.dtos;

import jakarta.validation.constraints.NotEmpty;

public record PostDto(
        @NotEmpty String text,
        @NotEmpty String author
) {
}
