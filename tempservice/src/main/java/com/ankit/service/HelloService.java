package com.ankit.service;

import com.ankit.dao.HelloDao;
import org.springframework.stereotype.Service;

@Service
public class HelloService {


    private HelloDao helloDao;

    public String welcomeService() {
        return helloDao.helloDao();
    }
}
