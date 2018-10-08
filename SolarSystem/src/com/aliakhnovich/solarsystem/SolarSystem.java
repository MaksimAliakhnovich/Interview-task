package com.aliakhnovich.solarsystem;

import com.aliakhnovich.solarsystem.planet.Planet;
import com.aliakhnovich.solarsystem.satellite.Satellite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mascon on 23.12.2017.
 */
public class SolarSystem {

    public void getSolarSystem() {
        List<Planet> planetList = new ArrayList<>(getPlanets());
        for (Planet planet : planetList) {
            System.out.println(planet);
        }
    }

    private List<Planet> getPlanets() {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet(1, "Меркурий", "твёрдая", getSatelliteMercury()));
        planets.add(new Planet(2, "Венера", "твёрдая", getSatelliteVenus()));
        planets.add(new Planet(3, "Земля", "твёрдая", getSatelliteEarth()));
        planets.add(new Planet(4, "Марс", "твёрдая", getSatelliteMars()));
        planets.add(new Planet(5, "Юпитер", "твёрдая", getSatelliteJupiter()));
        planets.add(new Planet(6, "Сатурн", "твёрдая", getSatelliteSaturn()));
        planets.add(new Planet(7, "Уран", "твёрдая", getSatelliteUranus()));
        planets.add(new Planet(8, "Нептун", "твёрдая", getSatelliteNeptune()));
        planets.add(new Planet(9, "Плутон", "твёрдая", getSatellitePluto()));
        return planets;
    }

    private List<Satellite> getSatelliteMercury() {
        return null;
    }

    private List<Satellite> getSatelliteVenus() {
        return null;
    }

    private List<Satellite> getSatelliteEarth() {
        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite(1, "Луна", "твёрдый"));

        return satellites;
    }

    private List<Satellite> getSatelliteMars() {
        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite(1, "Фобос", "твёрдый"));
        satellites.add(new Satellite(2, "Деймос", "твёрдый"));

        return satellites;
    }

    private List<Satellite> getSatelliteJupiter() {
        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite(1, "Метида", "твёрдый"));
        satellites.add(new Satellite(2, "Адрастея", "твёрдый"));
        satellites.add(new Satellite(3, "Амальтея", "твёрдый"));
        satellites.add(new Satellite(4, "Теба", "твёрдый"));
        satellites.add(new Satellite(5, "Ио", "твёрдый"));
        satellites.add(new Satellite(6, "Европа", "твёрдый"));
        satellites.add(new Satellite(7, "Ганимед", "твёрдый"));
        satellites.add(new Satellite(8, "Каллисто", "твёрдый"));
        satellites.add(new Satellite(9, "Леда", "твёрдый"));
        satellites.add(new Satellite(10, "Гималия", "твёрдый"));
        satellites.add(new Satellite(11, "Лиситея", "твёрдый"));
        satellites.add(new Satellite(12, "Элара", "твёрдый"));
        satellites.add(new Satellite(13, "Ананке", "твёрдый"));
        satellites.add(new Satellite(14, "Карме", "твёрдый"));
        satellites.add(new Satellite(15, "Пасифе", "твёрдый"));
        satellites.add(new Satellite(16, "Синопе", "твёрдый"));
        return satellites;
    }

    private List<Satellite> getSatelliteSaturn() {
        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite(1, "Пан", "твёрдый"));
        satellites.add(new Satellite(2, "Атлант", "твёрдый"));
        satellites.add(new Satellite(3, "Прометей", "твёрдый"));
        satellites.add(new Satellite(4, "Пандора", "твёрдый"));
        satellites.add(new Satellite(5, "Эпиметей", "твёрдый"));
        satellites.add(new Satellite(6, "Янус", "твёрдый"));
        satellites.add(new Satellite(7, "Мимас", "твёрдый"));
        satellites.add(new Satellite(8, "Энцелад", "твёрдый"));
        satellites.add(new Satellite(9, "Тефия", "твёрдый"));
        satellites.add(new Satellite(10, "Телесто", "твёрдый"));
        satellites.add(new Satellite(11, "Калипсо", "твёрдый"));
        satellites.add(new Satellite(12, "Диона", "твёрдый"));
        satellites.add(new Satellite(13, "Елена", "твёрдый"));
        satellites.add(new Satellite(14, "Рея", "твёрдый"));
        satellites.add(new Satellite(15, "Титан", "твёрдый"));
        satellites.add(new Satellite(16, "Гиперион", "твёрдый"));
        satellites.add(new Satellite(17, "Япет", "твёрдый"));
        satellites.add(new Satellite(18, "Феба", "твёрдый"));

        return satellites;
    }

    private List<Satellite> getSatelliteUranus() {
        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite(1, "Корделия", "твёрдый"));
        satellites.add(new Satellite(2, "Офелия", "твёрдый"));
        satellites.add(new Satellite(3, "Бианка", "твёрдый"));
        satellites.add(new Satellite(4, "Крессида", "твёрдый"));
        satellites.add(new Satellite(5, "Дездемона", "твёрдый"));
        satellites.add(new Satellite(6, "Джульетта", "твёрдый"));
        satellites.add(new Satellite(7, "Порция", "твёрдый"));
        satellites.add(new Satellite(8, "Розалинда", "твёрдый"));
        satellites.add(new Satellite(9, "Белинда", "твёрдый"));
        satellites.add(new Satellite(10, "Пэк", "твёрдый"));
        satellites.add(new Satellite(11, "Миранда", "твёрдый"));
        satellites.add(new Satellite(12, "Ариэль", "твёрдый"));
        satellites.add(new Satellite(13, "Умбриэль", "твёрдый"));
        satellites.add(new Satellite(14, "Титания", "твёрдый"));
        satellites.add(new Satellite(15, "Оберон", "твёрдый"));
        satellites.add(new Satellite(16, "Калибан", "твёрдый"));
        satellites.add(new Satellite(17, "Сикоракса", "твёрдый"));

        return satellites;
    }

    private List<Satellite> getSatelliteNeptune() {
        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite(1, "Наяда", "твёрдый"));
        satellites.add(new Satellite(2, "Таласса", "твёрдый"));
        satellites.add(new Satellite(3, "Деспина", "твёрдый"));
        satellites.add(new Satellite(4, "Галатея", "твёрдый"));
        satellites.add(new Satellite(5, "Ларисса", "твёрдый"));
        satellites.add(new Satellite(6, "Протей", "твёрдый"));
        satellites.add(new Satellite(7, "Тритон", "твёрдый"));
        satellites.add(new Satellite(8, "Нереида", "твёрдый"));

        return satellites;
    }

    private List<Satellite> getSatellitePluto() {
        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite(1, "Харон", "твёрдый"));

        return satellites;
    }
}
