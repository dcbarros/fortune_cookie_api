package com.biscoitosorte.biscoito_sorte.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.biscoitosorte.biscoito_sorte.model.LuckMessage;
import java.util.UUID;
import java.util.Optional;

@Repository
public interface LuckMessagesRepository extends JpaRepository<LuckMessage, Long> {
    Optional<LuckMessage> findByUuid(UUID uuid);

    @Query(value = """
        SELECT * FROM luck_message 
        WHERE is_active = TRUE 
        AND id >= (SELECT FLOOR(RANDOM() * (SELECT MAX(id) FROM luck_message WHERE is_active = TRUE)))
        ORDER BY id 
        LIMIT 1;
    """, nativeQuery = true)
    LuckMessage getRandomLuckMessage();
    

    @SuppressWarnings("null")
    Page<LuckMessage> findAll(Pageable pageable);
}
