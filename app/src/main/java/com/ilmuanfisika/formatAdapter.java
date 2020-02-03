package com.ilmuanfisika;


import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class formatAdapter extends RecyclerView.Adapter<formatAdapter.formatViewAdapter> {

    //variabel arraylist
    private ArrayList<ilmuan> listIlmuan;

    private Context context;

    public formatAdapter(Context context){
        this.context = context;
    }

    public ArrayList<ilmuan> listdata(){
        return listIlmuan;
    }


    public void setListIlmuan(ArrayList<ilmuan> listIlmuan){
        this.listIlmuan = listIlmuan;
    }


    @Override
    public formatViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ilmuanfisik, parent,false);
        return new formatViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(formatViewAdapter holder, int position) {
        final ilmuan ilmuanfisik = listdata().get(position);
        Glide.with(context).load(ilmuanfisik.getPhoto()).override(150,150).into(holder.gambar);
        holder.nama.setText(ilmuanfisik.getNama());
        //holder.penemu.setText(ilmuanfisik.getPenemuan());
        holder.detail.setText(ilmuanfisik.getDeskripsi());
        //holder.ref.setText(ilmuanfisik.getRefrensi());
        holder.ilmuanfi = ilmuanfisik;
    }

    @Override
    public int getItemCount() {
        return listdata().size();
    }

    public class formatViewAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView gambar;
        TextView nama,detail,penemu,ref;
        RelativeLayout clickitem;
        ilmuan ilmuanfi;

        public formatViewAdapter(@NonNull View itemView) {
            super(itemView);

            gambar = itemView.findViewById(R.id.fisik);
            nama = itemView.findViewById(R.id.namailmuan);
            //penemu = itemView.findViewById(R.id.penemuan);
            detail = itemView.findViewById(R.id.deskrip);
            //ref = itemView.findViewById(R.id.refrensi);
            clickitem = itemView.findViewById(R.id.clickdetail);
            clickitem.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, detaililmuanfisik.class);
            intent.putExtra("key", ilmuanfi);
            context.startActivity(intent);

        }
    }
}
