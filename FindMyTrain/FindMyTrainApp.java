import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system=new TrainSystem();
        //adding new station;
        Station station1=new Station("S0022", "patna");
        Station station2=new Station("S0033", "Ara");
        Station station3=new Station("S0044", "Delhi");

        //adding train object
        Train train1=new Train("12045","Super Fast", "Gareeb Rath");
        Train train2=new Train("12046","Super Fast", "Rajdhani Express");
        Train train3=new Train("12047","Super Fast", "Bande Bharat");

        //plateform
        Palteform p1=new Palteform(1);
        Palteform p2=new Palteform(2);
        Palteform p3=new Palteform(3);

        p1.setTrain(train1);
        p2.setTrain(train2);
        p3.setTrain(train3);

        List<Palteform> palteformList=new ArrayList<>();
        palteformList.add(p1);
        palteformList.add(p2);
        palteformList.add(p3);

        station1.setPlateformList(palteformList);
        station2.setPlateformList(palteformList);
        station3.setPlateformList(palteformList);

        Schedule s1=new Schedule(train3, station3, "9 am", "9:05 am", p1);
        Schedule s2=new Schedule(train1, station1, "11 am", "11:30 am", p2);
        Schedule s3=new Schedule(train2, station2, "10 pm", "10:15 pm", p3);

        system.addStation(station3);
        system.addStation(station1);
        system.addStation(station2);

        system.addTrain(train2);
        system.addTrain(train3);
        system.addTrain(train1);

        //lets find train between station;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source :");
        String source=sc.nextLine();
        System.out.println("Enter your Destination :");
        String des=sc.nextLine();
        sc.close();
        List<Schedule> myTrains=system.findMyTrain(source, des);
        System.out.println("your train Between "+source+" and "+des);
        // Schedule schedule=myTrains.get(0);
        // Train train = Schedule.getTrain();
        // System.out.println(myTrains.get(0));
        System.out.println(train3);
    }
}
