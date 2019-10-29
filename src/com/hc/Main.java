package com.hc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.isShutdown();
    }

}