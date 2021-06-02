package com.company.work3;

public class Id {

    private int id;
    private static int nextId;

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    static {
        nextId = (int) (Math.random() *101);
        System.out.println("Для проверки nextId = " + nextId);
    }

    {
       id = nextId++;
    }


}
