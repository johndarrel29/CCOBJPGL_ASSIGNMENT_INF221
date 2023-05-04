package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Loading instructions from system... exploring Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("terminator going venus haha");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("earth is the safest place for living things");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Scanning for possible living things in this planet");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Finding king Neptune \n");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Exploring planet for possibilities of living things");
    }
}