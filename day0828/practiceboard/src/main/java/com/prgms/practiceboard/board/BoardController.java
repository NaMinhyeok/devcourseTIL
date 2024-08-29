package com.prgms.practiceboard.board;

import com.prgms.practiceboard.board.dto.BoardResponseDto;
import com.prgms.practiceboard.board.dto.CreateBoardRequestDto;
import com.prgms.practiceboard.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boards")
    public ResponseEntity<ApiResponse<List<BoardResponseDto>>> getAllBoards() {
        return ResponseEntity.ok(ApiResponse.createSuccess(boardService.getBoards()));
    }

    @GetMapping("/board/{id}")
    public ResponseEntity<ApiResponse<BoardResponseDto>> getBoard(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.createSuccess(boardService.getBoard(id)));
    }

    @PostMapping("/board")
    public ResponseEntity<ApiResponse<?>> createBoard(@RequestBody CreateBoardRequestDto createBoardRequestDto) {
        boardService.createBoard(createBoardRequestDto);
        return ResponseEntity.ok(ApiResponse.createSuccessWithNoContent());
    }

    @DeleteMapping("/board/{id}")
    public ResponseEntity<ApiResponse<?>> deleteBoard(@PathVariable UUID id) {
        boardService.deleteBoard(id);
        return ResponseEntity.ok(ApiResponse.createSuccessWithNoContent());
    }
}
