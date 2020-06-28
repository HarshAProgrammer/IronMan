package com.android.stark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;

import com.baoyachi.stepview.VerticalStepView;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {

    private VerticalStepView verticalTimeline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        setupUIViewsTimeline();
        addSources();
    }

    private void setupUIViewsTimeline() {
        verticalTimeline = (VerticalStepView) findViewById(R.id.verticalStepView);
    }

    private void addSources() {
        List<String> sources = new ArrayList<>();
        sources.add("Tony Stark, billionaire jerk\n" +
                "\n" +
                "\n" +
                "Tony Stark comes out of the womb a genius. At age 4, he builds a circuit board. At age 6, he builds a V8 engine. By 17 years old, he graduates summa cum laude at MIT, and seems poised to take over Stark Industries whenever Howard feels ready to pass the buck. Unfortunately, after Howard's assassination, his partner Obadiah Stane takes over Stark Industries until Tony turns 21 and takes back his company. From there, it's a wild ride of building new technology and weapons for the American military for the next decade, while pissing off just about everyone in the scientific community. In 1999, Tony meets Ho Yinsen, Aldrich Killian, and Maya Hansen, and doesn't make a good impression on any of them. When viewers officially meet Tony Stark in 2008's Iron Man, he's at a weapons exhibition in Afghanistan to showcase \"The Jericho,\" a missile system that uses repulsor technology to increase effectiveness. On the way back from a successful presentation, Tony is kidnapped by a terrorist organization known as the Ten Rings that want him to build them their own Jericho missile.\n"
        );
        sources.add("Tony Stark, Iron Man\n" +
                "\n" +
                "\n" +
                "When Tony returns home, he realizes the error of his weapon-dealing ways and tells Obadiah that Stark Industries won't be making any more weapons technology. Obadiah's against the decision, and so is Colonel James \"Rhodey\" Rhodes, Tony's best friend and a true-blue military man. Unfortunately, Tony's new conscience comes with a cost; the board of Stark Industries ousts Tony on the basis that his new sense of empathy is just PTSD from his kidnapping. As it turns out, Obadiah's been playing both sides, both in terms of the Stark Industries board and the global weapons market. While pretending to serve as a father figure to Tony, he led the board's betrayal, and he's been selling Stark Industries tech to terrorist groups the whole time. Without actual control over Stark Industries and knowing that plenty of his tech is already out in the world, Tony upgrades his Iron Man suit to be sleeker and more colourful, and embarks on a quest to take down any terrorist groups using his weapons.\n"
        );
        sources.add("Iron Man 2: still a billionaire, only sometimes a jerk\n" +
                "\n" +
                "\n" +
                "While Tony's onstage admitting that he is Iron Man, half a world away, Anton Vanko passes away after telling his son Ivan that Tony's life should have been his. Ivan uses an old blueprint of the arc reactor designed by his father and Howard Stark to build a replica of the super-battery. Six months later, Tony's turned his newfound superhero celebrity into an excuse to bring back the Stark Expo, as well as take credit for basically every good thing that's happened in America since Iron Man appeared. Not everybody's happy with a private citizen walking around like a human missile, though, and Tony's subpoenaed to appear in front of Congress to defend his right to bear the world's biggest armoury.\n"
        );
        sources.add("Iron Man 2: From palladium to a new element\n" +
                "\n" +
                "\n" +
                "Suffering from palladium poisoning and flush from his victory over Whiplash, Tony goes off the deep end during his birthday party.Tony come-to-Jesus talk telling him he needs to grow up and figure out how to fix his palladium poisoning. Tony figures out that his father designed a replacement for palladium in the '70s, but lacking the technology to build the new element, he buried the design in the schematics for the Stark Expo.\n" +
                "\n" +
                "Tony discovers it, builds the new element, and upgrades his suit just in time to interrupt Ivan's master plan: he's built a fleet of Iron Man drones for Hammer Industries that only he controls, as well as remote control over Rhodey's War Machine Armor.Tony frees Rhodey from Ivan's control, and the two of them defeat Whiplash together.\n");
        sources.add("Iron Man, the Iron Avenger\n" +
                "\n" +
                "\n" +
                "Loki's henchmen ambush the Helicarrier, freeing the trickster god and sending the Avengers team into disarray. The team comes back together just in time for a massive battle in New York, centred around Stark Tower where Loki's attempting to open a rift to bring in an invading force of alien Chitauri warriors. The Avengers stem the tide, the World Security Council launches a nuclear missile, and Iron Man drags the missile through the wormhole into the Chitauri fleet, seemingly sacrificing his life to destroy the invaders. \n" +
                "\n" +
                "Luckily, he's totally fine.\n");
        sources.add("Iron Man 3: The Anxious Avenger\n" +
                "\n" +
                "\n" +
                "Tony flees to Tennessee, where he meets Harley Keener, a young boy with a gift for engineering. Together with Harley, Tony fixes up his suit and learns where the Mandarin is hiding. Unfortunately, there's a bigger game at work: The Mandarin is just an actor playing a part designed by Aldrich Killian and Maya Hansen to give a narrative for their failed Extremis tests. After unravelling a conspiracy involving the vice president and Killian's plot to kill the president, Tony, Rhodey, and Pepper can defeat Killian and save the day. Tony undergoes heart surgery so he no longer needs the arc reactor to live, and seemingly retires from the hero business.\n");
        sources.add("Making a mess of things in Avengers: Age of Ultron\n" +
                "\n" +
                "\n" +
                "Tony wants to build a \"suit of armour around the world,\" which is an artificial intelligence that can protect Earth from anything. Tony and Bruce crack the code on making it, and together, they create the AI dubbed Ultron. Determining that human beings are the problem with the Earth, Ultron tries to destroy the world with the help of the Strucker children, Wanda and Pietro. The Avengers show up to stop him, of course, but Wanda unleashes another one of her telepathic attacks against nearly the entire team, which leads to the Hulk going on a rampage that only Tony and his Hulkbuster armour can stop. After that, it all comes to a head in the fictional country of Sokovia, as Tony builds Vision, yet another artificial intelligence, using the Mind Stone and his J.A.R.V.I.S. program as a personality matrix. Together, the Avengers and Vision save the day, Ultron is blown up, and Tony quits the team at the end of the film.\n");
        sources.add("Coming to blows with Captain America in Captain America: Civil War\n" +
                "\n" +
                "\n" +
                "While the Avengers are doing their business, Tony's trying to cultivate a new breed of entrepreneurs by paying off the tuition costs of every single MIT student in 2016's Captain America: Civil War. His generosity comes under a dark cloud, though, when he runs into Miriam, the mother of a man who died in Sokovia during the Ultron event. She reads Tony the riot act about his lack of responsibility, and when General Ross later shows up to suggest that the Avengers come under the official purview of the United Nations, Tony supports it. Steve Rogers, however, is very much against the Sokovia Accords, and the two men struggle to reconcile their differences.\n" +
                "\n" +
                "Bucky, the Winter Soldier, is freed from custody by Helmut Zemo as part of an extremely complicated plan to avenge the death of Zemo's own family in Sokovia. Steve gathers a team to help Bucky evade capture, while Tony gets his team together, consisting of Black Widow, War Machine, Vision, Black Panther, and Spider-Man. A scuffle with Steve's team at the airport turns serious when War Machine is crippled by an errant blast from the Vision, which sends Tony into serious mode. He arrests Steve's team — minus Bucky and Cap, who've escaped — sends his team home, and pursues Cap and Bucky to Siberia alone. Zemo's plan comes to a head when Tony discovers that his parents died at Bucky's hand rather than in an automobile accident. After a brutal battle, Cap and Bucky escape, minus Cap's shield, but Cap gives Tony a cell phone with his number on it if a time comes that they ever need to reunite against a greater threat.\n");
        sources.add("Moving boxes in Spider-Man: Homecoming\n" +
                "\n" +
                "\n" +
                "Two months after the events of Captain America: Civil War, Tony's biggest headache is fending off Peter Parker's desire for his mentorship. Peter's increasingly desperate to get Tony's attention once the younger hero discovers that the Vulture, a weapons-dealing supervillain, has been selling high-tech weaponry he scavenged from the wreckage of the Chitauri invasion. Iron Man bails Spider-Man out twice, first with the help of a remote-controlled drone, and the second time in person, trying to convince Peter to slow down and be a local hero before looking to join the Avengers. After the second time, when Iron Man's intervention is the only thing that keeps the Staten Island ferry from sinking, Tony confiscates the high-tech suit he'd given Peter.\n" +
                "\n" +
                "Even without the suit, Peter can't help but be a hero, and he ultimately stops the Vulture from stealing a shipment of Stark tech. As a reward, Tony gives Peter the offer he's been begging for: a chance to join the Avengers and get a brand-new Iron suit. Peter surprisingly turns him down, and Tony, looking for a way to distract the reporters from an announcement that's suddenly no longer happening, proposes to Pepper Potts.\n");
        sources.add("Going to Infinity War and beyond\n" +
                "\n" +
                "\n" +
                "Doctor Strange requests Tony's help in repelling the invasion of Thanos' Black Order, who have come to Earth in search of the Infinity Stones that Thanos needs to wipe out half of the universe. Strange and his Time Stone are kidnapped by Thanos' henchman Ebony Maw; Tony Stark and Spider-Man, newly decked out in his Iron Spider outfit, hitch a ride on Maw's spaceship.\n" +
                "\n" +
                "After freeing Strange and blasting Maw into space, Tony, Peter, and Doctor Strange head to the planet Titan to prep for Thanos' pursuit. There, they run into Guardians of the Galaxy members Peter Quill, Drax, Mantis, and Nebula. A plan is hatched... and then Thanos arrives to turn that careful plan into ashes. With the rest of his allies down, Tony uses the full force of his nano-technology-powered suit to draw a single drop of blood from Thanos before the Mad Titan stabs him through the abdomen with Tony's sword. Doctor Strange gives up the Time Stone to save Tony's life, leaving Thanos to quickly complete his Infinity Gauntlet and snap half the universe into non-existence. Tony survives.\n");
        sources.add("The death of Tony Stark\n" +
                "\n" +
                "\n" +
                "Tony builds a working time machine model, re-joins the Avengers, returns Cap's shield, and organizes a strike team of the surviving Avengers to go back in time to retrieve the Infinity Stones and build a new gauntlet before Thanos destroys them in the present. The mission goes smoothly, and Tony even gets a chance to have a heart-to-heart with his dad in the past. From there, all it takes is one snap of Hulk's mighty fingers to bring everyone back. However, a past version of Thanos battles his way to the future, and only Tony Stark, by sacrificing his life to use a new Infinity Gauntlet, can finally get rid of him.\n");


        verticalTimeline.setStepsViewIndicatorComplectingPosition(sources.size())
                .reverseDraw(false)
                .setStepViewTexts(sources)
                .setLinePaddingProportion(7.00f)
                .setTextSize(12)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(TimelineActivity.this, android.R.color.white))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(TimelineActivity.this, R.color.uncompleted_text_color))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(TimelineActivity.this, android.R.color.white))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(TimelineActivity.this, R.color.uncompleted_text_color))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(TimelineActivity.this, R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(TimelineActivity.this, R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(TimelineActivity.this, R.drawable.attention));//设置StepsViewIndicator AttentionIcon

    }


}