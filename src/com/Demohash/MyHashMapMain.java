package com.Demohash;

public class MyHashMapMain 
{
	public static void main(String [] args) {
		System.out.println("Welcome to Hash Table");
		givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency();  
		  
	}
	private static void givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency() {
	String sentance= "Paranoids are not paranoid because they are paranoid "
			+ "but because they keep putting themselves "
			+ "deliberately into paranoid avoidable situations";;
	MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
	String[] words = sentance. toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("are");
		System.out.println(myHashMap);
		System.out.println("Frequency of give word be is " + frequency);

	}
	}
	

