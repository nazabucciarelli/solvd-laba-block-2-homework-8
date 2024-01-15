package com.solvd.animals_mvc.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBaseDAO <T>{
    T getEntityById(Long id);

    Long insertEntity(T entity);

    void updateEntity(@Param("entity") T entity, @Param("id") Long entityId);

    void removeEntity(T entity);

    List<T> getEntities();
}
