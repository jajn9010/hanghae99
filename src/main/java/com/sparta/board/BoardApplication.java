package com.sparta.board;

import com.sparta.board.domain.Board;
import com.sparta.board.domain.BoardRepository;
import com.sparta.board.domain.BoardRequestDto;
import com.sparta.board.service.BoardService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.TimeZone;

@EnableJpaAuditing
@SpringBootApplication
public class BoardApplication {

    @PostConstruct
    public void time() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }

    public static void main(String[] args) {
        SpringApplication.run(BoardApplication.class, args);
    }

}
