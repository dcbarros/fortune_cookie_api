package com.biscoitosorte.biscoito_sorte.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageCreateRequest;
import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageUpdateRequest;
import com.biscoitosorte.biscoito_sorte.dto.response.LuckMessageResponse;
import com.biscoitosorte.biscoito_sorte.model.LuckMessage;
import com.biscoitosorte.biscoito_sorte.repository.LuckMessagesRepository;

@Service
public class LuckMessagesService {

    private final LuckMessagesRepository luckMessagesRepository;

    public LuckMessagesService(LuckMessagesRepository luckMessagesRepository) {
        this.luckMessagesRepository = luckMessagesRepository;
    }

    public void createNewMessage(LuckMessageCreateRequest request){
        if(request.message() == null || request.message().isBlank()) throw new IllegalArgumentException("Mensagem inválida");
        luckMessagesRepository.save(new LuckMessage(request.message()));
    }

    public Long countAllMessages(){
        return luckMessagesRepository.count();
    }

    public LuckMessageResponse getRandomMessage(){
        return new LuckMessageResponse(luckMessagesRepository.getRandomLuckMessage().getMessage());
    }

    public LuckMessage findMessageByUuid(UUID uuid){
        if(uuid == null) throw new IllegalArgumentException("Uuid inválido");
        return luckMessagesRepository.findByUuid(uuid).orElseThrow(
            () -> new RuntimeException("Mensagem não encontrada")
        );
    }

    public void updateMessageByUuid(UUID uuid, LuckMessageUpdateRequest updateRequest){
        if(updateRequest.message() == null || updateRequest.message().isBlank())
        throw new IllegalArgumentException("Mensagem inválida");
        if(uuid == null)
        throw new IllegalArgumentException("uuid inválido");
        LuckMessage luckMessage = luckMessagesRepository.findByUuid(uuid).orElseThrow(
            () -> new RuntimeException("Mensagem não encontrada")
        );
        luckMessage.setMessage(updateRequest.message());
        luckMessage.setUpdateAt(LocalDateTime.now());
        luckMessagesRepository.save(luckMessage);
    }

    public void deleteMessageByUuid(UUID uuid){
        if(uuid == null)
        throw new IllegalArgumentException("uuid inválido");
        LuckMessage luckMessage = luckMessagesRepository.findByUuid(uuid).orElseThrow(
            () -> new RuntimeException("Mensagem não encontrada")
        );

        luckMessage.setDeleteAt(LocalDateTime.now());
        luckMessage.setIsActive(false);
        luckMessagesRepository.save(luckMessage);
    }
}
