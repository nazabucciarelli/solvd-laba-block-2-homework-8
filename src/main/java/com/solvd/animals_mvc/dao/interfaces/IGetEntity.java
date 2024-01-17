package com.solvd.animals_mvc.dao.interfaces;

import java.util.List;

public interface IGetEntity <T>{
    T getEntityById(Long id);
    List<T> getEntities();

}
