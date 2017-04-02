package DataObjects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchReference {
	
	private String queue,role,season;
	private Long champion,matchId;
	
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public Long getChampion() {
		return champion;
	}
	public void setChampion(Long champion) {
		this.champion = champion;
	}
	public Long getMatchId() {
		return matchId;
	}
	public void setMatchID(Long matchId) {
		this.matchId = matchId;
	}
	
}
