package com.Demohash;

import abc.MyHashMap;

public class MyHashMapMain 
{
	public static void main(String [] args) {
		System.out.println("Welcome to Hash Table");
		givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency();  
		  
	}
	private static void givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency() {
	String sentance="To be or not to be";
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
		int frequency = myHashMap.get("or");
		System.out.println(myHashMap);
		System.out.println("Frequency of give word be is " + frequency);

	}
	}
	

