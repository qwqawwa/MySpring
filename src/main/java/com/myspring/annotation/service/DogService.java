package com.myspring.annotation.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName DogService
 * @Description TODO
 * @Author Cheng Liu
 * @Date 15/04/2023 12:17 PM
 */
@Service
public class DogService extends AnimalService{
    @Override
    public void eat(){
        System.out.println("狗吃肉");
    }
}