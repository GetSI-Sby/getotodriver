package com.rideme.driver.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by David Studio on 19/10/2015.
 */
public class AksiOrder extends JSONObject{

    JSONObject aksi;

    public AksiOrder(String idDriver, String idTrans){
        aksi = new JSONObject();

        try {
            aksi.put("id", idDriver);
            aksi.put("id_transaksi", idTrans);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getAksi(){
        return aksi;
    }
}
