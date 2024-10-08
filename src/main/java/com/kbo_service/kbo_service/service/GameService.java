package com.kbo_service.kbo_service.service;

import com.kbo_service.kbo_service.entity.Game;
import com.kbo_service.kbo_service.entity.GameDetail;
import com.kbo_service.kbo_service.entity.GameList;
import com.kbo_service.kbo_service.mapper.GameMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameMapper mapper;

    public List<GameList> findAll() {
        return mapper.findAll();
    }

    public GameDetail detail(String gameId) {
        System.out.println(mapper.findOne(gameId));
        return mapper.findOne(gameId);
    }
}
