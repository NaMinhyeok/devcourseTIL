package com.prgms.practiceboard.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/board")
public class BoardController {

    private final BoardService boardService;
}
