package org.gawarho.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionsTest {
    public static void main(String[] args) {
        Collection<Integer> col = Arrays.asList(0,1,2,3,4,5,6,7);
        for(int i : col) {
            System.out.println(i);
        }
    }
}
