package com.solvd.animals_mvc.dao.interfaces;

import com.solvd.animals_mvc.model.AnimalRoom;

public interface IAnimalRoomDAO extends IGetEntity<AnimalRoom>,
        IInsertEntity<AnimalRoom>, IUpdateEntity<AnimalRoom>,
        IRemoveEntity<AnimalRoom> {
}
