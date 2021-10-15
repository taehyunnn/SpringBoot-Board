package com.programmers.jpaboard.comment.exception;

import java.text.MessageFormat;

public class CommentNotFoundException extends RuntimeException {
    public CommentNotFoundException(Long commentId) {
        super(MessageFormat.format("commentId : {0}", commentId));
    }
}