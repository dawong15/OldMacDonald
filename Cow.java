class Cow implements Animal 
{     
     private string myType;
     private string mySound;
     public clow(String type,String sound)
     {
     	myType=type;
     	mySound=sound;
     }
     public Cow()
     {
     	myType="unknown";
     	mySound-"unknown";
     }
     public String getSound()
     {
     	return mySound;
     }
     public String getType()
     {
     	return myType;
     }

}
