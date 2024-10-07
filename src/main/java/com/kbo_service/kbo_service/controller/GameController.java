package com.kbo_service.kbo_service.controller;

import com.kbo_service.kbo_service.entity.GameList;
import com.kbo_service.kbo_service.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {

    private final GameService gameService;

    // 게임 목록 조회
    @GetMapping("/list")
    public String list(Model model) {
        List<GameList> allList = gameService.findAll();
        model.addAttribute("gameList", allList);
        return "main";
    }
}
