package com.codewithmosh.A_Behavioral.g_observer.example;


public class MessageSubscriberThree implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessage());
    }
}
