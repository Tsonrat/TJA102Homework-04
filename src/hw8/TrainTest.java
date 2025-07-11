package hw8;

import java.util.*;

public class TrainTest {
	
	public static void main(String[] args) {
		
		List<Train> trains = new ArrayList<>();
		
		trains.add(new Train(202, "莒光", "樹林", "花蓮", 400));
	    trains.add(new Train(1254, "自強", "屏東", "基隆", 700));
	    trains.add(new Train(118, "自強", "高雄", "台北", 500));
	    trains.add(new Train(1288, "自強", "新竹", "基隆", 400));
	    trains.add(new Train(122, "自強", "台中", "花蓮", 600));
	    trains.add(new Train(1222, "區間", "彰化", "七堵", 300));
	    trains.add(new Train(1254, "自強", "屏東", "基隆", 700));
	    
	    
	    
	    System.out.println("============不重複==========");
	    
	    Set<Train> t_uni = new HashSet<>(trains);
	    	for (Train t1 : t_uni) {
	    		System.out.println(t1);
	    	}
	    
	    
		System.out.println("=======從大到小印出來======");
		
	    Collections.sort(trains, new Comparator<Train>() {

			@Override
			public int compare(Train a, Train b) {
				return b.getNumber() - a.getNumber();
			}
	    	
	    });
	    
	    for (Train t2 : trains) {
	    	System.out.println(t2);
	    }
	    
	    
	    System.out.println("==============去重複且大到小印出===========");
	    
	    Set<Train> t_uni2 = new HashSet<>(trains);
	    List<Train> st_uni2 = new ArrayList<>(t_uni2);
	    
	    Collections.sort(st_uni2, new Comparator<Train>() {

			@Override
			public int compare(Train a, Train b) {
				return b.getNumber() - a.getNumber();
			}
	    });
	    
	    for (Train t3 : st_uni2) {
	    	System.out.println(t3);
	    }
	    
	}

}
