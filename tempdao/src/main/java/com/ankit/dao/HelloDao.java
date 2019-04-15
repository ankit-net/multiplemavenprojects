package com.ankit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

    public String helloDao(){
        return "hellodao";
    }
}
