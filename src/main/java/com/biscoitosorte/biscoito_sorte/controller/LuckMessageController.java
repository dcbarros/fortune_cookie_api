package com.biscoitosorte.biscoito_sorte.controller;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageCreateRequest;
import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageUpdateRequest;
import com.biscoitosorte.biscoito_sorte.dto.response.LuckMessageResponse;
import com.biscoitosorte.biscoito_sorte.model.LuckMessage;
import com.biscoitosorte.biscoito_sorte.service.LuckMessagesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/luck-message/api/v1")
@RequiredArgsConstructor
public class LuckMessageController {
    private final LuckMessagesService luckMessagesService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewLuckMessage(@RequestBody LuckMessageCreateRequest request) {
        luckMessagesService.createNewMessage(request);
    }

    @GetMapping("random")
    @ResponseStatus(HttpStatus.OK)
    public LuckMessageResponse getRandomMessage() {
        return luckMessagesService.getRandomMessage();
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<LuckMessageResponse> updateMessage(
            @PathVariable UUID uuid,
            @RequestBody LuckMessageUpdateRequest request) {
        return ResponseEntity.ok(luckMessagesService.updateMessageByUuid(uuid, request));
    }

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteMessage(@PathVariable UUID uuid) {
        luckMessagesService.deleteMessageByUuid(uuid);
    }

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public Page<LuckMessage> getAllMessages(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createAt").descending());
        return luckMessagesService.getAllMensages(pageable);
    }
}
