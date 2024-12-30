
// import java.time.LocalTime;

public class Schedule {
    private Train train;
    private Station station;
    private String ArrivalTime;
    private String DepartureTime;
    private Palteform palteform;
    public Schedule(Train train,Station station,String ArrivalTime,
        String DepartureTime ,Palteform palteform){
        this.train=train;
        this.ArrivalTime=ArrivalTime;
        this.DepartureTime=DepartureTime;
        this.station=station;
        this.palteform=palteform;
    }
    public Train getTrain(){
        return train;
    }
    public void setTrain(Train train){
        this.train=train;
    }
    public Station getstation(){
        return station;
    }
    public void setStation(Station station){
        this.station=station;
    }
    public String getLocalDateTime(){
        return ArrivalTime;
    }
    public void setLocalDateTime(String ArrivalTime){
        this.ArrivalTime=ArrivalTime;
    }
    public String getLocalTime(){
        return DepartureTime;
    }
    public void setLocalTime(String DepartureTime){
        this.DepartureTime=DepartureTime;
    }
    public Palteform getPlateform(){
        return palteform;
    }
    public void setPlateForm(Palteform palteform){
        this.palteform=palteform;
    }
    @Override
    public String toString(){
        return "Schedule {"+
        "Train="+train+'\''+
        "Station ="+station+'\''+
        "LocalDateTime ="+ArrivalTime+'\''+
        "localDateTime ="+DepartureTime+'\''+
        "Plateform ="+palteform+'\''+
        '}';
    }
}

