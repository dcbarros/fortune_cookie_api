package com.biscoitosorte.biscoito_sorte.model;

import java.util.UUID;

import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@SQLRestriction("is_active = true")
public class LuckMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private UUID uuid;
    private String message;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private LocalDateTime deleteAt;
    private Boolean isActive;


    public LuckMessage(String message) {
        try {
            this.uuid = UUID.randomUUID();
        } catch (Exception e) {
            this.uuid = UUID.randomUUID();
        }
        this.message = message;
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
        this.deleteAt = LocalDateTime.now();
        this.isActive = true;
    }    

}
