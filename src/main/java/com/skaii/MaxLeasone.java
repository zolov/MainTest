package com.skaii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * MaxLeasone.
 *
 * @author Igor_Zolov
 */
public class MaxLeasone {
    public static void main(String[] args) {
        Task [] names = new Task[10];
        ArrayList<Task> tasks = new ArrayList();
        LinkedList<Task> asdas = new LinkedList<>();
        Map mapo = new <Integer, String>HashMap();

        Task task1 = new Task("1", "2");
        tasks.add(task1);

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
