package com.solitudeworks.weeabu.views;

import java.time.LocalDateTime;

public record PostView(
        int id,
        String username,
        String text,
        LocalDateTime date
) {
}
