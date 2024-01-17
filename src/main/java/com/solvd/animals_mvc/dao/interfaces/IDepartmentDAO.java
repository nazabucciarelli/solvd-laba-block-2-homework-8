package com.solvd.animals_mvc.dao.interfaces;

import com.solvd.animals_mvc.model.Department;

public interface IDepartmentDAO extends IGetEntity<Department>,
        IInsertEntity<Department>, IUpdateEntity<Department>,
        IRemoveEntity<Department> {
}
