package com.solvd.animals_mvc.dao.interfaces;

import com.solvd.animals_mvc.model.Zoo;

public interface IZooDAO extends IGetEntity<Zoo>,
        IInsertEntity<Zoo>, IUpdateEntity<Zoo>,
        IRemoveEntity<Zoo> {
}
