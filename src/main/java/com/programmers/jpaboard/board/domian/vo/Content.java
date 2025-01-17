package com.programmers.jpaboard.board.domian.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Content {

    public static final int MAX_LENGTH = 100000;

    @Lob
    private String content;

    public Content(String content) {
        this.content = content;
    }
}
