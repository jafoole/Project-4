package com.zaba.jafoole.zaba;

import java.util.ArrayList;

/**
 * Created by
 * /\     /\      __        _____              __                /\      /\
 * \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
 * \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
 * \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
 * \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
 * \/     \/  \______|    \/                             \/   \/      \/
 * on 3/28/16.
 */
public class AirportSearchResult {
    private ArrayList<AirportSearch> airports;

    public ArrayList<AirportSearch> getAirports() {
        return airports;
    }

    public void setAirports(ArrayList<AirportSearch> airports) {
        this.airports = airports;
    }

    @Override
    public String toString() {
        return airports.size()+" airports in the search result";
    }
}
