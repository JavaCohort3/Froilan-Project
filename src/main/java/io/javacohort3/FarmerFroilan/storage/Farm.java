package io.javacohort3.FarmerFroilan.storage;

import java.util.List;

import io.javacohort3.FarmerFroilan.storage.ChickenCoop;
import io.javacohort3.FarmerFroilan.storage.Stable;
import io.javacohort3.FarmerFroilan.storage.FarmHouse;

public class Farm {

    private List<Stable> stables;
    //a farm has a collection of stables a
    private List<ChickenCoop> chickenCoops;
    //a farm has a collection of chickencoops
    private FarmHouse farmHouse;
    //a farm has one farmhouse


    public Farm() {
    }

    public Farm(List<Stable> stables, List<ChickenCoop> chickenCoops, FarmHouse farmHouse) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public void setStables(List<Stable> stables) {
        this.stables = stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(List<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + stables +
                ", chickenCoops=" + chickenCoops +
                ", farmHouse=" + farmHouse +
                '}';
    }
}
