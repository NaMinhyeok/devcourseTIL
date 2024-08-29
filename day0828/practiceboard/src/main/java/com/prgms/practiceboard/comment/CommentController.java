package com.prgms.practiceboard.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/comment")
public class CommentController {

    private final CommentService commentService;
}
