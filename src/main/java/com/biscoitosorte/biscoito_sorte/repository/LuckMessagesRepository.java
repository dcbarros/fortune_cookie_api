package com.biscoitosorte.biscoito_sorte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.biscoitosorte.biscoito_sorte.model.LuckMessage;
import java.util.UUID;
import java.util.Optional;

@Repository
public interface LuckMessagesRepository extends JpaRepository<LuckMessage,Long>{
    Optional<LuckMessage> findByUuid(UUID uuid);

    @Query(value = "SELECT * FROM luck_message ORDER BY RAND() LIMIT 1", nativeQuery = true)
    LuckMessage getRandomLuckMessage();
}
