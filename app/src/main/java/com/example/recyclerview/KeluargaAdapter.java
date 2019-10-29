package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder>{

    private ArrayList<Keluarga_Abi> dataList;

  public KeluargaAdapter(ArrayList<Keluarga_Abi> dataList){
      this.dataList = dataList;
  }

  @NonNull
  @Override
  public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
  {
      LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View view = layoutInflater.inflate(R.layout.keluarga,parent,false);
      return new KeluargaViewHolder(view);
  }
  
  public void onBindViewHolder(KeluargaViewHolder holder, int position)
  {
      holder.txtNama.setText(dataList.get(position).getNama());
      holder.txtNama_panggilan.setText(dataList.get(position).getNama_panggilan());
      holder.gambarData.setImageResource(dataList.get(position).getGambar());

  }
  
  @Override
    public int getItemCount()
  {
      return (dataList != null) ? dataList.size() : 0;
  }
  
  public class KeluargaViewHolder extends RecyclerView.ViewHolder
  {
      private TextView txtNama, txtNama_panggilan;
      ImageView gambarData;
      
      public KeluargaViewHolder(View itemView)
      {
          super(itemView);
          txtNama = (TextView) itemView.findViewById(R.id.nama);
          txtNama_panggilan = itemView.findViewById(R.id.nama_panggilan);
          gambarData = (ImageView) itemView.findViewById(R.id.gambar);

      }
  }

}
