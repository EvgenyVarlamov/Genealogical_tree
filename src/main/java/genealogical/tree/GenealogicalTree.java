package genealogical.tree;

import genealogical.tree.controller.GenealogicalController;
import genealogical.tree.data.Human;
import genealogical.tree.data.Relation;
import genealogical.tree.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class GenealogicalTree {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ivan", 47, "male"));
        humans.add(new Human("Kamila", 44, "female"));
        humans.add(new Human("Lado", 28, "male"));
        humans.add(new Human("Maria", 25, "female"));
        humans.add(new Human("Ruslan", 4, "male"));
        humans.add(new Human("Ingeborga", 12, "female"));
        humans.add(new Human("Dormidont", 122, "male"));
        humans.add(new Human("Solomeia", 128, "female"));
        humans.add(new Human("Alsu", 74, "female"));
        humans.add(new Human("Petros", 62, "male"));

        List<Relative> relatives = new ArrayList<>();
        relatives.add(new Relative("Ivan", Relation.HUSBAND, "Kamila"));
        relatives.add(new Relative("Maria", Relation.WIFE, "Lado"));
        relatives.add(new Relative("Ruslan", Relation.SON, "Kamila"));
        relatives.add(new Relative("Ingeborga", Relation.DAUGHTER, "Maria"));
        relatives.add(new Relative("Dormidont", Relation.HUSBAND, "Solomeia"));
        relatives.add(new Relative("Solomeia", Relation.GRANDMA, "Ivan"));
        relatives.add(new Relative("Alsu", Relation.GRANDDUCH, "Solomeia"));
        relatives.add(new Relative("Retros", Relation.GRANDSON, "Dormidont"));

        GenealogicalController genealogicalController = new GenealogicalController();

        System.out.println("Search of Petr: " + genealogicalController.getHuman(humans, "Petr"));
        System.out.println("Petr's relatives: " + genealogicalController.getFilteredData(relatives, "Petr"));

        System.out.println("Search of Kamila: " + genealogicalController.getHuman(humans, "Kamila"));
        System.out.println("Kamila's relatives: " + genealogicalController.getFilteredData(relatives, "Kamila"));
        System.out.println("Kamila's relatives: " + genealogicalController.getFilteredData(relatives, "Kamila"));
    }
}
