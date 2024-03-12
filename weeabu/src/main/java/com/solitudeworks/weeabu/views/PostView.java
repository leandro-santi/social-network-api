package com.solitudeworks.weeabu.views;

import java.time.LocalDateTime;

public record PostView(
        int id,
        String author,
        String text,
        LocalDateTime date
) {
}
