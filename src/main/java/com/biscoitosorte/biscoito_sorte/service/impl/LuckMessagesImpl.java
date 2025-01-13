package com.biscoitosorte.biscoito_sorte.service.impl;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageCreateRequest;
import com.biscoitosorte.biscoito_sorte.dto.request.LuckMessageUpdateRequest;
import com.biscoitosorte.biscoito_sorte.dto.response.LuckMessageResponse;
import com.biscoitosorte.biscoito_sorte.exception.LuckMessageDadosInvalidosException;
import com.biscoitosorte.biscoito_sorte.exception.MessageNotFoundException;
import com.biscoitosorte.biscoito_sorte.model.LuckMessage;
import com.biscoitosorte.biscoito_sorte.repository.LuckMessagesRepository;
import com.biscoitosorte.biscoito_sorte.service.LuckMessagesService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LuckMessagesImpl implements LuckMessagesService{

    private final LuckMessagesRepository luckMessagesRepository;

    public void createNewMessage(LuckMessageCreateRequest request){
        if(request.message() == null || request.message().isBlank()) 
            throw new LuckMessageDadosInvalidosException("Mensagem");
        if(request.message() == null || request.author().isBlank()) 
            throw new LuckMessageDadosInvalidosException("Autor");
        luckMessagesRepository.save(new LuckMessage(request.message(), request.author()));
    }

    public Long countAllMessages(){
        return luckMessagesRepository.count();
    }

    public LuckMessageResponse getRandomMessage(){
        LuckMessage message = luckMessagesRepository.getRandomLuckMessage();
        System.out.println(message.getMessage());
        return new LuckMessageResponse(message.getMessage(), message.getAuthor());
    }

    public LuckMessage findMessageByUuid(UUID uuid){
        if(uuid == null) throw new LuckMessageDadosInvalidosException("uuid");
        return luckMessagesRepository.findByUuid(uuid).orElseThrow(
            () -> new MessageNotFoundException("Mensagem não encontrada")
        );
    }

    public LuckMessageResponse updateMessageByUuid(UUID uuid, LuckMessageUpdateRequest updateRequest){
        if(updateRequest.message() == null || updateRequest.message().isBlank())
        throw new IllegalArgumentException("Mensagem não encontrada");
        if(uuid == null)
        throw new LuckMessageDadosInvalidosException("uuid");
        LuckMessage luckMessage = luckMessagesRepository.findByUuid(uuid).orElseThrow(
            () -> new MessageNotFoundException("Mensagem não encontrada")
        );
        luckMessage.setMessage(updateRequest.message());
        luckMessage.setAuthor(updateRequest.author());
        luckMessage.setUpdateAt(LocalDateTime.now());
        luckMessagesRepository.save(luckMessage);
        return new LuckMessageResponse(updateRequest.message(), updateRequest.author());
    }

    public void deleteMessageByUuid(UUID uuid){
        if(uuid == null)
        throw new LuckMessageDadosInvalidosException("uuid");
        LuckMessage luckMessage = luckMessagesRepository.findByUuid(uuid).orElseThrow(
            () -> new MessageNotFoundException("Mensagem não encontrada")
        );

        luckMessage.setDeleteAt(LocalDateTime.now());
        luckMessage.setIsActive(false);
        luckMessagesRepository.save(luckMessage);
    }

    public Page<LuckMessage> getAllMensages(Pageable pageable) {
        return luckMessagesRepository.findAll(pageable);
    }
}
