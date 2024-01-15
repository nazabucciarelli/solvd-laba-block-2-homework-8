package com.solvd.animals_mvc.dao.mybatis.impl;

import com.solvd.animals_mvc.dao.IAnimalRoomDAO;
import com.solvd.animals_mvc.dao.MyBatisConfig;
import com.solvd.animals_mvc.model.AnimalRoom;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AnimalRoomDAOImpl implements IAnimalRoomDAO {
    @Override
    public AnimalRoom getEntityById(Long id) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IAnimalRoomDAO animalRoomDAO = sqlSession.getMapper(IAnimalRoomDAO.class);
            return animalRoomDAO.getEntityById(id);
        }
    }

    @Override
    public Long insertEntity(AnimalRoom entity) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IAnimalRoomDAO animalRoomDAO = sqlSession.getMapper(IAnimalRoomDAO.class);
            animalRoomDAO.insertEntity(entity);
            return entity.getId();
        }
    }

    @Override
    public void updateEntity(AnimalRoom entity, Long entityId) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IAnimalRoomDAO animalRoomDAO = sqlSession.getMapper(IAnimalRoomDAO.class);
            animalRoomDAO.updateEntity(entity,entityId);
        }
    }

    @Override
    public void removeEntity(AnimalRoom entity) {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IAnimalRoomDAO animalRoomDAO = sqlSession.getMapper(IAnimalRoomDAO.class);
            animalRoomDAO.removeEntity(entity);
        }
    }

    @Override
    public List<AnimalRoom> getEntities() {
        try (SqlSession sqlSession = MyBatisConfig.getSessionFactory().openSession(true)) {
            IAnimalRoomDAO animalRoomDAO = sqlSession.getMapper(IAnimalRoomDAO.class);
            return animalRoomDAO.getEntities();
        }
    }
}
