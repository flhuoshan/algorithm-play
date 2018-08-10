package com.flcoder.algorithm.sort;

import com.flcoder.algorithm.Utils;

public class DynamicClient {
    public static void main(String[] args){
        int[] arr = Utils.generateAllRandomArray(10000);

        Sorter target = new SelectSort();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());
        // 给目标对象，创建代理对象
        Sorter proxy = (Sorter) new DynamicProxy(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());
        // 执行方法   【代理对象】
        proxy.sort(arr);
    }
}
