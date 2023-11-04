package com.epam.collections.queue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = Stream.iterate(1, i -> i + 1)
                .limit(numberOfDishes)
                .collect(Collectors.toCollection(LinkedList::new));
        List<Integer> dishesToTry = new ArrayList<>();

        while (!dishes.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                dishes.add(dishes.poll());
            }
            dishesToTry.add(dishes.poll());
        }
        return dishesToTry;
    }
}
