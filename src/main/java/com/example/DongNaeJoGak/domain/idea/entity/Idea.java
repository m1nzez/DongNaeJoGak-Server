package com.example.DongNaeJoGak.domain.idea.entity;

import com.example.DongNaeJoGak.domain.comment.entity.Comment;
import com.example.DongNaeJoGak.domain.member.entity.Member;
import com.example.DongNaeJoGak.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "idea")
public class Idea extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idea_id")
    private Long id;

    @Column(name = "ip_address")
    private String ipAddress;

    private Double latitude;

    private Double longtitude;

    private String title;

    private String content;

    private String image;

    private Long ideaLikeNum = 0L;

    private Long ideaDisLikeNum = 0L;

    @Column(name = "idea_status")
    private IdeaStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @OneToMany(mappedBy = "idea", cascade = CascadeType.ALL)
    private List<Comment> comments;
}

