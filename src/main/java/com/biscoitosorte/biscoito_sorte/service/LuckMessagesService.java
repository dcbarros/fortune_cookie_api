package com.biscoitosorte.biscoito_sorte.service;

import java.util.UUID;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageCreateRequest;
import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageUpdateRequest;
import com.biscoitosorte.biscoito_sorte.dto.response.LuckMessageResponse;
import com.biscoitosorte.biscoito_sorte.model.LuckMessage;

public interface LuckMessagesService {
    public void createNewMessage(LuckMessageCreateRequest request);
    public Long countAllMessages();
    public LuckMessageResponse getRandomMessage();
    public LuckMessage findMessageByUuid(UUID uuid);
    public LuckMessageResponse updateMessageByUuid(UUID uuid, LuckMessageUpdateRequest updateRequest);
    public void deleteMessageByUuid(UUID uuid);
    public Page<LuckMessage> getAllMensages(Pageable pageable);

}
