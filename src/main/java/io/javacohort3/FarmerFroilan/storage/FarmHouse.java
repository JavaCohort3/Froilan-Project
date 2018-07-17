package io.javacohort3.FarmerFroilan.storage;

import io.javacohort3.FarmerFroilan.interfaces.Person;
import java.util.List;

public class FarmHouse {

    private List<Person> people;
    //a farmhouse has a collection of people

    public FarmHouse() {
    }

    public FarmHouse(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "people=" + people +
                '}';
    }
}
