package com.solvd.animals_mvc.dao.interfaces;

import org.apache.ibatis.annotations.Param;

public interface IUpdateEntity <T>{
    void updateEntity(@Param("entity") T entity, @Param("id") Long entityId);
}
