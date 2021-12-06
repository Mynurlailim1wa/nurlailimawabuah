package com.example.nurlailimawa;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.nurlailimawa.model.Anggur;
import com.example.nurlailimawa.model.Buah;
import com.example.nurlailimawa.model.Durian;
import com.example.nurlailimawa.model.Mangga;

public class DataProvider {
    private static List<Buah> buahs = new ArrayList<>();

    private static List<Durian> initDataDurian(Context ctx) {
        List<Durian> durians = new ArrayList<>();
        durians.add(new Durian("musangking", "Malaysia",
                "Aslinya berasal dari Malaysia, Malaysia dengan ciri khas rasanya yang melekat manis", R.drawable.musangking));
        durians.add(new Durian("durianbawor", "Banyumas",
                "Varietasnya beragam dan kaya dengan cita rasanya yang unik antara satu sama lain", R.drawable.durianbawor));
        durians.add(new Durian("durianmerah", "Kalimantan",
                "durian hutan yang hanya tumbuh di hutan Kalimantan pada zaman kerajaan Blambangan", R.drawable.durianmerah));
        return durians;
    }

    private static List<Mangga> initDataMangga(Context ctx) {
        List<Mangga> manggas = new ArrayList<>();
        manggas.add(new Mangga("manggaberazil", "Berazil",
                "warna buahnya akan berubah menjadi sangat cantik yakni perpaduan antara warna merah, kuning, dan hijau yang membentuk sebuah gradasi warna yang indah. ", R.drawable.manggaberazil));
        manggas.add(new Mangga("manggamadu", "Thailand",
                "mangga ini memiliki rasa yang manis bagaikan madu meskipun daging buahnya masih berwarna putih", R.drawable.manggamadu));
        manggas.add(new Mangga("manggamanalagi", "Jawa Timur",
                "Mangga manalagi memiliki daging buah yang tebal dan padat dengan rasa yang sangat manis", R.drawable.manggamanalagi));
        return manggas;
    }

    private static List<Anggur> initDataAnggur(Context ctx) {
        List<Anggur> anggurs = new ArrayList<>();
        anggurs.add(new Anggur("hijau", "Turki",
                "anggur kecil berbentuk oval berwarna hijau muda yang mengandung banyak gula. Setelah dikeringkan, gula terkonsentrasi dan menghasilkan rasa kismis yang manis", R.drawable.hijau));
        anggurs.add(new Anggur("anggurmerah", "Indonesia",
                "anggur yang daging dan kulitna berwarna merah serta rasanya ang manis", R.drawable.anggurmerah));
        anggurs.add(new Anggur("anggurhitam", "California",
                "anggur yang terkadang rasana agak asam", R.drawable.anggurhitam));
        return anggurs;
    }

    private static void initAllBuahs(Context ctx) {
        buahs.addAll(initDataAnggur(ctx));
        buahs.addAll(initDataDurian(ctx));
        buahs.addAll(initDataMangga(ctx));
    }

    public static List<Buah> getAllBuah(Context ctx) {
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        return  buahs;
    }

    public static List<Buah> getBuahsByTipe(Context ctx, String jenis) {
        List<Buah> buahsByType = new ArrayList<>();
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        for (Buah h : buahs) {
            if (h.getJenis().equals(jenis)) {
                buahsByType.add(h);
            }
        }
        return buahsByType;
    }
}