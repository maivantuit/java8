package Bforandforeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Each {
	// Tìm danh sách dev có tên khác "mkyong".
	private static List<String> getListNotItem(List<String> listDev, String filter){
		List<String> result = new ArrayList<>();
		for(String item: listDev){
			if(!item.equals("mkyong")){
				result.add(item);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring","struts","mkyong");
		List<String> result = getListNotItem(lines, "mkyong");
				
		for(String item: result){
			System.out.println(item);// spring, struts.
		}			
	}
}
