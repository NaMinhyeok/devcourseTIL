package com.prgms.practiceboard.board;

import com.prgms.practiceboard.board.converter.BoardConverter;
import com.prgms.practiceboard.board.dto.BoardResponseDto;
import com.prgms.practiceboard.board.dto.CreateBoardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;
    private final BoardConverter boardConverter;

    @Transactional(readOnly = true)
    public List<BoardResponseDto> getBoards() {
        return boardConverter.toResponseDtoList(boardRepository.findAll());
    }

    @Transactional
    public void createBoard(CreateBoardRequestDto createBoardRequestDto) {
        Board board = boardConverter.toEntity(createBoardRequestDto);
        boardRepository.save(board);
    }

    @Transactional
    public void deleteBoard(UUID id) {
        boardRepository.deleteById(id);
    }

    public BoardResponseDto getBoard(UUID id) {
        return boardConverter.toResponseDto(boardRepository.findById(id).orElseThrow());
    }
}
