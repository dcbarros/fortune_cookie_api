package com.biscoitosorte.biscoito_sorte.model;

import java.util.UUID;

import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@SQLRestriction("is_active = true")
@Table(name = "luck_message")
public class LuckMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private UUID uuid;
    private String message;
    private String author;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private LocalDateTime deleteAt;
    private Boolean isActive;


    public LuckMessage(String message, String author) {
        try {
            this.uuid = UUID.randomUUID();
        } catch (Exception e) {
            this.uuid = UUID.randomUUID();
        }
        this.message = message;
        this.author = author;
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
        this.deleteAt = LocalDateTime.now();
        this.isActive = true;
    }    

}
