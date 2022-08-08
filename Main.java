package sk.lukas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int cisloTyzdna = 1;
    String tyzden = "týždeň";
    Random random = new Random();
    String znovu;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> polievka = new ArrayList<>();
    ArrayList<String> polievka2 = new ArrayList<>();
    ArrayList<String> hydina = new ArrayList<>();
    ArrayList<String> bravcove = new ArrayList<>();
    ArrayList<String> drahe = new ArrayList<>();
    ArrayList<String> bezmasite = new ArrayList<>();



    // add a various soups clear
    polievka.add("Hrášková vývarová");
    polievka.add("Slepačí vývar so zeleninou,mäsom a rezancami (1,3,7)");
    polievka.add("Bažantí vývar");
    polievka.add("Divinový vývar");
    polievka.add("Zeleninová (číra) polievka s mrveničkou (1,3)");
    polievka.add("Teľací vývar s mäsom a špenátovými haluškami (1,3,7)");
    polievka.add("Hovädzia polievka s mäsom a zeleninou,celestínske rezance (1,3,7)");
    polievka.add("Pórová polievka so zemiakmi a pohánkou (1)");
    polievka.add("Pytliacka polievka(divinové mäso,pór,hríby,chilli) (0)");
    polievka.add("Ostrokyslá polievka (3,4,6,9,11)");
    polievka.add("Cesnaková (číra) polievka so zemiakmi a mletým hovädzím mäsom (0)");
    polievka.add("Francúzska cibuľová polievka s krutónmi");
    polievka.add("Hovädzí vývar so špenátovými haluškami a zeleninou (1,3,7)");
    polievka.add("Francúzska polievka so zeleninou,mäsom a cestovinou (1,3)");
    polievka.add("Vývar s pečeňovými haluškami a zeleninou (1,3)");


    // add a vaeious creme soups
    polievka2.add("Hrachová");
    polievka2.add("Kelová");
    polievka2.add("Karfiolová");
    polievka2.add("Hrášková - krémová polievka so slaninou (7)");
    polievka2.add("Držkova (1)");
    polievka2.add("Sedliacka polievka s krúpami,zeleninou,zemiakmi a klobásou (1)");
    polievka2.add("Hríbová so zemiakmi a zeleninou (1)");
    polievka2.add("Demikát s haluškami a slaninou (1,3,7)");
    polievka2.add("Fazuľová so zeleninou a údeným mäsom (1)");
    polievka2.add("Paradajková (0)");
    polievka2.add("Kukuricová krémová (1,7)");
    polievka2.add("Gulášová (1)");
    polievka2.add("Kapustová s mäsom a hríbami (12)");
    polievka2.add("Šošovicová na kyslo (7)");
    polievka2.add("Maďarská s klobásou a zemiakmi (0)");
    polievka2.add("Mrkvový krém s kokosovým mliekom a kari (0)");
    polievka2.add("Halászlé");
    polievka2.add("Paradajková so strúhaným eidamom (7)");
    
    
    
    // poultry meals
    hydina.add("Morčací gordon");
    hydina.add(" 120g Kurací paprikáš,maslové halušky");
    hydina.add(" 120g Kurací závitok plnený šunkou a špenátom,demiglace omáčka,ryža (7)");
    hydina.add(" 120g Soté Kung Pao (kuracie mäso,arašídy,smažená cibuľka),ryža (5,6,11)");
    hydina.add(" 120g Kuracie prsia v syrovom cestíčku,zemiakové pyré (1,3,7)");
    hydina.add(" 120g Gyros z morčacieho mäsa,tzatziki,ryza (7)");
    hydina.add(" 120g Kuracie prsia zapekané s paradajkou a mozarellou,ryza (7)");
    hydina.add(" 150g ,,Caesar šalát,,: kuracie mäso,chlebové krutóny,sardelový dressing (0)");
    hydina.add(" 250g Lasagne s kuracím mäsom,špenátom a syrom mozarrela (1,3,7)");
    hydina.add(" 200g Tortilla:pečené kuracie mäso,šalát,americký dressing,hranolky (1,3,7)");
    hydina.add(" 120g Kuracie ,,Catsu Curry,, (karí),jasmínová ryža (0)");
    hydina.add(" 120g Kuracie soté na smotane so šampiónmi,hráškom a pórom,ryža (1,7)");
    hydina.add(" 120g Kuracie prsia v slaninkovom cestíčku,zemiakové pyré (1,3,7)");
    hydina.add(" 250g Tortila: kuracie mäso so šalátom,cesnakový dressing,pečené zemiaky (1,3,7)");
    hydina.add(" 120g Morčací paprikáš (smotanový), cestovina (1,3,7)");
    hydina.add(
        " 120g Kuracie prsia v panko strúhanke,sweet-chilli,sezamová ryža,listový šalát (1,6,11)");
    hydina.add(" 120g Kuracia kapsa (na prírodno): údený syr,slanina,mladá cibuľa,ryža (7)");




    // pork meals
    bravcove.add("Bravčové kocky");
    bravcove.add("Zapekané karé");
    bravcove.add(" 120g Bravčová kapsa(vyprážaná) : slaninka,syr,feferónka,pyré (1,3,7)");
    bravcove.add(" 120g Kotlikový guláš,2ks chlieb (1,3,7)");
    bravcove.add(" 120g Segedínsky guláš z bravčového stehna,parená knedľa (1,3,7,12)");
    bravcove.add(" 120g Bravčové guľky s dubákovou omáčkou,krokety (7)");
    bravcove.add(" 120g Sviečková na smotane (hovádzie mäso),kysnutá knedľa (1,3,7)");
    bravcove.add(" 120g Bravčové rezníky v syrovom cestíčku,zemiakové pyre (1,3,7)");
    bravcove.add(" 120g Hovädzie stehno na hrášku,tarhoňa (1,3)");
    bravcove.add(" 120g Bravčová fašírka s kelovo-zemiakovým prívarkom (1,3,7)");
    bravcove.add(
        " 120g Bravčový steak,volské oko,slaninka,omáčka zo zeleného korenia,ryža (1,3,7)");
    bravcove.add(" 120g Pečená bravčová krkovička,biela dusená kapusta,parená knedľa (1,3,7,12)");
    bravcove.add(" 120g Plátky z bravčového karé na šampiňónoch,ryža (7)");
    bravcove.add(" 120g Bravčové stehno ,,Hamburg,, (šunka,uhorka,smotana),kysnutá knedľa (1,3,7)");
    bravcove.add(" 120g Čiernohorsky rezeň(bravč.),strúhaný syr,zem.pyré,kapustový šalát (1,3,7)");
    bravcove.add(" 250g Ceatoviny ,,Carbonara,, (smotana,mäsová slaninka,paemezán) (1,3,7)");




    // special meals
    drahe.add("Losos na masle");
    drahe.add("Hovädzí steak");
    drahe.add(" 150g Flank steak,coleslaw šalát,hranolky (3,7)");
    drahe.add(" 150g Losos pečený na masle,holandská omáčka,zemiakové pyré (3,4,7,12)");
    drahe.add(" 150g Pleskavica (teľacie mäso),pečené zemiaky,čalamáda (12)");
    drahe.add(" 150g Sumček africký zapekaný v parmezánovej kruste,zemiakové pyré (4,7)");
    drahe.add(" 150g Medajlónky z panenky v slaninke,prírodná omáčka,pečené zemiaky (0)");
    drahe.add(" 150g Pomaly pečený hovädzí krk,restované šúlance (0)");
    drahe.add(" 150g Chrbát z tresky,gratinované zemiaky,citrónová omáčka (3,4,7)");
    drahe.add(" 150g Pečená panenka,dubáková omáčka,žemlová knofla (1,3,7)");
    drahe.add(" 150g Rybie kúsky v pivnom cestíčku,batátové hranolky,tatárska omáčka (1,3,4,7)");
    drahe.add(" 150g Burger s trhaným kačacím mäsom,coleslaw šalát (0)");
    drahe.add(" 150g Vysmážané rybie kúskyv parmezán. cestíčku,šalát,pita chlieb,dressing (1,3,7)");
    drahe.add(
        " 150g Hovädzia sviečkovica s udon rezancami a zeleninou,pečená cibuľka,arašídy (1,5,6,11)");
    drahe.add(" 150g Treska pečená na masle,zwmiakové pyré,špenátová omáčka (4,7)");
    drahe.add(" 150 Pečená panenka so slivkovou omáčkou,zemiakové krokety (1,3)");




    // vegetarian meals
    bezmasite.add(" 240g Dubakové rizoto s parmezánom,rukolou a cherry paradajkami (7)");
    bezmasite.add("Zeleninový šalát");
    bezmasite.add(" 250g Zapekaná brokolica so syrovou omáčkou,varené zemiaky (3,7)");
    bezmasite.add(" 250g Lievance s ovocím a karamelom (1,3,7)");
    bezmasite.add(" 250g Tortilla plnená zeleninou a syrom cheddar,smotanový dressing (1,3,7)");
    bezmasite.add(" 250g Šúľance : orechová alebo maková posýpka,preliate maslom (1,3,7)");
    bezmasite.add(" 120g Encián v zemiakovom cestíčku,zemiakové pyré (1,3,7)");
    bezmasite.add(" 250g Dukátové buchtičky (domáce) s vanilkovým krémom (1,3,7)");
    bezmasite.add(" 250g Šalát s pohánkou,feta syrom,cherry paradajkami a hriankami (1,3,7)");
    bezmasite.add(" 250g Marhuľové parené buchty,posýpka: granko # orechy # mak,preliate maslom");





    do {

      System.out.println("  " + cisloTyzdna + "." + tyzden + "        PONDELOK");
      System.out.println("______________________________________________");

      System.out.println("Polievky:     1.  " + polievka.get(random.nextInt(polievka.size())));
      System.out.println("              2.  " + polievka2.get(random.nextInt(polievka2.size())));
      System.out.println("Hlavné jedlá :1. " + hydina.get(random.nextInt(hydina.size())));
      System.out.println("              2. " + bravcove.get(random.nextInt(bravcove.size())));
      System.out.println("              3. " + drahe.get(random.nextInt(drahe.size())));
      System.out.println("              4. " + bezmasite.get(random.nextInt(bezmasite.size())));

      System.out.println("\n                   UTOROK");
      System.out.println("______________________________________________");
      System.out.println("Polievky:     1.  " + polievka.get(random.nextInt(polievka.size())));
      System.out.println("              2.  " + polievka2.get(random.nextInt(polievka2.size())));
      System.out.println("Hlavné jedlá :1. " + hydina.get(random.nextInt(hydina.size())));
      System.out.println("              2. " + bravcove.get(random.nextInt(bravcove.size())));
      System.out.println("              3. " + drahe.get(random.nextInt(drahe.size())));
      System.out.println("              4. " + bezmasite.get(random.nextInt(bezmasite.size())));

      System.out.println("\n                   STREDA");
      System.out.println("______________________________________________");
      System.out.println("Polievky:     1.  " + polievka.get(random.nextInt(polievka.size())));
      System.out.println("              2.  " + polievka2.get(random.nextInt(polievka2.size())));
      System.out.println("Hlavné jedlá :1. " + hydina.get(random.nextInt(hydina.size())));
      System.out.println("              2. " + bravcove.get(random.nextInt(bravcove.size())));
      System.out.println("              3. " + drahe.get(random.nextInt(drahe.size())));
      System.out.println("              4. " + bezmasite.get(random.nextInt(bezmasite.size())));

      System.out.println("\n                  ŠTVRTOK");
      System.out.println("______________________________________________");
      System.out.println("Polievky:     1.  " + polievka.get(random.nextInt(polievka.size())));
      System.out.println("              2.  " + polievka2.get(random.nextInt(polievka2.size())));
      System.out.println("Hlavné jedlá :1. " + hydina.get(random.nextInt(hydina.size())));
      System.out.println("              2. " + bravcove.get(random.nextInt(bravcove.size())));
      System.out.println("              3. " + drahe.get(random.nextInt(drahe.size())));
      System.out.println("              4. " + bezmasite.get(random.nextInt(bezmasite.size())));

      System.out.println("\n                   PIATOK");

      System.out.println("______________________________________________");
      System.out.println("Polievky:     1.  " + polievka.get(random.nextInt(polievka.size())));
      System.out.println("              2.  " + polievka2.get(random.nextInt(polievka2.size())));
      System.out.println("Hlavné jedlá :1. " + hydina.get(random.nextInt(hydina.size())));
      System.out.println("              2. " + bravcove.get(random.nextInt(bravcove.size())));
      System.out.println("              3. " + drahe.get(random.nextInt(drahe.size())));
      System.out.println("              4. " + bezmasite.get(random.nextInt(bezmasite.size())));

      System.out.println("\nŽeláš si menu na ďaľší týždeň?\n");

      System.out.println("a  ano ");

      znovu = sc.nextLine();
      cisloTyzdna++;

    } while (znovu.equals("a"));

    sc.close();
  }
}
