package com.example.bookshelf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView rcid;
List<Book> listbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listbook=new ArrayList<>();
        listbook.add(new Book("Atomic Love","Love","Chicago, 1950. Rosalind Porter has always defied expectations--in her work as a physicist on the Manhattan Project and in her passionate love affair with colleague Thomas Weaver. Five years after the end of both, her guilt over the bomb and her heartbreak over Weaver are intertwined. She desperately misses her work in the lab, yet has almost resigned herself to a more conventional life.\n" +
                "\n" +
                "Then Weaver gets back in touch--and so does the FBI. Special Agent Charlie Szydlo wants Roz to spy on Weaver, whom the FBI suspects of passing nuclear secrets to Russia. Roz helped to develop these secrets and knows better than anyone the devastating power such knowledge holds. But can she spy on a man she still loves, despite her better instincts? At the same time, something about Charlie draws her in. He's a former prisoner of war haunted by his past, just as her past haunts her.\n" +
                "\n" +
                "As Rosalind's feelings for each man deepen, so too does the danger she finds herself in. She will have to choose: the man who taught her how to love . . . or the man her love might save?",R.drawable.atomiclove));
        listbook.add(new Book("Beyond The Horizon","War/Historical","From the author of The House by the Lake comes a powerful novel of friendship during World War II, fighting for the truth, and making peace with the past.\n" +
                "\n" +
                "At the height of World War II, Eva Scott’s dream comes true. Accepted into the Women Airforce Service Pilots (WASP), she leaves balmy California and the man she loves for grueling training in Texas, ultimately landing at formidable Camp Davis in North Carolina.\n" +
                "\n" +
                "Vastly outnumbered by men and amidst contempt, discrimination, and sabotage, Eva and her closest friends, the unconventional Nina and straightlaced Helena, remain loyal to their mission and to each other. They stay focused on the horizon, determined to prove themselves capable women pilots. Until a fatal mission sends Eva’s dream crashing to earth . . .\n" +
                "\n" +
                "Now, decades later, is it possible to discover the truth about the night that changed her life? Is there any hope she’ll recover all that she’s lost? When Eva finds herself embroiled in the fight to get military recognition for the WASP, she’s forced to confront the past, and to make a decision that could forever change her future.\n" +
                "\n" +
                "Thrilling and inspiring, Beyond the Horizon is a portrait of love, friendship, and valor in a time of war—and a tribute to the brave women who risked their lives for their country. ",R.drawable.beyondthehorizon));
        listbook.add(new Book("Deadly Alliance","Historical","When Peter Eddy and his commando team inadvertently upset the Soviets during their most recent mission, they never imagined the diplomatic nightmares that would ensue. They have one chance to redeem themselves: tasked with destroying a bridge in Nazi-occupied Bosnia, Peter and his war-weary team reluctantly agree to drop behind enemy lines. The assignment should be a simple one—were it not for the fact that they are being deployed on a suicide mission.\n" +
                "\n" +
                "Genevieve Olivier is devastated by the news of Peter’s disappearance. After all they’ve endured in this war, the determined OSS worker is unwilling to simply let go of the man she hopes to spend her life with. Desperate for information, her work as a courier soon escalates into a counterintelligence duel with a Fascist assassin—and Genevieve is his newest target . . . ",R.drawable.deadlyalliance));
        listbook.add(new Book("My Funny Valentine","Romance","Award winning Author Blue Saffire presents\n" +
                "My Funny Valentine\n" +
                "Love doesn’t always come in a beautifully wrapped, elegant, gilded box. Ever heard of the chipped plate or the ugly duckling? I’ve been referenced to as both. It’s fine with me. I still have no problem going after what I want. I’ve built a multi-million-dollar company, soon to be worth billions.\n" +
                "Yet, I still yearn for her, the one who has swept into my company to help me soar to greater heights. Talina Valentine, that’s her name, she’s as beautiful as her name implies. I never thought I had a shot with her. Not just because of my shortcomings and my damaged past. She’s had a boyfriend from the time I first set eyes on her. Now he’s gone.\n" +
                "One taste will change everything.\n" +
                "I like Chocolate, the blacker the berry the sweeter the juice. I’ve dated nothing but fine chocolate all my life. I thought Malcolm would be my husband with his fine self. Yet, somehow, my life has turned upside down and so has my view of it.\n" +
                "My boss is not my type and I never would have thought to look his way, until one day…well, one day that happened to change. Sexy comes in all forms. When it comes to Nelson Fisher, sexy has taken on an all new meaning.\n" +
                "It might be time to add a little cream to my coffee, even if the carton comes with a few dents.\n" +
                "*This is a standalone Valentine’s Novella that will grow into the Hold On To Me series. This book does not end in a cliffhanger, but a HEA to be continued is implied.",R.drawable.myfunnyvalentine));
        listbook.add(new Book("The Flight Girls","Historical","1941. Audrey Coltrane has always wanted to fly. It's why she implored her father to teach her at the little airfield back home in Texas. It's why she signed up to train military pilots in Hawaii when the war in Europe began. And it's why she insists she is not interested in any dream-derailing romantic involvements, even with the disarming Lieutenant James Hart, who fast becomes a friend as treasured as the women she flies with. Then one fateful day, she gets caught in the air over Pearl Harbor just as the bombs begin to fall, and suddenly, nowhere feels safe.\n" +
                "\n" +
                "To make everything she's lost count for something, Audrey joins the Women Airforce Service Pilots program. The bonds she forms with her fellow pilots reignite a spark of hope in the face war, and--when James goes missing in action--give Audrey the strength to cross the front lines and fight not only for her country, but for the love she holds so dear.\n" +
                "\n" +
                "Shining a light on a little-known piece of history, The Flight Girls is a sweeping portrayal of women's fearlessness, love, and the power of friendship to make us soar",R.drawable.theflightgirls));
        listbook.add(new Book("The Fortunate Ones","Humor","At Twin Oaks Country Club, there are the fortunate ones, and then there are the rest of us: the waiters, the caddies, the valets, and in my case, the cabana girls. Most days, I’m poolside in a pleated skirt, dishing out margaritas to tycoons and titans. It’s not exactly my dream job, but it does come with one perk…\n" +
                "\n" +
                "James Ashwood.\n" +
                "\n" +
                "He’s my silver lining in a custom black suit.\n" +
                "\n" +
                "Besides being a legacy member at the club, he’s a tech mogul and Austin’s most eligible bachelor. Oh, and those dimples? Yeah, they make my stomach dip too.\n" +
                "\n" +
                "On good days, I catch his sleek Porsche winding down the tree-lined drive. On better days, I steal a glimpse of his handsome profile as we pass in the hall. And on the absolute best day, I find him alone at the bar, looking for company.\n" +
                "\n" +
                "“Come have a seat.”\n" +
                "\n" +
                "Those four little words set me down a path I never could have imagined. Private planes, penthouse suites, and temptations around every corner make it impossible to keep my distance. His world feels decadent and wild—but overindulgence comes with a cost. Every kiss comes with strings. Every erotic encounter is a promise I’m not ready to keep.\n" +
                "\n" +
                "When I pump the brakes, he hits the gas. James doesn’t want to go slow—he wants a commitment.\n" +
                "\n" +
                "And the thing about the fortunate ones?\n" +
                "\n" +
                "They’re used to getting what they want. ",R.drawable.thefortunateones));
        //listbook.add(new Book("The German Heiress","Category Book","Description Book",R.drawable.thegermanheiress));
        listbook.add(new Book("The Last Year Of The War","Fiction","Elise Sontag is a typical Iowa fourteen-year-old in 1943--aware of the war but distanced from its reach. Then her father, a legal U.S. resident for nearly two decades, is suddenly arrested on suspicion of being a Nazi sympathizer. The family is sent to an internment camp in Texas, where, behind the armed guards and barbed wire, Elise feels stripped of everything beloved and familiar, including her own identity.\n" +
                "\n" +
                "The only thing that makes the camp bearable is meeting fellow internee Mariko Inoue, a Japanese-American teen from Los Angeles, whose friendship empowers Elise to believe the life she knew before the war will again be hers. Together in the desert wilderness, Elise and Mariko hold tight the dream of being young American women with a future beyond the fences.",R.drawable.thelastyearofthewar));
        listbook.add(new Book("The Verdun Affair","Romance","A sweeping, romantic, and profoundly moving novel, set in Europe in the aftermath of World War I and Los Angeles in the 1950s, about a lonely young man, a beautiful widow, and the amnesiac soldier whose puzzling case binds them together even as it tears them apart.\n" +
                "\n" +
                "In 1920, two young Americans meet in Verdun, the city in France where one of the most devastating battles of the war was waged. Tom is an orphan from Chicago, a former ambulance driver now gathering bones from the battlefield; Sarah is an expatriate from Boston searching for the husband who wandered off from his division and hasn’t been seen since. Quickly, the two fall into a complicated affair against the ghostly backdrop of the ruined city. Months later, Sarah and Tom meet again at the psychiatric ward of an Italian hospital, drawn there by the appearance of a mysterious patient the doctors call Douglas Fairbanks (after the silent film actor) — a shell-shocked soldier with no memory of who he is. At the hospital, Tom and Sarah are joined by Paul, an Austrian journalist with his own interest in the amnesiac.\n" +
                "\n" +
                "Each is keeping a secret; each has been shaken by the horrors of war. Decades later, Tom, now a successful screenwriter, encounters Paul by chance in LA, still grappling with the questions raised by this gorgeous and incisive novel: How to begin again after unfathomable trauma? How to love after so much loss? And who, in the end, was Douglas Fairbanks?\n" +
                "\n" +
                "From the bone-strewn fields of Verdun to the bombed-out cafés of Paris, from the riot-torn streets of Bologna to the riotous parties of 1950s Hollywood, The Verdun Affair is a riveting tale of romance, grief, and the far-reaching consequences of a single lie",R.drawable.theverdunaffair));
        listbook.add(new Book("Atomic Love","Love","Chicago, 1950. Rosalind Porter has always defied expectations--in her work as a physicist on the Manhattan Project and in her passionate love affair with colleague Thomas Weaver. Five years after the end of both, her guilt over the bomb and her heartbreak over Weaver are intertwined. She desperately misses her work in the lab, yet has almost resigned herself to a more conventional life.\n" +
                "\n" +
                "Then Weaver gets back in touch--and so does the FBI. Special Agent Charlie Szydlo wants Roz to spy on Weaver, whom the FBI suspects of passing nuclear secrets to Russia. Roz helped to develop these secrets and knows better than anyone the devastating power such knowledge holds. But can she spy on a man she still loves, despite her better instincts? At the same time, something about Charlie draws her in. He's a former prisoner of war haunted by his past, just as her past haunts her.\n" +
                "\n" +
                "As Rosalind's feelings for each man deepen, so too does the danger she finds herself in. She will have to choose: the man who taught her how to love . . . or the man her love might save?",R.drawable.atomiclove));
        listbook.add(new Book("Beyond The Horizon","War/Historical","From the author of The House by the Lake comes a powerful novel of friendship during World War II, fighting for the truth, and making peace with the past.\n" +
                "\n" +
                "At the height of World War II, Eva Scott’s dream comes true. Accepted into the Women Airforce Service Pilots (WASP), she leaves balmy California and the man she loves for grueling training in Texas, ultimately landing at formidable Camp Davis in North Carolina.\n" +
                "\n" +
                "Vastly outnumbered by men and amidst contempt, discrimination, and sabotage, Eva and her closest friends, the unconventional Nina and straightlaced Helena, remain loyal to their mission and to each other. They stay focused on the horizon, determined to prove themselves capable women pilots. Until a fatal mission sends Eva’s dream crashing to earth . . .\n" +
                "\n" +
                "Now, decades later, is it possible to discover the truth about the night that changed her life? Is there any hope she’ll recover all that she’s lost? When Eva finds herself embroiled in the fight to get military recognition for the WASP, she’s forced to confront the past, and to make a decision that could forever change her future.\n" +
                "\n" +
                "Thrilling and inspiring, Beyond the Horizon is a portrait of love, friendship, and valor in a time of war—and a tribute to the brave women who risked their lives for their country. ",R.drawable.beyondthehorizon));
        listbook.add(new Book("Deadly Alliance","Historical","When Peter Eddy and his commando team inadvertently upset the Soviets during their most recent mission, they never imagined the diplomatic nightmares that would ensue. They have one chance to redeem themselves: tasked with destroying a bridge in Nazi-occupied Bosnia, Peter and his war-weary team reluctantly agree to drop behind enemy lines. The assignment should be a simple one—were it not for the fact that they are being deployed on a suicide mission.\n" +
                "\n" +
                "Genevieve Olivier is devastated by the news of Peter’s disappearance. After all they’ve endured in this war, the determined OSS worker is unwilling to simply let go of the man she hopes to spend her life with. Desperate for information, her work as a courier soon escalates into a counterintelligence duel with a Fascist assassin—and Genevieve is his newest target . . . ",R.drawable.deadlyalliance));
        listbook.add(new Book("My Funny Valentine","Romance","Award winning Author Blue Saffire presents\n" +
                "My Funny Valentine\n" +
                "Love doesn’t always come in a beautifully wrapped, elegant, gilded box. Ever heard of the chipped plate or the ugly duckling? I’ve been referenced to as both. It’s fine with me. I still have no problem going after what I want. I’ve built a multi-million-dollar company, soon to be worth billions.\n" +
                "Yet, I still yearn for her, the one who has swept into my company to help me soar to greater heights. Talina Valentine, that’s her name, she’s as beautiful as her name implies. I never thought I had a shot with her. Not just because of my shortcomings and my damaged past. She’s had a boyfriend from the time I first set eyes on her. Now he’s gone.\n" +
                "One taste will change everything.\n" +
                "I like Chocolate, the blacker the berry the sweeter the juice. I’ve dated nothing but fine chocolate all my life. I thought Malcolm would be my husband with his fine self. Yet, somehow, my life has turned upside down and so has my view of it.\n" +
                "My boss is not my type and I never would have thought to look his way, until one day…well, one day that happened to change. Sexy comes in all forms. When it comes to Nelson Fisher, sexy has taken on an all new meaning.\n" +
                "It might be time to add a little cream to my coffee, even if the carton comes with a few dents.\n" +
                "*This is a standalone Valentine’s Novella that will grow into the Hold On To Me series. This book does not end in a cliffhanger, but a HEA to be continued is implied.",R.drawable.myfunnyvalentine));
        listbook.add(new Book("The Flight Girls","Historical","1941. Audrey Coltrane has always wanted to fly. It's why she implored her father to teach her at the little airfield back home in Texas. It's why she signed up to train military pilots in Hawaii when the war in Europe began. And it's why she insists she is not interested in any dream-derailing romantic involvements, even with the disarming Lieutenant James Hart, who fast becomes a friend as treasured as the women she flies with. Then one fateful day, she gets caught in the air over Pearl Harbor just as the bombs begin to fall, and suddenly, nowhere feels safe.\n" +
                "\n" +
                "To make everything she's lost count for something, Audrey joins the Women Airforce Service Pilots program. The bonds she forms with her fellow pilots reignite a spark of hope in the face war, and--when James goes missing in action--give Audrey the strength to cross the front lines and fight not only for her country, but for the love she holds so dear.\n" +
                "\n" +
                "Shining a light on a little-known piece of history, The Flight Girls is a sweeping portrayal of women's fearlessness, love, and the power of friendship to make us soar",R.drawable.theflightgirls));
        listbook.add(new Book("The Fortunate Ones","Humor","At Twin Oaks Country Club, there are the fortunate ones, and then there are the rest of us: the waiters, the caddies, the valets, and in my case, the cabana girls. Most days, I’m poolside in a pleated skirt, dishing out margaritas to tycoons and titans. It’s not exactly my dream job, but it does come with one perk…\n" +
                "\n" +
                "James Ashwood.\n" +
                "\n" +
                "He’s my silver lining in a custom black suit.\n" +
                "\n" +
                "Besides being a legacy member at the club, he’s a tech mogul and Austin’s most eligible bachelor. Oh, and those dimples? Yeah, they make my stomach dip too.\n" +
                "\n" +
                "On good days, I catch his sleek Porsche winding down the tree-lined drive. On better days, I steal a glimpse of his handsome profile as we pass in the hall. And on the absolute best day, I find him alone at the bar, looking for company.\n" +
                "\n" +
                "“Come have a seat.”\n" +
                "\n" +
                "Those four little words set me down a path I never could have imagined. Private planes, penthouse suites, and temptations around every corner make it impossible to keep my distance. His world feels decadent and wild—but overindulgence comes with a cost. Every kiss comes with strings. Every erotic encounter is a promise I’m not ready to keep.\n" +
                "\n" +
                "When I pump the brakes, he hits the gas. James doesn’t want to go slow—he wants a commitment.\n" +
                "\n" +
                "And the thing about the fortunate ones?\n" +
                "\n" +
                "They’re used to getting what they want. ",R.drawable.thefortunateones));
        //listbook.add(new Book("The German Heiress","Category Book","Description Book",R.drawable.thegermanheiress));
        listbook.add(new Book("The Last Year Of The War","Fiction","Elise Sontag is a typical Iowa fourteen-year-old in 1943--aware of the war but distanced from its reach. Then her father, a legal U.S. resident for nearly two decades, is suddenly arrested on suspicion of being a Nazi sympathizer. The family is sent to an internment camp in Texas, where, behind the armed guards and barbed wire, Elise feels stripped of everything beloved and familiar, including her own identity.\n" +
                "\n" +
                "The only thing that makes the camp bearable is meeting fellow internee Mariko Inoue, a Japanese-American teen from Los Angeles, whose friendship empowers Elise to believe the life she knew before the war will again be hers. Together in the desert wilderness, Elise and Mariko hold tight the dream of being young American women with a future beyond the fences.",R.drawable.thelastyearofthewar));



        rcid=findViewById(R.id.rcid);
        rcadapter adapter=new rcadapter(this,listbook);
        rcid.setAdapter(adapter);
        rcid.setLayoutManager(new GridLayoutManager(this,3));



    }
}
