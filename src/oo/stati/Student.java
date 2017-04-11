package oo.stati;

public class Student {
	int English ;
	int Math ;
	int Chinese ;
	static int pass = 60;
	
	public Student (int English , int Math ,int Chinese){
		this.English = English;
		this.Math = Math ;
		this.Chinese = Chinese ;
		
	}
	public void print(){
		System.out.println(getScore(English)+"\t"+getScore(Math)+"\t"+getScore(Chinese));
	}
	
	private String getScore(int score){
		if (score < pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}
}
