package com.johnbryce.aop.aop;

import com.johnbryce.aop.beans.Player;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class MyAspect {

    @Autowired
    Map<Integer, Integer> counter;

    @After("execution(public void pioPio())")
    public void overTwoHundred(JoinPoint joinPoint) {
        Player player = (Player) (joinPoint.getTarget());
        counter.merge(player.getId(), 1, Integer::sum);

        if (counter.get(player.getId()) > 200) {
            System.out.println("Over 200");
        }
    }
}
