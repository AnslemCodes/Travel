package com.example.travel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResultAdapter extends RecyclerView.Adapter<ResultViewHolder> {

    Context context;
    ArrayList<ResultData> resultData;

    public ResultAdapter(Context context, ArrayList<ResultData> resultData) {
        this.context = context;
        this.resultData = resultData;
    }

    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.result_list, viewGroup , false);
        return new ResultViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {
        holder.mName.setText(resultData.get(position).getItemName());
        holder.mPrice.setText(resultData.get(position).getItemPrice("$ 20"));
        holder.mFromTime.setText(resultData.get(position).getItemFromTime("8.00"));
        holder.mFrom.setText(resultData.get(position).getItemFrom("Chennai"));
        holder.mTo.setText(resultData.get(position).getItemTo());



    }


    @Override
    public int getItemCount() {
        return resultData.size() ;
    }
}

class ResultViewHolder extends RecyclerView.ViewHolder {

    TextView mName, mPrice, mFrom, mTo, mFromTime;




    public ResultViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mName = itemView.findViewById(R.id.transport_name);
        this.mFrom = itemView.findViewById(R.id.tv_location);
        this.mTo = itemView.findViewById(R.id.tv_location2);
        this.mPrice = itemView.findViewById(R.id.price);
        this.mFromTime = itemView.findViewById(R.id.tv_time);








    }
}
