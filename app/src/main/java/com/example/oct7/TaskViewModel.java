package com.example.oct7;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class TaskViewModel extends ViewModel {
    private MutableLiveData<LinkedList<String>> taskLL;

    public TaskViewModel() {
        taskLL = new MutableLiveData<>();
        LinkedList<String> l = new LinkedList<>();
        taskLL.setValue(l);
    }

    public void setTasks(LinkedList<String> l) {
        taskLL.setValue(l);
    }

    public MutableLiveData<LinkedList<String>> getTasks() {
        return taskLL;
    }

    public void addTask(String c) {
        LinkedList<String> l = getTasks().getValue();
        l.add(c);
        Log.i("COLORS", l.toString());
        taskLL.setValue(l);
    }
}
