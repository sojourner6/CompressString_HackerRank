package com.sojourner6;

public class CompressString {
	/*
	 * Dynamic Programming approach
	 */
	public static String reduceString(String optimumString, String remString){
		System.out.println(optimumString + ", " + remString);
		if(optimumString.length() == 0 && remString.length() == 0){
				return "Empty String";
		}
		if(optimumString.length() == 0){
			return reduceString(remString.substring(0,1), remString.substring(1));
		}
		if(remString.length() == 0){
			return optimumString;
		}
		int optimumStringLen = optimumString.length();
		if(remString.length() < 2){
			if(optimumString.charAt(optimumStringLen - 1) == remString.charAt(0)){
				return reduceString(optimumString.substring(0, optimumStringLen - 1), "");
			}
			else{
				return optimumString + remString;
			}
		}
		else{
			if(optimumString.charAt(optimumStringLen - 1) == remString.charAt(0)){
				return reduceString(optimumString.substring(0, optimumStringLen - 1), remString.substring(1));
			}
			else{
				if(remString.charAt(0) == remString.charAt(1)){
					return reduceString(optimumString, remString.substring(2));
				}
				else{
					return reduceString(optimumString + remString.substring(0, 2), remString.substring(2));
				}
			}
		}
	}
}
