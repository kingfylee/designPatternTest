package com.designPattern.create.test;

import java.util.*;

/**
 *
 * Created by Administrator on 2016/8/26 0026.
 */
public class RandomTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        int[] ints = getRandomFromArray(new int[] {1,2,3,4}, 4);
        for (int i=0;i<ints.length;i++) {
            list.add(ints[i]);
        }
        System.out.println(list);
        System.out.println(ints.length);
    }

    public static int[] getRandomFromArray(int[] target, int num) {
        int[] arr = new int[num];
        int r = 0;
        for (int i = 1; i <= num; i++) {
            r = getRandom(0, target.length - i);
            arr[i-1] = target[r];
            target[r] = target[target.length - i];
        }
        return arr;
    }

    public static int getRandom(int min, int max) {
        if (min == max) {
            return min;
        }
        if (min > max) {
            return min;
        }
        return Math.abs(new Random().nextInt()) % (max - min + 1) + min;
    }

    public static void testSet() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        int[] id = new int[9];

        //数组下就不能这么装了...
        //int[] ints = set.toArray(new Integer[0]);

        Integer[] integers = set.toArray(new Integer[0]);

        for(int i=0;i<=set.size()-1;i++){
            id[i] = set.toArray(new Integer[0])[i];
        }
    }

}
