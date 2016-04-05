package com.zaba.jafoole.zaba;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.zaba.jafoole.zaba.qpxexpress.Slouse;
import com.zaba.jafoole.zaba.qpxexpress.TripOption;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by
 * /\     /\      __        _____              __                /\      /\
 * \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
 * \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
 * \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
 * \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
 * \/     \/  \______|    \/                             \/   \/      \/
 * on 4/4/16.
 */
public class SecondCardViewAdapter extends RecyclerView.Adapter<SecondCardViewAdapter.ViewHolder> {


    Context mContext;

    OneWayFragment mOneWayFragment;
    private List<TripOption> mTripOption;


    public SecondCardViewAdapter(List<TripOption> tripOption){
        this.mTripOption = tripOption;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        mContext = context;

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.secondcard_view, parent,false);

        return new ViewHolder(itemView);


    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        TripOption responseOption = mTripOption.get(position);

        Slouse outboundSlice = responseOption.getSlice().get(0);


        //Outbound information.
        holder.mOutboundDepartureTime.setText(outboundSlice.getDepartureTime());
        holder.mOutboundArrivalTime.setText(outboundSlice.getArrivalTime());
        holder.mOutboundOrigin.setText(outboundSlice.getOrigin());
        holder.mOutboundDestination.setText(outboundSlice.getDestination());
        holder.mOutboundDuration.setText(String.valueOf(outboundSlice.getDuration()));

        holder.mSaleTotal.setText(String.valueOf(responseOption.getSaleTotal()));




        holder.setOnItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Toast.makeText(view.getContext(), "Clicked " + position, Toast.LENGTH_SHORT).show();


//                Intent intent = new Intent(view.getContext(), BookFlightActivity.class);
//                intent.putExtra("POSITION", (Serializable) mTripOption.get(0));
//                view.getContext().startActivity(intent);
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


        //Total Trip Price
        protected TextView mSaleTotal;

        public ViewHolder(View itemView) {
            super(itemView);


            mOutboundDepartureTime = (TextView) itemView.findViewById(R.id.outboundDepartureTime);
            mOutboundArrivalTime = (TextView) itemView.findViewById(R.id.outboundArrivalTime);
            mOutboundOrigin = (TextView) itemView.findViewById(R.id.outboundOrigin);
            mOutboundDestination = (TextView) itemView.findViewById(R.id.outboundDestination);

            mOutboundDuration = (TextView) itemView.findViewById(R.id.outboundDuration);

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

