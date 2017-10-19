package com.example.a0111010001101111.ikebabasuser;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.net.URL;
import java.util.List;

/**
 * Created by 0111010001101111 on 10/19/2017.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    private List<ItemObject> itemList;
    private Context context;
    private URL url;

    public RecycleViewAdapter(Context context,List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }
    //*************************************************************MAGIJA***************************
    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        String kaina = itemList.get(position).getKaina();
        String url = itemList.get(position).getImgUrl();
        holder.pavadinimoTxt.setText(itemList.get(position).getPavadinimas());
        holder.aprsymoTxt.setText(itemList.get(position).getAprasymas());
        holder.kainosTxt.setText("Kaina: "+kaina+" EURO");
        Glide.with(context).load("https:"+url).into(holder.imgg);
    }
    //*************************************************************MAGIJA***************************
    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
