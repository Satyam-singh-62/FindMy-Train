import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class TrainSystem {
    private Map<String,Station> Stations=new HashMap<>();
    private Map<String,Train> Trains=new HashMap<>();
    private List<Schedule> schedules=new ArrayList<>();
    public void addStation(Station station ){
        Stations.put(station.getStationId(),station);
    }
    public void addTrain(Train train){
        Trains.put(train.getTrainId(),train);
    }
    public void addschedule(Schedule schedule){
        schedules.add(schedule);
    }
    public List<Schedule> findMyTrain(String startStationId,String endStationId){
        List<Schedule> res=new ArrayList<>();
        for(Schedule schedule:schedules){
            if(schedule.getstation().getStationId().equals(startStationId) ||
                schedule.getstation().getStationId().equals(endStationId) ){
            }
            res.add(schedule);
        }
        return res;
    }
}
