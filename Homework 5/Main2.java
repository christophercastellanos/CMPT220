/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main2 {
    public static List<String> Gen3Pokedex = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Pokedex();
        

        System.out.println("Your random pokemon team is: ");
        randomTeam();

        System.out.println("Do you think this team can make you a Pokemon Master? Yes or No?");
        String response=sc.nextLine();
        MonMaster(response);
    }

    
   
    public static void Pokedex(){
        

        Gen3Pokedex.add("Treecko (#252)");
        Gen3Pokedex.add("Grovyle (#253)");
        Gen3Pokedex.add("Sceptile (#254)");
        Gen3Pokedex.add("Torchic (#255)");
        Gen3Pokedex.add("Combusken (#256)");
        Gen3Pokedex.add("Blaziken (#257)");
        Gen3Pokedex.add("Mudkip (#258)");
        Gen3Pokedex.add("Marshtomp (#259)");
        Gen3Pokedex.add("Swampert (#260)");
        Gen3Pokedex.add("Poochyena (#261)");
        Gen3Pokedex.add("Mightyena (#262)");
        Gen3Pokedex.add("Zigzagoon (#263)");
        Gen3Pokedex.add("Linoone (#264)");
        Gen3Pokedex.add("Wurmple (#265)");
        Gen3Pokedex.add("Silcoon (#266)");
        Gen3Pokedex.add("Beautifly (#267)");
        Gen3Pokedex.add("Cascoon (#268)");
        Gen3Pokedex.add("Dustox (#269)");
        Gen3Pokedex.add("Lotad (#270)");
        Gen3Pokedex.add("Lombre (#271)");
        Gen3Pokedex.add("Ludicolo (#272)");
        Gen3Pokedex.add("Seedot (#273)");
        Gen3Pokedex.add("Nuzleaf (#274)");
        Gen3Pokedex.add("Shiftry (#275)");
        Gen3Pokedex.add("Talo (#276)");
        Gen3Pokedex.add("Swellow (#277)");
        Gen3Pokedex.add("Wingull (#278)");
        Gen3Pokedex.add("Pelipper (#279)");
        Gen3Pokedex.add("Surskit (#280)");
        Gen3Pokedex.add("Masquerain (#281)");
        Gen3Pokedex.add("Shroomish (#282)");
        Gen3Pokedex.add("Breloom (#283)");
        Gen3Pokedex.add("Slakoth (#284)");
        Gen3Pokedex.add("Vigoroth (#285)");
        Gen3Pokedex.add("Slaking (#286)");
        Gen3Pokedex.add("Nincada (#287)");
        Gen3Pokedex.add("Ninjask (#288)");
        Gen3Pokedex.add("Shedinja (#289)");
        Gen3Pokedex.add("Whismur (#290)");
        Gen3Pokedex.add("Loudred (#291)");
        Gen3Pokedex.add("Exploud (#292)");
        Gen3Pokedex.add("Makuhita (#293)");
        Gen3Pokedex.add("Hariyama (#294)");
        Gen3Pokedex.add("Azurill (#295)");
        Gen3Pokedex.add("Nosepass (#296)");
        Gen3Pokedex.add("Skitty (#297)");
        Gen3Pokedex.add("Delcatty (#298)");
        Gen3Pokedex.add("Sableye (#299)");
        Gen3Pokedex.add("Mawile (#300)");
        Gen3Pokedex.add("Aron (#301)");
        Gen3Pokedex.add("Lairon (#302)");
        Gen3Pokedex.add("Aggron (#303)");
        Gen3Pokedex.add("Meditite (#304)");
        Gen3Pokedex.add("Medicham (#305)");
        Gen3Pokedex.add("Electrike (#306)");
        Gen3Pokedex.add("Manectric (#307)");
        Gen3Pokedex.add("Plusle (#308)");
        Gen3Pokedex.add("Minun (#309)");
        Gen3Pokedex.add("Volbeat (#310)");
        Gen3Pokedex.add("Illumise (#311)");
        Gen3Pokedex.add("Roselia (#312)");
        Gen3Pokedex.add("Gulpin (#313)");
        Gen3Pokedex.add("Swalot (#314)");
        Gen3Pokedex.add("Carvanha (#315)");
        Gen3Pokedex.add("Sharpedo (#316)");
        Gen3Pokedex.add("Wailmer (#317)");
        Gen3Pokedex.add("Wailord (#318)");
        Gen3Pokedex.add("Numel (#319)");
        Gen3Pokedex.add("Camerupt (#320)");
        Gen3Pokedex.add("Torkoal (#321)");
        Gen3Pokedex.add("Spoink (#322)");
        Gen3Pokedex.add("Grumpig (#323)");
        Gen3Pokedex.add("Spheal (#324)");
        Gen3Pokedex.add("Sealeo (#325)");
        Gen3Pokedex.add("Walrein (#326)");
        Gen3Pokedex.add("Clamperl (#327)");
        Gen3Pokedex.add("Huntail (#328)");
        Gen3Pokedex.add("Gorebyss (#329)");
        Gen3Pokedex.add("Relicanth (#330)");
        Gen3Pokedex.add("Luvdisc (#331)");
        Gen3Pokedex.add("Bagon (#332)");
        Gen3Pokedex.add("Shelgon (#333)");
        Gen3Pokedex.add("Salamence (#334)");
        Gen3Pokedex.add("Beldum (#335)");
        Gen3Pokedex.add("Metang (#336)");
        Gen3Pokedex.add("Metagross (#337)");
        Gen3Pokedex.add("Registeel (#338)");
        Gen3Pokedex.add("Regice (#339)");
        Gen3Pokedex.add("Regirock (#340)");
        Gen3Pokedex.add("Latias (#341)");
        Gen3Pokedex.add("Latios (#342)");
        Gen3Pokedex.add("Kyogre (#343)");
        Gen3Pokedex.add("Groudon (#344)");
        Gen3Pokedex.add("Rayquaza (#345)");
        Gen3Pokedex.add("Jirachi (#346)");
        Gen3Pokedex.add("Deoxys (#347)");
        
        // I didn't make this list by hand. I would've lost my mind lol
        // used chat gpt to organize it in a list for me 

    }
   

    public static void randomTeam(){
        Random randomMon= new Random();
        
        for (int i=0;i<6;i++){
            int randomIndex=randomMon.nextInt(Gen3Pokedex.size());
            String PokemonTeam=Gen3Pokedex.get(randomIndex);
            System.out.println(PokemonTeam);
            if(PokemonTeam.equals("Rayquaza (#345)")||PokemonTeam.equals("Groudon (#344)")||PokemonTeam.equals("Kyogre (#343)")){
                System.out.println("Woah...How did you get this?! There's only one of them in the world!");
            }else if(PokemonTeam.equals("Grovyle (#253)")||PokemonTeam.equals("Jirachi (#346)")||PokemonTeam.equals("Metagross (#337)")){
                System.out.println("Woah!!! You got one of my favorites! You're one lucky trainer!");
            }else{
                System.out.println("This is a cool one too!");
            }
        }

    }
    public static void MonMaster(String response){
        Random rand= new Random();
        int PokemonMaster=rand.nextInt(2);

        String randomResult=(PokemonMaster==0)? "Yes":"No"; 

        if(response.equals(randomResult)){
            System.out.print("Congratulations! You're the new Pokemon Master of the Hoenn Region!");
        
        }else{
            System.out.println("Not quite! Better luck next time!");
        }
//  and didnt know how to make a 50/50 chance function so this was neat to learn 
    }
}
