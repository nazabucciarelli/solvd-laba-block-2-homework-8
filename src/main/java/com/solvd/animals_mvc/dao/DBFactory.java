package com.solvd.animals_mvc.dao;

public class DBFactory {
    public static IZooDAO getZooDAO(ConnectionTool tool) {
        switch (tool) {
            case JDBC:
                return new com.solvd.animals_mvc.dao.jdbc.impl.ZooDAOImpl();
            case MYBATIS:
                return new com.solvd.animals_mvc.dao.mybatis.impl.ZooDAOImpl();
            default:
                return null;
        }
    }

    public static IDepartmentDAO getDepartmentDAO(ConnectionTool tool) {
        switch (tool) {
            case JDBC:
                return new com.solvd.animals_mvc.dao.jdbc.impl.DepartmentDAOImpl();
            case MYBATIS:
                return new com.solvd.animals_mvc.dao.mybatis.impl.DepartmentDAOImpl();
            default:
                return null;
        }
    }

    public static IAnimalRoomDAO getAnimalRoomDAO(ConnectionTool tool) {
        switch (tool) {
            case JDBC:
                return new com.solvd.animals_mvc.dao.jdbc.impl.AnimalRoomDAOImpl();
            case MYBATIS:
                return new com.solvd.animals_mvc.dao.mybatis.impl.AnimalRoomDAOImpl();
            default:
                return null;
        }
    }
}
