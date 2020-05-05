package io.dowlath.alno;

/*
There is a bus stand. We have given arrival time of the buses and halt of every bus.
timings can overlap. We have to find minimum no of platform on the bus stand,
so that no bus has to wait to occupy platform.
 */

public class BusStandardArrivalTimeMinPlatforms {
    public static void main(String[] args) {
       BusDetail[] busDetails = new BusDetail[5];

       busDetails[0] = new BusDetail(){{
           arrivalTime = 10 * 60; // 10 AM
           haltTime = 20; // 20 mins;
       }};

        busDetails[1] = new BusDetail(){{
            arrivalTime = (int) ((10.5) * 60); // 10 AM
            haltTime = 30; // 30 mins;
        }};

        busDetails[2] = new BusDetail(){{
            arrivalTime = 11 * 60; // 11 AM
            haltTime = 15; // 15 mins;
        }};

        busDetails[3] = new BusDetail(){{
            arrivalTime = (int)(10.5 * 60); // 10.30 AM
            haltTime = 35; // 35 mins;
        }};

        busDetails[4] = new BusDetail(){{
            arrivalTime = 10 * 60 + 40; // 10.40 AM
            haltTime = 5; // 5 mins;
        }};

        System.out.println("Min platforms : "+getMinPlatforms(busDetails));
    }

    public static int  getMinPlatforms(BusDetail[] busDetails){
        int domain = 24 * 60;
        int[] slots = new int[domain];
        for(BusDetail busDetail : busDetails){
            for(int i=busDetail.arrivalTime;i<busDetail.arrivalTime+busDetail.haltTime;i++){
                slots[i]++;
            }
        }
        return findMaxValue(slots);
    }

    public static int findMaxValue(int... array){
        assert(array.length>0);
        int max = array[0];
        for(int i : array){
            if(max<i){
                max = i;
            }
        }
        return max;
    }
}

