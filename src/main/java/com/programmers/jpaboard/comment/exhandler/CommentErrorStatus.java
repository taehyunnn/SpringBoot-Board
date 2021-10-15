package com.programmers.jpaboard.comment.exhandler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum CommentErrorStatus {
    COMMENT_NOT_FOUND(HttpStatus.BAD_REQUEST.value(), "Board Not Found"),
    METHOD_ARGUMENT_NOT_VALID(HttpStatus.BAD_REQUEST.value(), "MethodArgument Not Valid"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());

    private final int code;
    private final String message;

    CommentErrorStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
