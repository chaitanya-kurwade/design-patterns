package com.codewithmosh.A_Behavioral.g_observer.example;

public interface Subject 
{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
