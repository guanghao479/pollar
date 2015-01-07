package com.pollar.domain;


import com.pollar.common.Greeter;

public class App {

    public static void main(String[] args) {
        Greeter helloService = new Greeter();
        System.out.println(helloService.sayHello());
    }
}
