public class Flight {

    int flightNo;

    Airport start;
    Airport destination;

    public int getFlightNo () {
        return this.flightNo;
    }

    public void setFlightNo (int flightNo) {
        this.flightNo = flightNo;
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
