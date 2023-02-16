package com.cagriucuncu.recardview.services;

import android.graphics.Color;

import com.cagriucuncu.recardview.models.HairModel;

import java.util.ArrayList;

public class HairModelService {
    public static ArrayList<HairModel> getItems(){
        ArrayList<HairModel> items = new ArrayList<HairModel>();

        items.add(new HairModel(
                "Günlük Topuz Modeli",
                "https://i.dugun.com/articles/body/original_gunluk-topuz-modeli.jpg.jpg",
                Color.parseColor("#800000FF")
        ));
        items.add(new HairModel(
                "Balık Sırtı Örgü Modeli",
                "https://i.dugun.com/articles/body/original_orgu-yarim-toplu-sac.jpg.jpg",
                Color.parseColor("#800000FF")
        ));
        items.add(new HairModel(
                "Su Dalgası Saç Modeli",
                "https://i.dugun.com/articles/body/original_dalgali-masa-sac.jpg.jpg",
                Color.parseColor("#800000FF")
        ));
        items.add(new HairModel(
                "Hafif Dalgalı Saç Modeli",
                "https://i.dugun.com/articles/body/original_dalgali-sac-modeli.jpg.jpg",
                Color.parseColor("#800000FF")
        ));
        items.add(new HairModel(
                "Düğümlü Atkuyruğu Modeli",
                "https://i.dugun.com/articles/body/original_dugumlu.jpg.jpg",
                Color.parseColor("#800000FF")
        ));


        return items;
    }
}
