package com.forttiori.api;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService {

    public Flux<UserModel> userModel(){
        return Flux.just(UserModel.builder()
                .nome("David Petro")
                .document("1321312312")
                .build());
    }
}
