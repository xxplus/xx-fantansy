package com.fantasy.xxbase.cache;

import com.fantasy.xxbase.entity.XXBaseEntity;

import java.io.Serializable;
import java.util.Collection;

/**
 * 缓存接口
 *
 * @author li.fang
 * @since 2017/02/17
 */
public interface CacheProvider {

    <T extends Serializable> void put(String category, String key, T obj);

    <T extends Serializable> void put(String category, String key, T obj, int timeToLiveSeconds);

    <T extends XXBaseEntity> void put(String category, Collection<T> objs);

    <T extends XXBaseEntity> void put(String category, Collection<T> objs, int timeToLiveSeconds);

    <T extends Serializable> T get(String category, String key) throws CacheNotExistException;

    <T extends XXBaseEntity> Collection<T> getCollection(String category);

    long getCacheSize();

    boolean isExist(String category, String key);

    void removeAll();

    void remove(String category);

    void remove(String category, String key);
}