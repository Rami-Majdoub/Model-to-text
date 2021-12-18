public class CharterFlight {

    int flightNo;
    java.util.Date departure;
    java.util.Date arrival;

    Airport start;
    Airport destination;

    public int getFlightNo () {
        return this.flightNo;
    }
    public java.util.Date getDeparture () {
        return this.departure;
    }
    public java.util.Date getArrival () {
        return this.arrival;
    }

    public void setFlightNo (int flightNo) {
        this.flightNo = flightNo;
    }
    public void setDeparture (java.util.Date departure) {
        this.departure = departure;
    }
    public void setArrival (java.util.Date arrival) {
        this.arrival = arrival;
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
