package br.com.mypet.service;

import br.com.mypet.domain.User;

import java.util.Arrays;
import java.util.List;

public class UserService {

    public List<User> authorizedUser(){
        return
            Arrays
                .asList(
                    new User(1L, "USER_001"),
                    new User(2L, "USER_001"),
                    new User(3L, "USER_001"),
                    new User(4L, "USER_001")
                );
    }

}
