package study.querydsl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hello { // Querydsl은 Qtype이란걸 뽑아내고 그 Qtype을 대상으로 쿼리를 날린다

    @Id @GeneratedValue
    private Long id;
}
