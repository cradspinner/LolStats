package DataObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
	private long summonerId,profileIcon;
	private String summonerName;
	
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	public long getProfileIcon() {
		return profileIcon;
	}
	public void setProfileIcon(long profileIcon) {
		this.profileIcon = profileIcon;
	}
	public String getSummonerName() {
		return summonerName;
	}
	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}
	
}
