package com.zaba.jafoole.zaba;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by
 * /\     /\      __        _____              __                /\      /\
 * \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
 * \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
 * \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
 * \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
 * \/     \/  \______|    \/                             \/   \/      \/
 * on 4/3/16.
 */
public class CardViewHolder extends RecyclerView.ViewHolder {


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



    public CardViewHolder(View itemView) {
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


    }
}
