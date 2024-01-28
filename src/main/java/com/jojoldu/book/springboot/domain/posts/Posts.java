package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
// 기본 생성자 자동 추가
// public Posts() {} 와 같은 효과
@Entity
// 테이블과 링크될 클래스
// Posts 클래스가 BaseTimeEntity 를 상속받도록 변경.
public class Posts extends BaseTimeEntity {
    // 실제 DB 의 테이블과 매칭될 클래스 이며 보통 Entity 클래스라고도 합니다 .
    // JPA 를 사용하게되면 DB 데이터에 작업할 경우 실제쿼리를 날리기보다는, 이 Entity 클래스의 수정을 통해 작업한다.

    @Id
    // 해당 테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (length = 500, nullable = false)
    private String title;

    @Column (columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update (String title, String content) {
        this.title = title;
        this.content = content;
    }
}
