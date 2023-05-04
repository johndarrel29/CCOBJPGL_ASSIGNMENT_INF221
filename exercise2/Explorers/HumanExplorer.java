package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("tatampo na ako gais, punta ako venus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Pagod na ako mag explore, uwi na ako sa earth");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Ilang taon kaya ako mag eexplore dito sa jupiter?");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("ganda naman dito sa neptune btw imissyou");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("grabee ang lawak ng uranus ako na lng kasi..");
    }
}
