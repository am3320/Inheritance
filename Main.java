import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

   public static void delay(int seconds){
        seconds = seconds*1000;
        try{
            Thread.sleep(seconds);
        }
        catch (InterruptedException e){

        }
    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome, dear player. Are you in for a difficult game today? \n Enter 1 to play easy mode \n Enter 2 to play hard mode");
    int r = sc.nextInt();
    boolean easy = false;
    String hi2 = "";
    Mystery tG = new Mystery();
    tG.setMurderer2(hi2);
    if(r==1){
      easy = true;
      r = (int)(Math.random()*3);
      String[] s = {"the Businessman, Victor", "the Chef, Gustave", "the butler"};
      hi2 = s[r];
      Mystery MysteryEasy=ifEasy();
    }
        System.out.println("    XXXXXXXXXXXXXXXXXXX                                  \n" + //
                        "   X                  XXX                                \n" + //
                        "   X                 X   X       XXXXXXXXXXXXXXXXXXXXXXXX\n" + //
                        "  X                  X    XX     X  Invitation to the   X\n" + //
                        " X                  X       X    X Annual Murdough PartyX\n" + //
                        " X                 X         X   X----------------------X\n" + //
                        "X                 X           XX XDear Ms._____, you areX\n" + //
                        "XXXXXXXXXX        X            XXXinvited to the Murdough\n" + //
                        " X        XXXXXXXX           XX  X        Party!        X\n" + //
                        "  X                       XXX    X                      s\n" + //
                        "   X                    XX       X   Congratulations!   X\n" + //
                        "    X                XXX         X                      X\n" + //
                        "     X            XXX            X                      X\n" + //
                        "      X         XX               X                      X\n" + //
                        "       X     XXX                 X Time: Saturday, 20:00X\n" + //
                        "        X  XX                    X XXXXXXXXXXXXXXXXXXXX X\n" + //
                        "         XX                      X                      X\n" + //
                        "                                 XXXXXXXXXXXXXXXXXXXXXXXX");
        delay(2);
    System.out.println("Clarissa Ainsworth's Invitation to the Dinner Party:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Dear Esteemed Guests,");
        System.out.println("I humbly invite you to join me for an evening of fine dining, lively conversation, and, I daresay, some much-needed respite from the usual bustle.");
        System.out.println("The party will be held at my residence, and your presence would honor me greatly.");
        System.out.println("The following will attend:");
        System.out.println("- Businessman Victor Hale");
        System.out.println("- Chef Gustav Morel");
        System.out.println("I look forward to a pleasant evening.\nSincerely, Clarissa Ainsworth Westmore\n");
        
    System.out.println("Doctor, will you be attending? \n enter 1 if you will, 2 if you will not");
    r = sc.nextInt();
    if(r==2){
              Scanner in = new Scanner(System.in);
        System.out.println("You decide not to open the letter after taking in a good look.");
        System.out.println("You decide to throw it away after seeing who it came from.");
        delay(1);
        flushScreen();
        System.out.println("~~~~~~~~~~~~~~~~                                                                \n" + //
                        "~Sunday Night~                                                                \n" + //
                        "~~~~~~~~~~~~~~~~");
        System.out.println("Throughout the day, you feel a draw towards the letter.");
        System.out.println("Despite this, you continue through your mundane work, diagnosing patients and recommending treatments");
        System.out.println("Once you arrive home after a tiring day of work, you turn on the tv...");
        delay(1);
        flushScreen();
        System.out.println("      X                                                                  \n" + //
                        "    X   X         XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX            \n" + //
                        " XXXXXXXXXXX      XX                                       XX            \n" + //
                        " XXXXXXXXXXX      XX  XXXXXXXXXXXX           XXXXXXXXXXXX  XX            \n" + //
                        " XX       XX      XX  X  XXXXXX  X           XXXXXXXXXXXX  XX            \n" + //
                        " XX XXXXX XX      XX  X X      X X           XX X   X  XX  XX            \n" + //
                        " XX XX XX XX      XX  X          X           X    X     X  XX            \n" + //
                        " XX XXXXX XX      XX  XXXXXXXXXXXX           XXXXXXXXXXXX  XX            \n" + //
                        " XXXXXXXXXXX      XX    X      X               X      X    XX            \n" + //
                        " XXXXXXXXXXX      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX            \n" + //
                        "                  XXBreaking News: Murder in Murdough ManorXX            \n" + //
                        "                  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX            \n" + //
                        "                  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX            \n" + //
                        "                                XxxxxxxxxxxxxxxX                         \n" + //
                        "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        delay(2);
        System.out.println("With the name of your previous husband's manor displayed, you sit there in shock");
        delay(1);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" + //
                        "X        The Jennyton Town Times            X\n" + //
                        "X        -----------------------            X\n" + //
                        "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" + //
                        "X     XXX     XPolice Reports no survivor.  X\n" + //
                        "X   XX   XX   XSuspects foul play. Murder   X\n" + //
                        "X XXXXXXXXXXX Xweapon unidentified. Motive  X\n" + //
                        "X X X     X X Xunclear. Exercise caution as X\n" + //
                        "X X  XXXXX  X XMurderer could still be out  X\n" + //
                        "XXXXXXXXXXXXXXXthere.                       X\n" + //
                        "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" + //
                        "XOn Sunday night, after                   X\n" + //
                        "Xpolice were called to   X    XXXXXXXXXX    X\n" + //
                        "Xperform a wellness check.    X X    X X    X\n" + //
                        "XA horrifying seen was   X    X  XXXX  X    X\n" + //
                        "Xdiscovered. Victims: Mr.X    X XXXXXX X    X\n" + //
                        "XMurdough, Mrs. Murdough,X    XXXXXXXXXX    X\n" + //
                        "XChef Charles, and Mr.   X     X     X      X\n" + //
                        "XJames Smith.            X     X     X      X\n" + //
                        "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" + //
                        "\n" + //
                        "");
        delay(2);
        System.out.println("The newspaper falls out of your hands. The possibility that you could have died as well sends a chill down your spine.");
        System.out.println("Despite this, a morbid sense of curiosity continues to haunt you.");
        delay(1);
        System.out.println("Police were unable to solve the case, and now the party at Murdough manor will forever remain a mystery yet to be solved...");
        delay(2);
        flushScreen();
    }
    if(r==1){
      flushScreen();
      System.out.println("Hopefully you made the right decision, Doctor");
      delay(1);
      flushScreen();
              System.out.println("~~~~~~~~~~~~~~~~                                                                \n" + //
                        "~Murdough Manor~                                                                \n" + //
                        "~~~~~~~~~~~~~~~~    XX                                     XX                   \n" + //
                        "                  XX  XX   XXXXXXXXXXXXXXXXXXXXXXXXXXX  XXX  XX                 \n" + //
                        "                XX       XX                           XXX      X                \n" + //
                        "              XX          X                          X          XX              \n" + //
                        "            XX             X                        XX            X             \n" + //
                        "          XX                XX                    XX               XX           \n" + //
                        "          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX          \n" + //
                        "          X X    X   X    X X XXXXXXX     XXXXXXX X X     X  X     X X          \n" + //
                        "          X XXXXXX   XXXXXX X X     X     X     X X XXXXXXX  XXXXXXX X          \n" + //
                        "          X XX  XX   X   XX X X     X     X     X X XX   XX  XX   XX X          \n" + //
                        "          X XX  XX   X   XX X XXXXXXX     XXXXXXX X XX   XX  XX   XX X          \n" + //
                        "        XXX XX  XX   X   XX X      XXXXXXXXXX     X XX   XX  XX   XX XXX        \n" + //
                        "     XXX  X XXXXXX   XXXXXX X      X   X    X     X XXXXXXX  XXXXXXX X  XXXX    \n" + //
                        "XXXXX     X X    X   X    X X      X   X    X     X X     X  X     X X      XXXX\n" + //
                        "   X      X X    X   X    X X  XXXXXXXXXXXXXXXXXXXX X     X  X     X X       X  \n" + //
                        "   X      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX       X  \n" + //
                        "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      delay(1);
      System.out.println("You are now at the Heiress's mansion");
      delay(1);
      System.out.println("Shivers trickle down your spine as you pass by the memorial: to all the Ainsworth deceased.");
      delay(3);
      System.out.println("An engine revs behind you and you turn around, shocked to see a dark red "+ getRandomString(new String[] {
        "Rolls-Royce Droptail",
        "Pininfarina B95",
        "Mercedes-Benz 300 SLR"
    }) + " behind you, and the businessman emerging from the car's driver's seat");
      System.out.println( new String[] {"You nodded appreciatively at his ride", "You raised your eyebrows at the car and the businessman chuckled"});
      System.out.println("You walked inside together, your eyes wandering on the lavish displays of luxury");
      delay(5);
      flushScreen();
      System.out.println("You sit down for dinner, reminiscing over all the memories you had with these people in college. You knew Gustave worked for Clarissa now, although according to what she told you, his tanturms had not ceased, and in exchange for the good food, she had to deal with him now");
      System.out.println("The dinner was great, but the sinking feeling in your stomach worsened when");
      delay(3);

      delay(2);
      System.out.println("the lights flickered off, leaving everyone in a panic. You heard dishes fall of the table, and then chaos erupted.");
      delay(2);
      System.out.println("You heard the butler enter the room, his calm voice cutting through the madness. You heard him say, \"it was likely a maid who brushed pass the senstive switch\"");
      delay(4);
      System.out.println("You almost wish the butler hadn't turned on the lights, as now the stilled body of the Heiress was visible, a long with her smashed wine glass");
      delay(3);
      flushScreen();
      System.out.println("Time stilled, your heart pounding. Dizzy, you look around and everyone is backing away, looing at each other");
      delay(3);
      System.out.println("Accusations fly across the room, the sinking feeling in your stomach soldifiying as you rush forward. As a doctor, you know that she's gone now.");
      delay(3);
      System.out.println("You scream loudly, shocking everybody. You point a shaking finger towards Victor");
      delay(2);
      System.out.println("Voice hoarse, like you hadn't spoken in years, you tell Victor to call the police, and for the butler to start the car. The chef looks terrified, muttering some kind of prayer, and you decide to leave him be");
      flushScreen();
      System.out.println("Now you sit in a chair far away from the heiress, everyone around you. There was no reception, no way to get out in this weather. You were stuck, but with a mystery");
      delay(3);
      System.out.println("Now so you stand up, now assuming the role of a detective");
      delay(3);
      System.out.println("A rush of revenge fills your chest as you swear to the comapny that you will sovle the murder, if its the last thing you do");
      System.out.println("Buckle in doctor its about to be a long ride.");
      boolean guessed=false;
      while(guessed==false){
        int r2 = (int)(Math.random()*3);
        String[] s = {"the Businessman, Victor", "the Chef, Gustave", "the butler"};
        String hi = s[r2];
      System.out.println("Would you like \n1: inspect a prop, \n2:guess who the murderer is\n and remember-since you chose the easy level, you will a steady flow of hints until you run out.");
          r = sc.nextInt();
          Mystery theGame=ifEasy();
      if(r==1){
         System.out.println("Which prop would you like to inspect?");
         theGame.getPropsR1(hi);
         r = sc.nextInt();
         System.out.println(theGame.inspectProp(r));
         System.out.println("who is the murderer?");
        System.out.println("Is it\n 1:the Businessman, Victor \n 2:the Chef, Gustave \n 3:the butler");
        r=sc.nextInt();
        String response = "";
        theGame.setMurderer2(hi);
        response = s[r-1];        
        if(response.equals(hi)&&easy==false){
          System.out.println("Congrats, you solved the mystery!!");
          System.out.println("Incorrect, keep going!");        
          break;
        }
       }
      else if(r==2){
        System.out.println("who is the murderer?");
        System.out.println("Is it\n 1:the Businessman, Victor \n 2:the Chef, Gustave \n 3:the butler");
        r=sc.nextInt();
        String response = "";
        theGame.setMurderer2(hi);
        response = s[r-1];        
        if(response.equals(hi)&&easy==false){
          System.out.println("Congrats, you solved the mystery!!");
          System.out.println("Incorrect, keep going!");        
          break;
        }

        else{
          if(response.equals(hi2)){
            System.out.println("Congrats, you solved the mystery!!");
            break;
          }
          System.out.println("Incorrect, keep going!");        
        }
      }
    }
  }
      System.out.println("Congratulations, thank you for playing");
   }
    
   
   public static Mystery ifEasy(){
      Mystery hi= new Mystery();
    
      hi.setProps(new ArrayList<Prop>());
      Prop p = new Prop("Voicemail", null, "Voicemail from Heiress to to her Lawyer, 30 minutes before the party", "None");
      hi.setPropsR1(p);
      p = new Prop("Shredded Letter in the Fireplace", null, "A partially burned legal letter from the Heiress’ lawyer was found in the fireplace. It mentions changes to her will, cutting the businessman out entirely.", "b");
      hi.setPropsR1(p);
      p = new Prop("Document of Bankrupcy", null, "The Businessman has filed for bankrupcy", "b");
      hi.setPropsR1(p);
      p = new Prop("Family tree drawing in the living room", null, "                       Lord Percival Ainsworth ── Helena Ainsworth (née DuMont)\n" + //
                "                                         │\n" + //
                "        ┌────────────────────────────────┴─────────────────────────────────┐\n" + //
                "        │                                                                  │\n" + //
                " Reginald Ainsworth                                                 Octavia Ainsworth\n" + //
                "      │                                                                 │\n" + //
                " Beatrice Lysander                                                 Charles Hale\n" + //
                "      │                                                                 │\n" + //
                "      │                                                                 │\n" + //
                " Clarissa Ainsworth                   ┌───────────────┴──────────────┐\n" + //
                "                                                      │                              │\n" + //
                "                                  Victor Hale               Amelia Hale \n" + //
                "", "None");
      hi.setPropsR1(p);
      p = new Prop("Voicemail from the Butler to a suspicious number", null, "The voicmail says, \"It’ll be done tonight. After dessert.\"", "bu");
      hi.setPropsR1(p);
      p = new Prop("Wine Delivery Cancellation", null, "A call from the winery explaining that due to the weather, the wine delivery, after dessert would not be possible", "c");
      hi.setPropsR1(p);
      p = new Prop("Peanuts found near Heiress's plate", null, "The Heiresss, deathly allergic to peanuts, would die if she accidentally ate it", "c");
      hi.setPropsR1(p);
      p = new Prop("Poisoned pills", null, "poisoned pills found in the Heiress's food", "c");
      hi.setPropsR1(p);
      hi.setHumansR1(new ArrayList<Human>());
      hi.getHumansR1().add(new Human("Victor Hale", null, "Victor Hale became rich after he successfully founded a makeup brand inspired by his childhood sweetheart", "businessman"));
      hi.getHumansR1().add(new Human("Elias Graves", null, "The Grave Family has been working for the Ainsworth family for several generations, through thick and thin", "butler"));
      hi.getHumansR1().add(new Human("Gustave Morale", null, "Gustave Morale, famous chef, was all to happy to be the Ainsworth family chef upon seeing the large staff and kitchen", "chef"));
      hi.setMurderer(hi.getHumansR1().get(0));
      return hi;
}

public static void flushScreen(){
  System.out.print("\033[H\033[2J");
  //\033[H\033[2J
  System.out.flush();
}

public static String getRandomString(String[] array) {
    Random rand = new Random();
    return array[rand.nextInt(array.length)];
}
}
