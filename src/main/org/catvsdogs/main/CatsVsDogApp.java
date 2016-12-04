package org.catvsdogs.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class CatsVsDogApp {

	static Map<String, Integer> stays = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		int testCases = Integer.parseInt("1");
		for (int i = 0; i< testCases; i++){
			
			int c = Integer.parseInt("1");
			int d = Integer.parseInt("2");
			int v = Integer.parseInt("4");
			
		
			String[] votes = {
					"C1 D1",
					"C1 D1",
					"C1 D1",
					"D2 C1",
					"D1 C1"
			};
			int maxViewers = getMaxViewersWithArrays(votes, c, d);
			System.out.println(maxViewers);
		}

	}
	
	public static int getMaxViewersWithArrays(String[] votes, int c, int d){
		int[] cats = new int[c];
		int[] dogs = new int[d];
		
		
		for (String vote : votes){
			String[] splittedVote = vote.split(" ");
			try{
				int index = Integer.parseInt(splittedVote[0].substring(1)) - 1;
				if (splittedVote[0].startsWith("C") && splittedVote[1].startsWith("D")){
					cats[index]++;
				} else if (splittedVote[0].startsWith("D") && splittedVote[1].startsWith("C")){
					dogs[index]++;
				}
			} catch (Exception e){
				// Ignore input
			}
		}
		
		int finalResult = 0;
		int i =0, j=0;
		while(i< cats.length && j < dogs.length){
			if (cats[i] >= dogs[j]){
				finalResult = cats[i];
				j++;
			} else {
				finalResult = dogs[j];
				i++;
			}
		}
	
		while(j < dogs.length - 1){
			if (dogs[j] < dogs[j+1]){
				finalResult = dogs[j+1];
			}
			j++;
		}
		
		while(i < cats.length - 1){
			if (cats[i] < cats[i+1]){
				finalResult = cats[i+1];
			}
			i++;
		}
	
		return finalResult;
	}
	
	public static int getMaxViewersWithMap(String[] votes){
		Map<String, Integer> stays = new HashMap<String, Integer>();
		
		for (String vote : votes){
			String[] splittedVote = vote.split(" ");
			if (stays.containsKey(splittedVote[0])){
				stays.put(splittedVote[0], stays.get(splittedVote[0]) + 1);	
			} else {
				stays.put(splittedVote[0], 1);
			}
		}
		
		List<Integer> votesCount = new ArrayList<Integer>(stays.values());
		Collections.sort(votesCount);
		return votesCount.get(votesCount.size() - 1);
		
	}

}
