package com.kapcb.ccc.pattern.singleton.lazy;

/**
 * <a>Title:LazySimpleSingleton</a>
 * <a>Author：ccc<a>
 * <a>Description：<a>
 * 单例模式：懒汉式
 *
 * @author ccc
 * @version 1.0.0
 * @date 2020/8/20 20:54
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton() {
    }

    /**
     * 静态块，公共内存区域
     */
    private static LazySimpleSingleton lazySimpleSingleton = null;

    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
