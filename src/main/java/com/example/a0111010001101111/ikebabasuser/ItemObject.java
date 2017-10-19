package com.example.a0111010001101111.ikebabasuser;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 0111010001101111 on 10/19/2017.
 */

public class ItemObject {

    @SerializedName("id")
    private int id;
    @SerializedName("pavadinimas")
    private String pavadinimas;
    @SerializedName("aprasymas")
    private String aprasymas;
    @SerializedName("kaina")
    private String kaina;
    @SerializedName("imgUrl")
    private String imgUrl;

    public ItemObject(int id, String pavadinimas, String aprasymas, String kaina, String imgUrl) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kaina = kaina;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public String getKaina() {
        return kaina;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
