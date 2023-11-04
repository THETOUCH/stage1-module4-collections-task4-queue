package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> mergedCollection = new PriorityQueue<>(new StringsQueueComparator());
        List<String> commonList = new ArrayList<>(firstList);
        commonList.addAll(secondList);
        mergedCollection.addAll(commonList);
        return mergedCollection;
    }
}
class StringsQueueComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.equals(o2)) {
            return 0;
        }
        return -o1.compareTo(o2);
    }
}