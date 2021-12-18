public class ScheduledFlight {

    int flightNo;
    java.lang.String weeklyDeparture;
    java.lang.String weeklyArrival;

    Airport start;
    Airport destination;

    public int getFlightNo () {
        return this.flightNo;
    }
    public java.lang.String getWeeklyDeparture () {
        return this.weeklyDeparture;
    }
    public java.lang.String getWeeklyArrival () {
        return this.weeklyArrival;
    }

    public void setFlightNo (int flightNo) {
        this.flightNo = flightNo;
    }
    public void setWeeklyDeparture (java.lang.String weeklyDeparture) {
        this.weeklyDeparture = weeklyDeparture;
    }
    public void setWeeklyArrival (java.lang.String weeklyArrival) {
        this.weeklyArrival = weeklyArrival;
    }

    public Airport getStart () {
        return this.start;
    }
    public Airport getDestination () {
        return this.destination;
    }

    public void setStart (Airport start) {
        this.start = start;
    }
    public void setDestination (Airport destination) {
        this.destination = destination;
    }


}
