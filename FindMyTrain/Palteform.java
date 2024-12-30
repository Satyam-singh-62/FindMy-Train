public class Palteform {
    private int palteformNumber;
    private Train train;
    public Palteform(int palteformNumber){
        this.palteformNumber=palteformNumber;
    }
    public int getplateformNumber(){
        return palteformNumber;
    }
    public void setplateformNumber(int palteformNumber){
        this.palteformNumber=palteformNumber;
    }
    public Train getTrain(){
        return train;
    }
    public void setTrain(Train train){
        this.train=train;
    }
    @Override
    public String toString(){
        return "PlateformNumber {"+
            "platefromNumber =" +palteformNumber +'\''+
            "train ="+train+'\''+
            '}';
    }
    
}
