public class Airline {

    java.lang.String name;

    Airport usedAirports;
    Flight offeredFlights;

    public java.lang.String getName () {
        return this.name;
    }

    public void setName (java.lang.String name) {
        this.name = name;
    }

    public Airport getUsedAirports () {
        return this.usedAirports;
    }
    public Flight getOfferedFlights () {
        return this.offeredFlights;
    }

    public void setUsedAirports (Airport usedAirports) {
        this.usedAirports = usedAirports;
    }
    public void setOfferedFlights (Flight offeredFlights) {
        this.offeredFlights = offeredFlights;
    }


}
