<<<<<<< HEAD
 class Farm  {     
    private Animal[] aBunchOfAnimals = new Animal[3];    
    public Farm()     {       
       aBunchOfAnimals[0] = new NamedCow("cow","Bertha","moo");          
       aBunchOfAnimals[1] = new Chick("chick","cheep","cluck");
       aBunchOfAnimals[2] = new Pig("pig","oink");    
    }     
    public void animalSounds()    {
      for (int nI=0; nI < aBunchOfAnimals.length; nI++) {             
         System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );       
      }       
         System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );    
    } 
} 
=======
class Farm 
{     
   class Farm{
   	private Animal[]aBunchOfAnimals=new Animal[3];
   	public farm(){
   		aBunchOfAnimals[0]=new NamedCow("cow","Bertha","moo");
   		aBunchOfAnimals[1]=new Chick("chick","cheep","cluck");
   		aBunchOfAnimals[2]=new Pig("pig","oink");
   			
   	}
   	public void animalSounds(){
   		for(int nI=0; nI<aBunchOfAnimals.length;nI++)
   			System.out.println(aBunchOfAnimals[nI].getType+ "goes" +aBunchOfAnimals[nI].getSound());

   	}
   	System.out.println("the cow is known as"+((NamedCow)aBunchOfAnimals[0]).getName());
   }
}
}
>>>>>>> b116ef481a8cd99de3a69032be6ceca708c9e753
