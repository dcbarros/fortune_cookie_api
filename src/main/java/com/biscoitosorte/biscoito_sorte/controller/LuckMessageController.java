package com.biscoitosorte.biscoito_sorte.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biscoitosorte.biscoito_sorte.service.LuckMessagesService;

@RestController
@RequestMapping("/luck-message/api/v1")
public class LuckMessageController {

    private LuckMessagesService luckMessagesService;

    public LuckMessageController(LuckMessagesService luckMessagesService) {
        this.luckMessagesService = luckMessagesService;
    }


    //To-Do List: Criar os métodos, Criar as Excessões, Criar o Banco de dados, Criar os testes
}
