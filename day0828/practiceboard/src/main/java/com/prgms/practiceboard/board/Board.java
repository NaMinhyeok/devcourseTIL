package com.prgms.practiceboard.board;

import com.prgms.practiceboard.utils.BaseEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;
}
