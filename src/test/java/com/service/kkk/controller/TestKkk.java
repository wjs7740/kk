package com.service.kkk.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestKkk {

        KkkDelegate kkkDelegate = new KkkDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = kkkDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}