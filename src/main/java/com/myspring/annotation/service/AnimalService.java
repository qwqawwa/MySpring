package com.myspring.annotation.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName AnimalService
 * @Description TODO
 * @Author Cheng Liu
 * @Date 15/04/2023 12:16 PM
 */
@Service
public class AnimalService {
    public void eat(){
        System.out.println("动物爱吃啥吃啥");
    }
}