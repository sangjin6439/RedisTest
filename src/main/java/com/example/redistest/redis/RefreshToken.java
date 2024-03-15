package com.example.redistest.redis;


import jakarta.persistence.Id;
import jakarta.persistence.Index;
import lombok.*;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@RedisHash(value = "refresh_token")
public class RefreshToken {

    @Id
    private String authId;

    @Indexed
    private String Token;

    private String role;

    @TimeToLive
    private long ttl;

    public RefreshToken update(String token, long ttl){
        this.Token =token;
        this.ttl = ttl;
        return this;
    }

}
