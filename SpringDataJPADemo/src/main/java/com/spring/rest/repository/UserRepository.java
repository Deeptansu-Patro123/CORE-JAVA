package com.spring.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.spring.entity.UserEntity;


@Component
public interface UserRepository extends JpaRepository<UserEntity, Long> 
{
UserEntity findByUserName(String userName);
UserEntity findBySessionId(String authToken);
}
