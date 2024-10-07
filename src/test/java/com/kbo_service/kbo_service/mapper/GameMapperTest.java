package com.kbo_service.kbo_service.mapper;

import com.kbo_service.kbo_service.entity.Game;
import com.kbo_service.kbo_service.entity.GameDetail;
import com.kbo_service.kbo_service.entity.GameList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
class GameMapperTest {

    @Autowired
    GameMapper mapper;

    @Test
    @DisplayName("전제 조회를 하면 799이 나와야 함")
    void findAllTest() {
        // given

        // when
        List<GameList> allList = mapper.findAll();
        System.out.println(allList.get(9));

        // then
        assertEquals(allList.size(), 799);
    }

    @Test
    @DisplayName("특정 게임 정보를 가져와야 함 -> 20240330LGWO0게임의 관중 수는 13462명이다.")
    void findOneTest() {
        // given
        String gameId = "20240330LGWO0";

        // when
        GameDetail game = mapper.findOne(gameId);
        System.out.println(game.toString());

        // then
        assertEquals(game.getCrowd(), 13462);
    }

    @Test
    @DisplayName("팀을 키움으로 했을 때 27 경기가 나와야 함")
    void FilterTest() {
        // given

        // when
        List<Game> filter = mapper.findFilter("키움", "baseball", 5);

        // then
        assertEquals(filter.size(), 27);

    }

}