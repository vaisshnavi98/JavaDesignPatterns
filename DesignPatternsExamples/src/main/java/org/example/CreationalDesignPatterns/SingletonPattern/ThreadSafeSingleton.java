package org.example.CreationalDesignPatterns.SingletonPattern;

public class ThreadSafeSingleton {
    //private variable
    private static ThreadSafeSingleton threadSafeSingleton;

    //private constructor
    private ThreadSafeSingleton() {}

    //static creation method used to return the same object.
    public static synchronized ThreadSafeSingleton getInstance() {
        if(threadSafeSingleton == null ) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
    //since locking is a costly process we can use double locking to avoid it.

    public static  ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if(threadSafeSingleton == null ) {
            synchronized (ThreadSafeSingleton.class) {
                if(threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        } return threadSafeSingleton;
    }
}
