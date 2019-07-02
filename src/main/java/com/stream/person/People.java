package com.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {
    public static List<String> getList(){
        final List<String> theList = new ArrayList<>();
        theList.add("Adam Clarke");
        theList.add("Boris Big");
        theList.add("Hugh Smith");
        theList.add("Amon Lee");
        theList.add("Penelope Gray");
        theList.add("Susan Robinson");
        theList.add("Lucy Rose");
        theList.add("Kate Rogers");
        theList.add("Linda Morrison");
        theList.add("Agatha Dawson");
        theList.add("Carrie Parker");
        return new ArrayList<String>(theList);
    }
}
