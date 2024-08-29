package com.prgms.practiceboard.board.converter;

import com.prgms.practiceboard.board.Board;
import com.prgms.practiceboard.board.dto.BoardResponseDto;
import com.prgms.practiceboard.board.dto.CreateBoardRequestDto;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BoardConverter {
    public BoardResponseDto toResponseDto(Board board) {
        return new BoardResponseDto(board.getTitle(), board.getContent());
    }

    public List<BoardResponseDto> toResponseDtoList(List<Board> boards) {
        return boards.stream()
                .map(this::toResponseDto)
                .toList();
    }

    @Builder
    public Board toEntity(CreateBoardRequestDto createBoardRequestDto) {
        return Board.builder()
                .title(createBoardRequestDto.title())
                .content(createBoardRequestDto.content())
                .build();
    }

}
