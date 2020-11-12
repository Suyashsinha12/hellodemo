package com.sj.boot.hellodemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService implements NameService {

	List<String> players;
	
	PlayerService(){
		
		players = new ArrayList<String>();
		players.add("M.S Dhoni");
		players.add("Virat Kohli");
		players.add("Suresh Raina");
		players.add("K.L Rahul");
	
	}
	@Override
	public List<String> getNames() {
		// TODO Auto-generated method stub
		return players;
	}

}
