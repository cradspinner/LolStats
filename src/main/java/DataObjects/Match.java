package DataObjects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
	private String matchVersion,season;
	private List<Participant> participants = new ArrayList<Participant>();
	private List<ParticipantIdentity> participantIdentities = new ArrayList<ParticipantIdentity>();
	public String getMatchVersion() {
		return matchVersion;
	}
	public void setMatchVersion(String matchVersion) {
		this.matchVersion = matchVersion;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public List<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	public List<ParticipantIdentity> getParticipantIdentities() {
		return participantIdentities;
	}
	public void setParticipantIdentities(List<ParticipantIdentity> participantIdentities) {
		this.participantIdentities = participantIdentities;
	}
	
 
}
