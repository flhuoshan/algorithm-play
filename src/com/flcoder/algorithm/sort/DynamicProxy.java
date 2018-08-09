package com.flcoder.algorithm.sort;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

    private Object target;
    public DynamicProxy(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long startTime = System.currentTimeMillis();
                        Object returnValue = method.invoke(target, args);
                        long endTime = System.currentTimeMillis();
                        System.out.printf("花费时间为%fS%n", (float)(endTime - startTime)/1000);
                        return returnValue;
                    }
                }
        );
    }
}
