package com.songsy.springcloud.plus.zuul.test;

import com.netflix.loadbalancer.AbstractServerPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试 {@link AbstractServerPredicate#incrementAndGetModulo(int)}
 *
 * @author songsy
 * @date 2019/8/28 19:22
 */
public class IncrementAndGetModuloTest {

    private final AtomicInteger nextIndex = new AtomicInteger();

    public static void main(String[] args) {
        IncrementAndGetModuloTest incrementAndGetModuloTest = new IncrementAndGetModuloTest();
        List<String> eligible = new ArrayList<String>();
        eligible.add("服务1");
        eligible.add("服务2");
        eligible.add("服务3");
        eligible.add("服务4");
        eligible.add("服务5");
        for (int i = 0; i < 20; i++) {
            System.out.println(incrementAndGetModuloTest.getServer(eligible));
        }
    }

    private String getServer(List<String> eligible) {
        return eligible.get(incrementAndGetModulo(eligible.size()));
    }

    private int incrementAndGetModulo(int modulo) {
        for (; ; ) {
            int current = nextIndex.get();
            int next = (current + 1) % modulo;
            if (nextIndex.compareAndSet(current, next))
                return current;
        }
    }
}
