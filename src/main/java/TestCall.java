import static org.junit.Assert.*;

import java.util.List;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hamcrest.core.IsNot;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import DataObjects.*;
import statistics.AverageCalculator;
import statistics.Averages;

public class TestCall {
	public static List<Stats> statList = new ArrayList<Stats>();
	public static void main(String[] args) throws JsonParseException, IOException, InterruptedException {
		whenParsingJsonStringIntoJsonNode_thenCorrect();
	}
	public static void whenParsingJsonStringIntoJsonNode_thenCorrect() 
	  throws JsonParseException, IOException, InterruptedException {
	    String jsonString = "https://na.api.riotgames.com/api/lol/NA/v2.2/matchlist/by-summoner/32206699?api_key=32028462-6d9e-4cfe-b3b7-9a7e4545ba94";
	    ObjectMapper mapper = new ObjectMapper();
	    JsonNode jsonNode = mapper.readTree(new URL(jsonString)).get("matches");
	    ArrayList<MatchReference> matchList = mapper.readValue(jsonNode.toString(),new TypeReference<ArrayList<MatchReference>>() {});
	    System.out.println(matchList.get(0).getMatchId());
	    for(int x =0;x<10;x++){
	    	try{
	    		matchCall(matchList.get(x).getMatchId());
	    	}catch(IOException e){
	    		System.out.println(x+"- failed");
	    	}
	    	System.out.println(x);
	    	Thread.sleep(850);
	    }
	    AverageCalculator calculator = new AverageCalculator();
	    Averages averages= calculator.calculateAverages(statList);
	    System.out.println(averages.getKills());
	    System.out.println(averages.getMinionsKilled());
	}
	public static void matchCall(Long matchid) throws JsonProcessingException, MalformedURLException, IOException{
		String url = "https://na.api.riotgames.com/api/lol/NA/v2.2/match/"+ matchid+"?api_key=32028462-6d9e-4cfe-b3b7-9a7e4545ba94";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(new URL(url));
		Match match = mapper.readValue(node.toString(), Match.class);
		System.out.println(match.getMatchVersion());
		List<Participant> participants = match.getParticipants();
		List<ParticipantIdentity> participantIdentities = match.getParticipantIdentities();
		Participant participant = null;
		boolean found = false;
		long id = 0;
		int x =0;
		do{
			ParticipantIdentity temp = participantIdentities.get(x);
			
			x++;
			if(temp.getPlayer().getSummonerId() == 32206699){
				found = true;
				id = temp.getParticipantId();
			}
		}while(x<participantIdentities.size() || found ==false);
		found = false;
		x=0;
		do{
			Participant temp = participants.get(x);
			x++;
			if(temp.getParticipantId() == id){
				found = true;
				participant = temp;
			}
		}while(x<participantIdentities.size() || found ==false);
		if(participant != null){
			statList.add(participant.getStats());
			System.out.println(participant.getStats().getKills());
		}
	}
}
