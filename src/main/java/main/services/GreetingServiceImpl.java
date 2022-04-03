/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.services;

import org.springframework.stereotype.Component;

/**
 *
 * @author kulka
 */

@Component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return "Hello World!!!";
    }
}
