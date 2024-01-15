package com.solvd.animals_mvc.dao.mybatis.impl;

import com.solvd.animals_mvc.dao.IDepartmentDAO;
import com.solvd.animals_mvc.dao.MyBatisConfig;
import com.solvd.animals_mvc.model.Department;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DepartmentDAOImpl implements IDepartmentDAO {
    @Override
    public Department getEntityById(Long id) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IDepartmentDAO departmentDAO = sqlSession.getMapper(IDepartmentDAO.class);
            return departmentDAO.getEntityById(id);
        }
    }

    @Override
    public Long insertEntity(Department entity) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IDepartmentDAO departmentDAO = sqlSession.getMapper(IDepartmentDAO.class);
            departmentDAO.insertEntity(entity);
            return entity.getId();
        }
    }

    @Override
    public void updateEntity(Department entity, Long entityId) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IDepartmentDAO departmentDAO = sqlSession.getMapper(IDepartmentDAO.class);
            departmentDAO.updateEntity(entity,entityId);
        }
    }

    @Override
    public void removeEntity(Department entity) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IDepartmentDAO departmentDAO = sqlSession.getMapper(IDepartmentDAO.class);
            departmentDAO.removeEntity(entity);
        }
    }

    @Override
    public List<Department> getEntities() {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IDepartmentDAO departmentDAO = sqlSession.getMapper(IDepartmentDAO.class);
            return departmentDAO.getEntities();
        }
    }
}
