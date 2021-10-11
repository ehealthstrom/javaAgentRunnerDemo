package com.itwithgeorge;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long pid = ProcessHandle.current().pid();

        System.out.println("PID: " + pid);
        while (!Thread.interrupted()) {
            Thread.sleep(8000);
            System.out.println("Hello word from thread: " + Thread.currentThread().getName());
        }
    }
}
