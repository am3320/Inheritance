import java.util.ArrayList;

public class Mystery{
private Human murderer;
private String m;
private ArrayList<Human> humansR1;
private ArrayList<Prop> propsR1;


public Mystery() {
   this.propsR1 = new ArrayList<>();
   this.humansR1 = new ArrayList<>();
   this.murderer= new Human();
}
public void setMurderer2(String m){
   this.m = m;
}
 public boolean guessMurderer(String hi){
    if(hi.equals(m)){
      return true;
    }
    return false;
 }
 public String interrogate(Human j){
    if(j==murderer){
        return murderer.getBackstory();
    }
    for(int i =0; i<humansR1.size();i++){
        if(humansR1.get(i)==j){
           return humansR1.get(i).getBackstory();
        }
    }
    return"Oops! No backstory found!";
 }
 public String inspectProp(int j){
   if(j>propsR1.size()-1){
      return "Oops! Thats not a valid prop number";
   }
   //  for(int i =0; i<propsR1.size();i++){
   //      if(propsR1.get(i)==propsR1.get(j)){
   //         return 
   //      }
   //  }
   return propsR1.get(j).inspect();
 }
 public void setProps(ArrayList<Prop> newProps) {
   for (Prop p : newProps) {
       this.propsR1.add(p);
   }
}

public Human getMurderer() {
   return murderer;
}

public void setMurderer(Human murderer) {
   this.murderer = murderer;
}

public ArrayList<Human> getHumansR1() {
   return humansR1;
}

public void setHumansR1(ArrayList<Human> humansR1) {
   this.humansR1 = humansR1;
}

public void getPropsR1(String c) {
   String s = "";
   if(c.equals("the Businessman, Victor")){
      s = "b";
   }
   else if(c.equals("the Chef, Gustave")){
      s = "c";
   }
   else if(c.equals("the butler")){
      s = "bu";
   }
   for(int i = 0; i<propsR1.size(); i++){
      if(s==propsR1.get(i).getC()||propsR1.get(i).getC().equals("None")){
         System.out.println(propsR1.get(i).getInfo());
      }
   }
}

public ArrayList<Prop> returnPropsR1(){
   return propsR1;
}


public void setPropsR1(Prop propsR2) {
   propsR1.add(propsR2);
}
}
