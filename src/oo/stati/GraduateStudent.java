package oo.stati;

public class GraduateStudent extends Student{
	int thesis;
	
	public GraduateStudent (int English , int Math ,int Chinese){
		this.English = English;
		this.Math = Math ;
		this.Chinese = Chinese ;
	}
	
	@Override
	public void print(){
		System.out.println(getScore(English)+"\t"+getScore(Math)+"\t"+getScore(Chinese)+"\t"+thesis);
	}

}
