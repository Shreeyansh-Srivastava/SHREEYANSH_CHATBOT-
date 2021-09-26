package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
public class Shreeyanshchatbot{
    public static void main(String[] args) throws Exception
    {
        int[] studentno = new int[0];
      Scanner sc=new Scanner(System.in);
        System.out.println("\nHi There, Whats your name?\n-----------------------------------------------------------");
      String name=sc.nextLine();
        System.out.println("Hi "+name+", How may I help you\n--------------------------------------------------------");
        //String task=sc.nextLine();
        while(true)
        {
            String task=sc.nextLine();
            if(task.contains("hello")||task.contains("Hello"))
            {
                System.out.println("\n---------------------------------------------------------------\nHi!\n---------");
            }
            else if(task.contains("weather"))
            {
                System.out.println("\nSure!\n------------------------------------------------------------------------");
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.accuweather.com/en/in/ghaziabad/206683/weather-forecast/206683"));
                //System.out.println("I haven't checked that....\n---------------------------------------------------");
            }
            else if(task.contains("name"))
            {
                System.out.println("My name is Shreeyanshchatbot\n---------------------------------------------------");
            }
            else if(task.contains("my details"))
            {
                System.out.println("\n Enter your Student no.\n-------------------------------------------------------");

                    for(int i=0;i<7;i++)
                    {
                        studentno[i]=sc.nextInt();
                    }
                    boolean retval=Arrays.asList(studentno).contains(010);
                    if(retval==true)
                    {
                        System.out.println("\nYour branch is C.S.E.\n------------------------------------------------");
                    }

            }
            else if(task.contains("open erp")||task.contains("open my erp"))
            {
                System.out.println("\nSure\n-------------------------------------------------------------------------");
                Desktop s = Desktop.getDesktop();
                s.browse(new URI("https://beta.edumarshal.com/"));

            }
            else if(task.contains("what is")||task.contains("search for"))
            {
                String Keyword =task.substring(task.lastIndexOf(" ")+1); //String Keyword is used to accept the word to be searched on the Search Engine by google
                System.out.println("Here's What I found on google\n--------------------------------------------------");
                Desktop search = Desktop.getDesktop();
                search.browse(new URI("https://www.google.com/search?q="+Keyword+"&oq="+Keyword+"&aqs=chrome..69i57j46i275i433i512j0i67j46i67i199i433i465j0i67i433j46i67j0i67j46i512j0i67j0i512.660j0j15&sourceid=chrome&ie=UTF-8"));
            }
            else if (task.contains("shop for"))
        {
            System.out.println("What do Online shopping Site to do you prefer\n--------------------------------------");
            String task2=sc.nextLine();
            if(task2.contains("amazon")||task2.contains("Amazon"))
            {
                String Keyword =task.substring(task.lastIndexOf(" ")+1); //String Keyword is used to accept the word to be searched on the Search Engine by google
                Desktop search = Desktop.getDesktop();
                search.browse(new URI("https://www.amazon.in/s?k="+Keyword+"&ref=nb_sb_noss_2"));
            }
            else if(task2.contains("Flipkart")||task2.contains("flipkart"))
            {
                String Keyword =task.substring(task.lastIndexOf(" ")+1); //String Keyword is used to accept the word to be searched on the Search Engine by google
                Desktop search = Desktop.getDesktop();
                search.browse(new URI("https://www.flipkart.com/search?q="+Keyword+"&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off"));
            }
        }
            else if(task.contains("play")||task.contains("Play")||task.contains("play the song")||task.contains("Play The song"))
            {
                String Keyword =task.substring(task.lastIndexOf(" ")+1); //String Keyword is used to accept the word to be searched on the Search Engine by google
                System.out.println("Playing "+Keyword+" on Youtube\n--------------------------------------------------");
                Desktop search = Desktop.getDesktop();
                search.browse(new URI("https://www.youtube.com/results?search_query="+Keyword));
            }
            else if(task.contains("bad mood")||task.contains("entertainment")||task.contains("entertain")||task.contains("not feeling good"))
            {
                System.out.println("\nOkay, Let me play something for you\n------------------------------------------");
                String Keyword =task.substring(task.lastIndexOf(" ")+1); //String Keyword is used to accept the word to be searched on the Search Engine by google
                Desktop search = Desktop.getDesktop();
                search.browse(new URI("https://www.youtube.com/results?search_query=bhajan"));
            }
            else if(task.contains("mail")||task.contains("Mail"))
            {
                System.out.println("\n------------------------------------------------------------------------------------------------------------------\nPlease give me the address\n-------------------------------------");
                String task2 = sc.nextLine();
                Desktop d = Desktop.getDesktop();
                d.mail(new URI("mailto:"+task2));
            }
            else{
                int value=3;
                double r=Math.random();
                int response=(int) (r*3);
            if(response==0)
            {
                System.out.println("\n----------------------------------------------------------------------------\nSorry "+name+", but i cannot help you for that due to the limitation of my code.You can ask my developer Shreeyansh Srivastava to add that feature in my programme\n------------------------------------------------------------------------------------------");//Ramdom output 1
            }
            else if(response==1)
            {
                System.out.println("\n---------------------------------------------------------------------------------------\nI am extremely sorry but i cannot reply you for that.\n Why don't you ask my developer to add thet feature in my programme\n---------------------------------------------------------------------------------------------------");
            }
            else if(response==2)
            {
                System.out.println("\n--------------------------------------------------------------------------------------\nSorry, but i am un responsive for this commmand. Ask my developer for any query\n----------------------------------------------------------------------------------------------------------------------");
            }
            }





        }
    }


}
