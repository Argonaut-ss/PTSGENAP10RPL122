package com.example.ptsgenap10rpl122;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BahanAdapter extends RecyclerView.Adapter<BahanAdapter.BahanViewHolder> {
    private Callback callback;
    private ArrayList<JenisBahan> dataList;

    interface Callback{
        void onClick(int Position);
    }

    public BahanAdapter(ArrayList<JenisBahan> dataList, Callback callback) {
        this.callback = callback;
        this.dataList = dataList;
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
        CardView cvku;

        public BahanViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            cvku = (CardView) itemView.findViewById(R.id.cvku);
            cvku.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.onClick(getAdapterPosition());
                }
            });
        }
    }
}