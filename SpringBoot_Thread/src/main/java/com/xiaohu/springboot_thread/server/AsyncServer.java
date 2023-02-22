package com.xiaohu.springboot_thread.server;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServer {

    @Async
    public void asyncTest(Integer count) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("线程" + Thread.currentThread().getName() + "执行异步任务：" + count);
    }

}
