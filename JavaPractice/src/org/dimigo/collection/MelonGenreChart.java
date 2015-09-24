package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MelonGenreChart {
	
	public static void main(String[] args) {
		
		HashMap<String,List<Music>> map = new HashMap<>();
		ArrayList<Music> B_list = new ArrayList<Music>();
		ArrayList<Music> D_list = new ArrayList<Music>();
		
		System.out.println("-------- << 멜론 장르별 챠트 >> --------");
		
		B_list.add(new Music("내 첫사랑","베리굿"));
		B_list.add(new Music("또 다시 사랑","임창정"));
		B_list.add(new Music("부산에 가면","박진영"));
		
		D_list.add(new Music("커피","유재환,김예림"));
		D_list.add(new Music("다 잘될거야","쿨"));
		
		map.put("[댄스]", D_list);
		map.put("[발라드]", B_list);
		
		
		printList(map);
		
		System.out.println("-------- << 발라드 3위 곡 변경 >> --------");
		
		B_list.set(2,new Music("지우고 지워도","차수경"));
		printList(map);
		
		System.out.println("-------- << 발라드 1위 곡 삭제 >> --------");
		
		B_list.remove(0);
		printList(map);
		
		map.clear();
		B_list.clear();
		D_list.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		
	}
	public static void printList(HashMap<String,List<Music>> map){
		
		for(Entry<String, List<Music>> entry : map.entrySet()){//위와 똑같은 함수.
			System.out.println(entry.getKey());
			for(Music value : entry.getValue()){
				System.out.println(value.toString());
			}
			System.out.println("");
		}
		
	}

}
