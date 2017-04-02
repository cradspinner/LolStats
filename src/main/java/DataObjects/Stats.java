package DataObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
	private boolean winner,firstBloodKill,firstBloodAssist,firstTowerKill,firstTowerAssist,firstInhibitorKill,firstInhibitorAssist;
	private long champLevel,item0,item1,item2,item3,item4,item5,item6,kills,doubleKills;
	private long tripleKills,quadraKills,pentaKills,largestKillingSpree,deaths,assists,totalDamageDealt;
	private long totalDamageDealtToChampions, totalDamageTaken, largestCriticalStrike,totalHeal;
	private long minionsKilled, neutralMinionsKilled,neutralMinionsKilledTeamJungle,neutralMinionsKilledEnemyJungle;
	private long goldEarned,goldSpent,magicDamageDealtToChampions,physicalDamageDealtToChampions,visionWardsBoughtInGame;
	private long magicDamageDealt,physicalDamageDealt,trueDamageDealt,magicDamageTaken,physicalDamageTaken,trueDamageTaken;
	private long inhibitorKills,towerKills,wardsPlaced,wardsKilled,largestMultiKill,killingSprees,totalUnitsHealed,totalTimeCrowdControlDealt;
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	public boolean isFirstBloodKill() {
		return firstBloodKill;
	}
	public void setFirstBloodKill(boolean firstBloodKill) {
		this.firstBloodKill = firstBloodKill;
	}
	public boolean isFirstBloodAssist() {
		return firstBloodAssist;
	}
	public void setFirstBloodAssist(boolean firstBloodAssist) {
		this.firstBloodAssist = firstBloodAssist;
	}
	public boolean isFirstTowerKill() {
		return firstTowerKill;
	}
	public void setFirstTowerKill(boolean firstTowerKill) {
		this.firstTowerKill = firstTowerKill;
	}
	public boolean isFirstTowerAssist() {
		return firstTowerAssist;
	}
	public void setFirstTowerAssist(boolean firstTowerAssist) {
		this.firstTowerAssist = firstTowerAssist;
	}
	public boolean isFirstInhibitorKill() {
		return firstInhibitorKill;
	}
	public void setFirstInhibitorKill(boolean firstInhibitorKill) {
		this.firstInhibitorKill = firstInhibitorKill;
	}
	public boolean isFirstInhibitorAssist() {
		return firstInhibitorAssist;
	}
	public void setFirstInhibitorAssist(boolean firstInhibitorAssist) {
		this.firstInhibitorAssist = firstInhibitorAssist;
	}
	public long getChampLevel() {
		return champLevel;
	}
	public void setChampLevel(long champLevel) {
		this.champLevel = champLevel;
	}
	public long getItem0() {
		return item0;
	}
	public void setItem0(long item0) {
		this.item0 = item0;
	}
	public long getItem1() {
		return item1;
	}
	public void setItem1(long item1) {
		this.item1 = item1;
	}
	public long getItem2() {
		return item2;
	}
	public void setItem2(long item2) {
		this.item2 = item2;
	}
	public long getItem3() {
		return item3;
	}
	public void setItem3(long item3) {
		this.item3 = item3;
	}
	public long getItem4() {
		return item4;
	}
	public void setItem4(long item4) {
		this.item4 = item4;
	}
	public long getItem5() {
		return item5;
	}
	public void setItem5(long item5) {
		this.item5 = item5;
	}
	public long getItem6() {
		return item6;
	}
	public void setItem6(long item6) {
		this.item6 = item6;
	}
	public long getKills() {
		return kills;
	}
	public void setKills(long kills) {
		this.kills = kills;
	}
	public long getDoubleKills() {
		return doubleKills;
	}
	public void setDoubleKills(long doubleKills) {
		this.doubleKills = doubleKills;
	}
	public long getTripleKills() {
		return tripleKills;
	}
	public void setTripleKills(long tripleKills) {
		this.tripleKills = tripleKills;
	}
	public long getQuadraKills() {
		return quadraKills;
	}
	public void setQuadraKills(long quadraKills) {
		this.quadraKills = quadraKills;
	}
	public long getPentaKills() {
		return pentaKills;
	}
	public void setPentaKills(long pentaKills) {
		this.pentaKills = pentaKills;
	}
	public long getLargestKillingSpree() {
		return largestKillingSpree;
	}
	public void setLargestKillingSpree(long largestKillingSpree) {
		this.largestKillingSpree = largestKillingSpree;
	}
	public long getDeaths() {
		return deaths;
	}
	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}
	public long getAssists() {
		return assists;
	}
	public void setAssists(long assists) {
		this.assists = assists;
	}
	public long getTotalDamageDealt() {
		return totalDamageDealt;
	}
	public void setTotalDamageDealt(long totalDamageDealt) {
		this.totalDamageDealt = totalDamageDealt;
	}
	public long getTotalDamageDealtToChampions() {
		return totalDamageDealtToChampions;
	}
	public void setTotalDamageDealtToChampions(long totalDamageDealtToChampions) {
		this.totalDamageDealtToChampions = totalDamageDealtToChampions;
	}
	public long getTotalDamageTaken() {
		return totalDamageTaken;
	}
	public void setTotalDamageTaken(long totalDamageTaken) {
		this.totalDamageTaken = totalDamageTaken;
	}
	public long getLargestCriticalStrike() {
		return largestCriticalStrike;
	}
	public void setLargestCriticalStrike(long largestCriticalStrike) {
		this.largestCriticalStrike = largestCriticalStrike;
	}
	public long getTotalHeal() {
		return totalHeal;
	}
	public void setTotalHeal(long totalHeal) {
		this.totalHeal = totalHeal;
	}
	public long getMinionsKilled() {
		return minionsKilled;
	}
	public void setMinionsKilled(long minionsKilled) {
		this.minionsKilled = minionsKilled;
	}
	public long getNeutralMinionsKilled() {
		return neutralMinionsKilled;
	}
	public void setNeutralMinionsKilled(long neutralMinionsKilled) {
		this.neutralMinionsKilled = neutralMinionsKilled;
	}
	public long getNeutralMinionsKilledTeamJungle() {
		return neutralMinionsKilledTeamJungle;
	}
	public void setNeutralMinionsKilledTeamJungle(long neutralMinionsKilledTeamJungle) {
		this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
	}
	public long getNeutralMinionsKilledEnemyJungle() {
		return neutralMinionsKilledEnemyJungle;
	}
	public void setNeutralMinionsKilledEnemyJungle(long neutralMinionsKilledEnemyJungle) {
		this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
	}
	public long getGoldEarned() {
		return goldEarned;
	}
	public void setGoldEarned(long goldEarned) {
		this.goldEarned = goldEarned;
	}
	public long getGoldSpent() {
		return goldSpent;
	}
	public void setGoldSpent(long goldSpent) {
		this.goldSpent = goldSpent;
	}
	public long getMagicDamageDealtToChampions() {
		return magicDamageDealtToChampions;
	}
	public void setMagicDamageDealtToChampions(long magicDamageDealtToChampions) {
		this.magicDamageDealtToChampions = magicDamageDealtToChampions;
	}
	public long getPhysicalDamageDealtToChampions() {
		return physicalDamageDealtToChampions;
	}
	public void setPhysicalDamageDealtToChampions(long physicalDamageDealtToChampions) {
		this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
	}
	public long getVisionWardsBoughtInGame() {
		return visionWardsBoughtInGame;
	}
	public void setVisionWardsBoughtInGame(long visionWardsBoughtInGame) {
		this.visionWardsBoughtInGame = visionWardsBoughtInGame;
	}
	public long getMagicDamageDealt() {
		return magicDamageDealt;
	}
	public void setMagicDamageDealt(long magicDamageDealt) {
		this.magicDamageDealt = magicDamageDealt;
	}
	public long getPhysicalDamageDealt() {
		return physicalDamageDealt;
	}
	public void setPhysicalDamageDealt(long physicalDamageDealt) {
		this.physicalDamageDealt = physicalDamageDealt;
	}
	public long getTrueDamageDealt() {
		return trueDamageDealt;
	}
	public void setTrueDamageDealt(long trueDamageDealt) {
		this.trueDamageDealt = trueDamageDealt;
	}
	public long getMagicDamageTaken() {
		return magicDamageTaken;
	}
	public void setMagicDamageTaken(long magicDamageTaken) {
		this.magicDamageTaken = magicDamageTaken;
	}
	public long getPhysicalDamageTaken() {
		return physicalDamageTaken;
	}
	public void setPhysicalDamageTaken(long physicalDamageTaken) {
		this.physicalDamageTaken = physicalDamageTaken;
	}
	public long getTrueDamageTaken() {
		return trueDamageTaken;
	}
	public void setTrueDamageTaken(long trueDamageTaken) {
		this.trueDamageTaken = trueDamageTaken;
	}
	public long getInhibitorKills() {
		return inhibitorKills;
	}
	public void setInhibitorKills(long inhibitorKills) {
		this.inhibitorKills = inhibitorKills;
	}
	public long getTowerKills() {
		return towerKills;
	}
	public void setTowerKills(long towerKills) {
		this.towerKills = towerKills;
	}
	public long getWardsPlaced() {
		return wardsPlaced;
	}
	public void setWardsPlaced(long wardsPlaced) {
		this.wardsPlaced = wardsPlaced;
	}
	public long getWardsKilled() {
		return wardsKilled;
	}
	public void setWardsKilled(long wardsKilled) {
		this.wardsKilled = wardsKilled;
	}
	public long getLargestMultiKill() {
		return largestMultiKill;
	}
	public void setLargestMultiKill(long largestMultiKill) {
		this.largestMultiKill = largestMultiKill;
	}
	public long getKillingSprees() {
		return killingSprees;
	}
	public void setKillingSprees(long killingSprees) {
		this.killingSprees = killingSprees;
	}
	public long getTotalUnitsHealed() {
		return totalUnitsHealed;
	}
	public void setTotalUnitsHealed(long totalUnitsHealed) {
		this.totalUnitsHealed = totalUnitsHealed;
	}
	public long getTotalTimeCrowdControlDealt() {
		return totalTimeCrowdControlDealt;
	}
	public void setTotalTimeCrowdControlDealt(long totalTimeCrowdControlDealt) {
		this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
	}
	@Override
	public String toString() {
		return "Stats [winner=" + winner + ", firstBloodKill=" + firstBloodKill + ", firstBloodAssist="
				+ firstBloodAssist + ", firstTowerKill=" + firstTowerKill + ", firstTowerAssist=" + firstTowerAssist
				+ ", firstInhibitorKill=" + firstInhibitorKill + ", firstInhibitorAssist=" + firstInhibitorAssist
				+ ", champLevel=" + champLevel + ", item0=" + item0 + ", item1=" + item1 + ", item2=" + item2
				+ ", item3=" + item3 + ", item4=" + item4 + ", item5=" + item5 + ", item6=" + item6 + ", kills=" + kills
				+ ", doubleKills=" + doubleKills + ", tripleKills=" + tripleKills + ", quadraKills=" + quadraKills
				+ ", pentaKills=" + pentaKills + ", largestKillingSpree=" + largestKillingSpree + ", deaths=" + deaths
				+ ", assists=" + assists + ", totalDamageDealt=" + totalDamageDealt + ", totalDamageDealtToChampions="
				+ totalDamageDealtToChampions + ", totalDamageTaken=" + totalDamageTaken + ", largestCriticalStrike="
				+ largestCriticalStrike + ", totalHeal=" + totalHeal + ", minionsKilled=" + minionsKilled
				+ ", neutralMinionsKilled=" + neutralMinionsKilled + ", neutralMinionsKilledTeamJungle="
				+ neutralMinionsKilledTeamJungle + ", neutralMinionsKilledEnemyJungle="
				+ neutralMinionsKilledEnemyJungle + ", goldEarned=" + goldEarned + ", goldSpent=" + goldSpent
				+ ", magicDamageDealtToChampions=" + magicDamageDealtToChampions + ", physicalDamageDealtToChampions="
				+ physicalDamageDealtToChampions + ", visionWardsBoughtInGame=" + visionWardsBoughtInGame
				+ ", magicDamageDealt=" + magicDamageDealt + ", physicalDamageDealt=" + physicalDamageDealt
				+ ", trueDamageDealt=" + trueDamageDealt + ", magicDamageTaken=" + magicDamageTaken
				+ ", physicalDamageTaken=" + physicalDamageTaken + ", trueDamageTaken=" + trueDamageTaken
				+ ", inhibitorKills=" + inhibitorKills + ", towerKills=" + towerKills + ", wardsPlaced=" + wardsPlaced
				+ ", wardsKilled=" + wardsKilled + ", largestMultiKill=" + largestMultiKill + ", killingSprees="
				+ killingSprees + ", totalUnitsHealed=" + totalUnitsHealed + ", totalTimeCrowdControlDealt="
				+ totalTimeCrowdControlDealt + "]";
	}
	
	
}
