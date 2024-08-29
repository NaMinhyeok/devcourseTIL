package com.prgms.practiceboard.comment;

import com.prgms.practiceboard.utils.BaseEntity;
import com.prgms.practiceboard.utils.DeleteStatus;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DeleteStatus isDeleted;
}
