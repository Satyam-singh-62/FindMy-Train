public class Train{
    private String TrainId;
    private String type;
    private String TrainName;
    Train(String TrainId, String type,String TrainName){
        this.TrainId=TrainId;
        this.TrainName=TrainName;
        this.type=type;
    }
    public String getTrainId(){
        return TrainId;
    }
    public void setTrainId(String TrainId){
        this.TrainId=TrainId;
    }
    public String getTrainName(){
        return TrainName;
    }
    public void setTrainName(String TrainName){
        this.TrainName=TrainName;
    }
    public String gettype(){
        return type;
    }
    public void settype(String type){
        this.type=type;
    }
    @Override
    public String toString(){
        return "Train{" +
            "TrainId ="+TrainId+'\''+
            "TrainName ="+ TrainName +'\'' +
            "type= "+ type +'\'' +
        '}';

    }
}