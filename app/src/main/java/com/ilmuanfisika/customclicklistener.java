package com.ilmuanfisika;

import android.view.View;

public class customclicklistener implements View.OnClickListener {
    private int position;
    private clickcallback itemclickcallback;

    public customclicklistener(int position, clickcallback itemclickcallback){
        this.position = position;
        this.itemclickcallback = itemclickcallback;
    }


    @Override
    public void onClick(View v) {
        itemclickcallback.onitemclicked(v,position);

    }
    public interface clickcallback{
        void onitemclicked(View view, int position);
    }
}
