package com.example.jvmdemo;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> oomObjects = new ArrayList<>();
        while (true){
            oomObjects.add(new OOMObject());
        }
    }
}
