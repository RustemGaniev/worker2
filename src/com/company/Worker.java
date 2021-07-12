package com.company;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    public Worker(OnTaskDoneListener callback,OnTaskErrorListener errorCallback ) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }


    public void start() {

        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Error !!! Task " + i + " has broken !!!");
            } else {
                callback.oneDone("Task " + i + " is done");
            }
        }
    }
}
