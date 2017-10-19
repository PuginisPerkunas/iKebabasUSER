package com.example.a0111010001101111.ikebabasuser;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 0111010001101111 on 10/19/2017.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView aprsymoTxt, pavadinimoTxt, kainosTxt;
    public ImageView imgg;
    public Button uzsakytiBTN;
    public Context cntx;

    public RecyclerViewHolders(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        aprsymoTxt = (TextView)itemView.findViewById(R.id.aprasymoTxt);
        pavadinimoTxt = (TextView) itemView.findViewById(R.id.pavadinimoTxt);
        kainosTxt = (TextView) itemView.findViewById(R.id.kainosTxt);
        imgg = (ImageView) itemView.findViewById(R.id.imgg);
        uzsakytiBTN = (Button) itemView.findViewById(R.id.uzsakytiBTN);
        cntx = itemView.getContext();
    }

    @Override
    public void onClick(View v) {

    }
}
