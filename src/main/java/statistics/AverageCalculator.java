package statistics;

import java.util.List;

import DataObjects.Stats;

public class AverageCalculator {

	private Averages averages;
	public Averages calculateAverages(List<Stats> stats){
		averages= new Averages();
		for(int x=0;x<stats.size();x++){
			Stats currentStat = stats.get(x);
			averages.setKills(averages.getKills() + currentStat.getKills());
			averages.setMinionsKilled(averages.getMinionsKilled()+ currentStat.getMinionsKilled());
		}	
		averages.setKills(averages.getKills() /stats.size());
		averages.setMinionsKilled(averages.getMinionsKilled()/stats.size());
		return averages;
	}
}