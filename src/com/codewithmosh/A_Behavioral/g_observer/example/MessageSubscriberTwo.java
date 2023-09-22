package com.codewithmosh.A_Behavioral.g_observer.example;


public class MessageSubscriberTwo implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessage());
    }
}
