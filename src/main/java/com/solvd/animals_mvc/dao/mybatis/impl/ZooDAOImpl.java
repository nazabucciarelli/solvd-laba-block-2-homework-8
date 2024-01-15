package com.solvd.animals_mvc.dao.mybatis.impl;

import com.solvd.animals_mvc.dao.IZooDAO;
import com.solvd.animals_mvc.dao.MyBatisConfig;
import com.solvd.animals_mvc.model.Zoo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ZooDAOImpl implements IZooDAO {
    @Override
    public Zoo getEntityById(Long id) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory()
                .openSession(true)) {
            IZooDAO zooDAO = sqlSession.getMapper(IZooDAO.class);
            return zooDAO.getEntityById(id);
        }
    }

    @Override
    public Long insertEntity(Zoo entity) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory()
                .openSession(true)) {
            IZooDAO zooDAO = sqlSession.getMapper(IZooDAO.class);
            zooDAO.insertEntity(entity);
            return entity.getId();
        }
    }

    @Override
    public void updateEntity(Zoo entity, Long entityId) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory()
                .openSession(true)) {
            IZooDAO zooDAO = sqlSession.getMapper(IZooDAO.class);
            zooDAO.updateEntity(entity,entityId);
        }
    }

    @Override
    public void removeEntity(Zoo entity) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory()
                .openSession(true)) {
            IZooDAO zooDAO = sqlSession.getMapper(IZooDAO.class);
            zooDAO.removeEntity(entity);
        }
    }

    @Override
    public List<Zoo> getEntities() {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory()
                .openSession(true)) {
            IZooDAO zooDAO = sqlSession.getMapper(IZooDAO.class);
            return zooDAO.getEntities();
        }
    }
}
