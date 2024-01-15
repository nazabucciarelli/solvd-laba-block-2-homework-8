package com.solvd.animals_mvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.animals_mvc.model.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Using JAXB to parse XML into a Java object
        File personXml = new File("src/main/resources/xml/person.xml");
        File customerXml = new File("src/main/resources/xml/customer.xml");
        File animalRoomXml = new File("src/main/resources/xml/animal_room.xml");
        File animalXml = new File("src/main/resources/xml/animal.xml");
        File zooXml = new File("src/main/resources/xml/zoo.xml");

        Person unmarshalledPerson = unmarshalXmlToObject(personXml, Person.class);
        LOGGER.info(unmarshalledPerson);
        Customer unmarshalledCustomer = unmarshalXmlToObject(customerXml, Customer.class);
        LOGGER.info(unmarshalledCustomer);
        AnimalRoom unmarshalledAnimalRoom = unmarshalXmlToObject(animalRoomXml, AnimalRoom.class);
        LOGGER.info(unmarshalledAnimalRoom);
        Animal unmarshalledAnimal = unmarshalXmlToObject(animalXml, Animal.class);
        LOGGER.info(unmarshalledAnimal);
        Zoo unmarshalledZoo = unmarshalXmlToObject(zooXml, Zoo.class);
        LOGGER.info(unmarshalledZoo);

        // Parsing Java object to XML file using JAXB
        marshalObjectToXml(personXml, unmarshalledPerson);
        marshalObjectToXml(customerXml, unmarshalledCustomer);
        marshalObjectToXml(animalRoomXml, unmarshalledAnimalRoom);
        marshalObjectToXml(animalXml, unmarshalledAnimal);
        marshalObjectToXml(zooXml, unmarshalledZoo);

        // Using Jackson to parse JSON file into a Java object
        File personJson = new File("src/main/resources/json/person.json");
        File animalJson = new File("src/main/resources/json/animal.json");
        File departmentJson = new File("src/main/resources/json/department.json");
        File employeeIdentifierJson = new File("src/main/resources/json/employee_identifier.json");
        File zooJson = new File("src/main/resources/json/zoo.json");
        File habitatJson = new File("src/main/resources/json/habitat.json");

        Person person = parseJsonToObject(personJson, Person.class);
        LOGGER.info(person);
        Animal animal = parseJsonToObject(animalJson, Animal.class);
        LOGGER.info(animal);
        Department department = parseJsonToObject(departmentJson, Department.class);
        LOGGER.info(department);
        EmployeeIdentifier employeeIdentifier = parseJsonToObject(employeeIdentifierJson, EmployeeIdentifier.class);
        LOGGER.info(employeeIdentifier);
        Zoo zoo = parseJsonToObject(zooJson, Zoo.class);
        LOGGER.info(zoo);
        Habitat habitat = parseJsonToObject(habitatJson, Habitat.class);
        LOGGER.info(habitat);

        // Parsing Java object to JSON file using Jackson
        parseObjectToJson(personJson, person);
        parseObjectToJson(animalJson, animal);
        parseObjectToJson(departmentJson, department);
        parseObjectToJson(employeeIdentifierJson, employeeIdentifier);
        parseObjectToJson(zooJson, zoo);
        parseObjectToJson(habitatJson, habitat);
    }

    private static <T> T parseJsonToObject(File jsonFile, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
            return objectMapper.readValue(jsonFile, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static <T> void parseObjectToJson(File resultFile, T object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(resultFile, object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static <T> T unmarshalXmlToObject(File file, Class<T> clazz) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (T) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    private static <T> void marshalObjectToXml(File file, T object) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, file);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
