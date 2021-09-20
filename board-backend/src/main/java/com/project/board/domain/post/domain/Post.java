package com.project.board.domain.post.domain;

import com.project.board.domain.user.domain.User;
import com.project.board.global.common.DateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
public class Post extends DateTime implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =  500)
    private String title;

    @Column(nullable = false)
    @Lob //가변 길이를 갖는 큰 데이터 저장 시 사용
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_post_user", value =  ConstraintMode.NO_CONSTRAINT))
    private User user;

    @Builder
    public Post(String title, String content, User user){
        this.title = title;
        this.content = content;
        this.user = user;
    }
}
