package com.programmers.jpaboard.board.controller.dto;

import lombok.Getter;

@Getter
public class BoardCreationDto {
    private final String title;
    private final String content;

    public BoardCreationDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
