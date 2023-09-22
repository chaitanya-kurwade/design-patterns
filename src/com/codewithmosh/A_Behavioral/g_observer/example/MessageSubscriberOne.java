package com.codewithmosh.A_Behavioral.g_observer.example;


public class MessageSubscriberOne implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessage());
    }
}
