import java.util.ArrayList;
import java.util.List;
public class Station {
    private String StationId;
    private String station;
    private List<Palteform> palteformList;
    public Station(String StationId,String station){
        this.StationId=StationId;
        this.station=station;
        this.palteformList=new ArrayList<>();
    }
    public String getStationId(){
        return StationId;
    }
    public void setStationId(String StationId){
        this.StationId=StationId;
    }
    public String getStation(){
        return station;
    }
    public void setStation(String station){
        this.station=station;
    }
    public List<Palteform> getPalteformList(){
        return palteformList;
    }
    public void setPlateformList(List<Palteform> palteformList){
        this.palteformList=palteformList;
    }
    @Override
    public String toString(){
        return "Station {"+
            "stationId"+StationId+'\''+
            "station"+station+'\''+
            "plateformList"+palteformList+'\''+
            '}';
    }
}
