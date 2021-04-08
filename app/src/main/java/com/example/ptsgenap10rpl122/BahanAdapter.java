package com.example.ptsgenap10rpl122;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BahanAdapter extends RecyclerView.Adapter<BahanAdapter.BahanViewHolder> {
    private ArrayList<JenisBahan> dataList, dataListFull;

    public BahanAdapter(Context applicationContext, ArrayList<JenisBahan> dataList) {
        this.dataList = dataList;
        dataListFull = new ArrayList<>(dataList);
    }

    @Override
    public BahanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemview, parent, false);
        return new BahanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BahanViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNim());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BahanViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm;

        public BahanViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
        }
    }
}