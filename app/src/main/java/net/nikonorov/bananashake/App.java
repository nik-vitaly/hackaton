package net.nikonorov.bananashake;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by vitaly on 25.03.16.
 */
public class App extends Application {

    public static ArrayList<City> cities = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();


        cities.add(new City(0, "Australia", "Sidney", "sidney", "saber/saber.g3db"));
        cities.add(new City(1, "Australia", "Sidney", "sidney", "saber/saber.g3db"));

        cities.add(new City(2, "New Zealand", "Wellington", "wellington", "saber/saber.g3db"));
        cities.add(new City(3, "New Zealand", "Wellington", "wellington", "saber/saber.g3db"));

        cities.add(new City(4, "China", "Beijing", "beijing", "saber/saber.g3db"));
        cities.add(new City(5, "China", "Beijing", "beijing", "saber/saber.g3db"));

        cities.add(new City(6, "Japan", "Tokyo", "tokyo", "saber/saber.g3db"));
        cities.add(new City(7, "Japan", "Tokyo", "tokyo", "saber/saber.g3db"));

        cities.add(new City(8, "USA", "Los Angeles", "la", "saber/saber.g3db"));
        cities.add(new City(9, "USA", "New York", "nyc", "saber/saber.g3db"));

        cities.add(new City(10, "Canada", "Brantford", "brantford", "saber/saber.g3db"));
        cities.add(new City(11, "Canada", "Collingwood", "collingwood", "saber/saber.g3db"));

        cities.add(new City(12, "Egypt", "Cairo", "cairo", "saber/saber.g3db"));
        cities.add(new City(13, "Egypt", "Cairo", "cairo", "saber/saber.g3db"));

        cities.add(new City(14, "Marocco", "Rabat", "rabat", "saber/saber.g3db"));
        cities.add(new City(15, "Marocco", "Rabat", "rabat", "saber/saber.g3db"));

        cities.add(new City(16, "Russia", "Moscow", "moscow", "saber/saber.g3db"));
        cities.add(new City(17, "Russia", "Saint Petersburg", "piter", "saber/saber.g3db"));

        cities.add(new City(18, "France", "Paris", "paris", "saber/saber.g3db"));
        cities.add(new City(19, "France", "Courcheval", "courcheval", "saber/saber.g3db"));

    }
}