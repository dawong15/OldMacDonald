<<<<<<< HEAD
class Cow implements Animal {     
     protected String myType;     
     protected String mySound;      
     public Cow(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Cow(){         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){
        return mySound;
    }     
     public String getType(){
        return myType;
    } 
=======
class Cow implements Animal 
{     
     private String myType;
     private String mySound;
     public Cow(String type,String sound)
     {
     	myType=type;
     	mySound=sound;
     }
     public Cow()
     {
     	myType="unknown";
     	mySound="unknown";
     }
     public String getSound()
     {
     	return mySound;
     }
     public String getType()
     {
     	return myType;
     }

>>>>>>> b116ef481a8cd99de3a69032be6ceca708c9e753
}
