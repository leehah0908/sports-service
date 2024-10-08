package com.kbo_service.kbo_service.controller;

import com.kbo_service.kbo_service.entity.GameDetail;
import com.kbo_service.kbo_service.entity.GameList;
import com.kbo_service.kbo_service.service.GameService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    // 게임 상세보기
    @GetMapping("/detail/{gno}")
    public String detail(@PathVariable String gno,
                         Model model) {
        GameDetail detail = gameService.detail(gno);
        model.addAttribute("match", detail);
        return "detail";
    }
}
