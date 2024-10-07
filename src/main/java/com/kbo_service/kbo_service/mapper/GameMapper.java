package com.kbo_service.kbo_service.mapper;

import com.kbo_service.kbo_service.entity.Game;
import com.kbo_service.kbo_service.entity.GameDetail;
import com.kbo_service.kbo_service.entity.GameList;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface GameMapper {

    // 게임 목록 조회
    List<GameList> findAll();

    // 게임 상세 조회
    GameDetail findOne(String gameId);

    // 게임 필터 조회
    List<Game> findFilter(String team, String sports, int month);

}
