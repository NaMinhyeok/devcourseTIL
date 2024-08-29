package com.prgms.practiceboard.member;

import com.prgms.practiceboard.utils.BaseEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
}
