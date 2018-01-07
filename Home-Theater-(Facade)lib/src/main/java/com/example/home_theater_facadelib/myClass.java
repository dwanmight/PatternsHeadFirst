package com.example.home_theater_facadelib;

public class myClass {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopCornPopper());

        homeTheaterFacade.watchMovie("Movie trailer");
        homeTheaterFacade.endMovie();
    }
}


