package com.knits.spring.common.repositories;


import com.knits.spring.common.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserRepository {

    @Getter
    @Setter
    @Autowired
    private DatabaseConnectionPool databaseConnectionPool;
    public User findUser (String userName){
        databaseConnectionPool.connections();
        log.info("findUser");
        return new User();
    }
}
