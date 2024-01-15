package com.solvd.animals_mvc.utils;

import com.solvd.animals_mvc.model.AnimalRoom;
import com.solvd.animals_mvc.model.Department;
import com.solvd.animals_mvc.model.Zoo;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class ZooSAXHandler extends DefaultHandler {
    private Zoo zoo;
    private Department department;
    private AnimalRoom animalRoom;
    private List<AnimalRoom> animalRoomList;
    private List<Department> departmentList;
    private StringBuilder data;

    private boolean zooNameWasObtained = false;
    private boolean inDepartments = false;
    private boolean inAnimalRooms = false;

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        switch (qName) {
            case "zoo":
                Long id = Long.valueOf(attributes.getValue("id"));
                zoo = new Zoo();
                zoo.setId(id);
                break;
            case "name":
                break;
            case "departments":
                departmentList = new ArrayList<>();
                inDepartments = true;
                break;
            case "department":
                department = new Department();
                department.setId(Long.valueOf(attributes.getValue("id")));
                department.setZooId(Long.valueOf(attributes.getValue("zooId")));
                break;
            case "animalRooms":
                animalRoomList = new ArrayList<>();
                inAnimalRooms = true;
                break;
            case "animalRoom":
                animalRoom = new AnimalRoom();
                animalRoom.setId(Long.valueOf(attributes.getValue("id")));
                animalRoom.setZooId(Long.valueOf(attributes.getValue("zooId")));
                break;
        }
        data = new StringBuilder();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws
            SAXException {
        switch (qName) {
            case "name":
                if (!zooNameWasObtained) {
                    zoo.setName(data.toString());
                    zooNameWasObtained = true;
                } else if (inDepartments) {
                    department.setName(data.toString());
                } else if (inAnimalRooms) {
                    animalRoom.setName(data.toString());
                }
                break;
            case "departments":
                inDepartments = false;
                break;
            case "animalRooms":
                inAnimalRooms = false;
                break;
            case "customersCapacity":
                zoo.setCustomersCapacity(Integer.parseInt(data.toString()));
                break;
            case "capacity":
                animalRoom.setCapacity(Integer.parseInt(data.toString()));
                break;
            case "animalRoom":
                animalRoomList.add(animalRoom);
                break;
            case "department":
                departmentList.add(department);
                break;
            case "zoo":
                zoo.setAnimalRoomList(animalRoomList);
                zoo.setDepartmentList(departmentList);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }

    public Zoo getZoo() {
        return this.zoo;
    }

}
