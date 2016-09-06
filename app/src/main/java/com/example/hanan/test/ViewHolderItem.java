package com.example.hanan.test;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hanan on 05/09/16.
 */
public class ViewHolderItem extends RecyclerView.ViewHolder{

    TextView title;
    TextView description;
    TextView numNeeded;
    ImageView people;
    ImageView state;

    public ViewHolderItem(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.opp_title);
        description = (TextView) itemView.findViewById(R.id.opp_text);
        numNeeded = (TextView) itemView.findViewById(R.id.six);
        people = (ImageView) itemView.findViewById(R.id.ppl);
        state = (ImageView) itemView.findViewById(R.id.available);
    }
}
