class Chick implements Animal 
{     
     private String mySound,mySoundY;
     private String myType;
     private boolean a;
     public Chick(String type, String sound){
     	mySound=sound;
     	myType=type;
     	a=false;
     }
     public Chick(String type,String sound,String soundY){
     	mySound=sound;
     	mySoundY=soundY;
     	myType=type;
     	a=true;
	 }
	 public Chick(){
	 	mySound="unknown";
	 	myType="unknown";
	 }
	 public String getSound(){
	 	if(a==true &&(int)(Math.random()*2)==1){
	 	return mySoundY;
		}
		return mySound;
	}
	 public String getType(){
	 	return myType;
	 }
}