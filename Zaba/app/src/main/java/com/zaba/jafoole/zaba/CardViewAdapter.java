package com.zaba.jafoole.zaba;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zaba.jafoole.zaba.qpxexpress.Leg;
import com.zaba.jafoole.zaba.qpxexpress.Response;
import com.zaba.jafoole.zaba.qpxexpress.Slouse;
import com.zaba.jafoole.zaba.qpxexpress.TripOption;

import java.io.Serializable;
import java.util.List;

/**
 * Created by
 * /\     /\       __        _____              __                /\      /\
 * \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
 * \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
 * \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
 * \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
 * \/     \/  \______|    \/                             \/   \/      \/
 * on 4/3/16.
 */
public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {
    private List<TripOption> mTripOption;


    public CardViewAdapter(List<TripOption> tripOption){
        this.mTripOption = tripOption;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent,false);

        return new ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        TripOption responseOption = mTripOption.get(position);

        Slouse outboundSlice = responseOption.getSlice().get(0);
        Slouse inboundSlice = responseOption.getSlice().get(1);

        //Outbound information.
        holder.mOutboundDepartureTime.setText(outboundSlice.getDepartureTime());
        holder.mOutboundArrivalTime.setText(outboundSlice.getArrivalTime());
        holder.mOutboundOrigin.setText(outboundSlice.getOrigin());
        holder.mOutboundDestination.setText(outboundSlice.getDestination());
        holder.mOutboundDuration.setText(String.valueOf(outboundSlice.getDuration()));

        //Inbound information.
        holder.mInboundDepartureTime.setText(inboundSlice.getDepartureTime());
        holder.mInboundArrivalTime.setText(inboundSlice.getArrivalTime());
        holder.mInboundOrigin.setText(inboundSlice.getOrigin());
        holder.mInboundDestination.setText(inboundSlice.getDestination());
        holder.mInboundDuration.setText(String.valueOf(inboundSlice.getDuration()));

        holder.mSaleTotal.setText(String.valueOf(responseOption.getSaleTotal()));


        holder.setOnItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {


                Intent intent = new Intent(view.getContext(), BookFlightActivity.class);
                intent.putExtra("POSITION", (Serializable) mTripOption.get(position));
//                Toast.makeText(view.getContext(), "Clicked " + position, Toast.LENGTH_SHORT).show();

                view.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mTripOption.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ItemClickListener itemClickListener;

        //Outbound member variables
        protected TextView mOutboundDepartureTime;
        protected TextView mOutboundArrivalTime;
        protected TextView mOutboundOrigin;
        protected TextView mOutboundDestination;
        protected TextView mOutboundDuration;

        //Inbound member variables
        protected TextView mInboundDepartureTime;
        protected TextView mInboundArrivalTime;
        protected TextView mInboundOrigin;
        protected TextView mInboundDestination;
        protected TextView mInboundDuration;

        //Total Trip Price
        protected TextView mSaleTotal;

        public ViewHolder(View itemView) {
            super(itemView);


            mOutboundDepartureTime = (TextView) itemView.findViewById(R.id.outboundDepartureTime);
            mOutboundArrivalTime = (TextView) itemView.findViewById(R.id.outboundArrivalTime);
            mOutboundOrigin = (TextView) itemView.findViewById(R.id.outboundOrigin);
            mOutboundDestination = (TextView) itemView.findViewById(R.id.outboundDestination);

            mOutboundDuration = (TextView) itemView.findViewById(R.id.outboundDuration);


            mInboundDepartureTime = (TextView) itemView.findViewById(R.id.inboundDepartureTime);
            mInboundArrivalTime = (TextView) itemView.findViewById(R.id.inboundArrivalTime);
            mInboundOrigin = (TextView) itemView.findViewById(R.id.inboundOrigin);
            mInboundDestination = (TextView) itemView.findViewById(R.id.inboundDestination);
            mInboundDuration = (TextView) itemView.findViewById(R.id.inboundDuration);


            mSaleTotal = (TextView) itemView.findViewById(R.id.saleTotal);

            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
                this.itemClickListener.onItemClick(v, getLayoutPosition());

        }

        public void setOnItemClickListener(final ItemClickListener mOIL){
            this.itemClickListener = mOIL;
        }

    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }



}






