package ru.viktorgezz.action.creation;

import ru.viktorgezz.entity.*;
import ru.viktorgezz.map.Node;

public class InitEntities extends ACreation{

    private final CreationEntities creationEntities = CreationEntities.getInstance();

    public void perform(Node root) {
        for (int i = 0; i < entityCounter.getCountHerbivore(); i++) {
            creationEntities.create(new Herbivore(), root);
        }

        for (int i = 0; i < entityCounter.getCountPredator(); i++) {
            creationEntities.create(new Predator(), root);
        }

        for (int i = 0; i < entityCounter.getCountGrass(); i++) {
            creationEntities.create(new Grass(), root);
        }

        for (int i = 0; i < entityCounter.getCountTree(); i++) {
            creationEntities.create(new Tree(), root);
        }

        for (int i = 0; i < entityCounter.getCountRock(); i++) {
            creationEntities.create(new Rock(), root);
        }
    }
}