package com.example.theavengerscharactersapp;

import java.util.ArrayList;

public class CharactersData {
    private static String[] charactersName = {
            "Iron Man",
            "Captain America",
            "Thor",
            "Black Widow",
            "Hulk",
            "Black Panther",
            "Shuri",
            "Okoye",
            "Ant Man",
            "Wasp",
            "Doctor Strange",
            "Winter Soldier",
            "Hawkeye",
            "Falcon",
            "Maria Hill",
            "Vision",
            "Hulkbuster",
            "War Machine",
            "Nick Fury",
            "Ultron",
            "Red Skull",
            "Loki",
    };
    private static String[] charactersAbout = {
            "When billionaire industrialist Tony Stark dons his sophisticated steel-mesh armor, he becomes a living high-tech weapon - the world's greatest fighting machine. Tony has primed his ultra modern creation for waging state of the art campaigns, attaining sonic flight, and defending the greater good! He is the Armored Avenger - driven by a heart that is part machine, but all hero! He is the INVINCIBLE IRON MAN!",
            "During WWII, the patriotic Steve Rogers was offered a place in the military's top operation: Rebirth. Injected with an experimental super-serum, Rogers emerged from the treatment with heightened endurance, strength, and reaction time. With extensive training and an indestructible Vibranium shield, Rogers soon became the country's ultimate weapon: CAPTAIN AMERICA! Though frozen in ice during a climactic battle toward the end of the war, Rogers was discovered and revived decades later. Now the living legend continues the war against evil in modern times as a member of The Avengers!",
            "Nordic legend tells the tale of the son of Odin, the heir to the throne of Asgard - he is THOR, renowned as the mightiest hero of mythology! Thor's strength, endurance, and quest for battle are far greater than his Asgardian brethren. The mighty Thor wields an enchanted Uru hammer, Mjolnir, and is master of thunder and lightning.",
            "Natasha Romanoff is the super-spy known as the Black Widow! Trained extensively in the art of espionage and outfitted with state-of-the-art equipment, Black Widow's combat skills are virtually unmatched. One of S.H.I.E.L.D's most valuable agents, she has carried out numerous black-ops missions and has recently been assigned by Director Nick Fury to keep an eye on the Avengers.",
            "A massive dose of gamma radiation transformed the brilliant but meek scientist Bruce Banner's DNA, awakening the hidden, adrenaline-fed hero in his genes... HULK! A hero of few words and incredible strength, the Hulk has long been pursued by those who want to use his immense power for their own purposes, or by those who thought the Jade Giant's anger was too dangerous to be controlled. Now, as a member of the Avengers, Hulk helps smash the unimaginable threats that no Hero could face alone, hoping to at least prove to the world that he is the strongest HERO there is!",
            "Monarch of the secluded but technologically advanced African nation of Wakanda, King TChalla is the Black Panther; a sacred title that must be both inherited & earned by the current Wakandan ruler. Granted superhuman powers by ceremonially consuming a mystical heart-shaped herb, the Black Panther is responsible for defending his people, and the world, from any threats.",
            "Princess of Wakanda and younger sister to King T'Challa, Shuri grew up in the shadow of her prodigious older brother. Eager to prove her worth, she underwent a grueling set of trials in order to become the Black Panther, only to discover that T'Challa had already won the title. However, understanding his sister's heart and skill, T'Challa passed on the rule of Wakanda when circumstances demanded his absence. As the new Black Panther, Shuri now protects her people and homeland with unrivaled commitment and ferocity.",
            "Princess of Wakanda and younger sister to King T'Challa, Shuri grew up in the shadow of her prodigious older brother. Eager to prove her worth, she underwent a grueling set of trials in order to become the Black Panther, only to discover that T'Challa had already won the title. However, understanding his sister's heart and skill, T'Challa passed on the rule of Wakanda when circumstances demanded his absence. As the new Black Panther, Shuri now protects her people and homeland with unrivaled commitment and ferocity.",
            "Former thief Scott Lang once stole an advanced size-altering suit in order to aid his ailing daughter, only to discover that the stolen tech belonged to the world-renowned Dr. Hank Pym. Seeing the heroic potential within him, Dr. Pym allowed Scott to continue using the suit, as well as the identity Pym once battled evil under. As the Astonishing Ant-Man, Scott now handles the jobs \"too small\" for any other Super Hero.",
            "Endowed with the amazing ability to shrink in size and fly, Hope Van Dyne is the newest heroine to bear the name Wasp! Along with her partner Scott Lang, the Astonishing Ant-Man, Wasp battles evil on any scale, proving that true heroism comes in even the smallest sizes!",
            "Distinguished neurosurgeon Doctor Stephen Strange's self-important worldview was shattered, along with his steady operating hands, in a fateful car accident. Desperate to heal his injuries and pride, Strange sought out a legendary safe known as the Ancient One, becoming a pupil of the mystic arts. Learning that his true worth had always come from within, Strange uncovered his full potential and was chosen to become the Sorcerer Supreme, the world's pre-eminent defender against the darkness that lurks beyond.",
            "Bucky Barnes served with honor in WWII alongside his partner and best friend, Captain America. Presumed M.I.A. after a fateful mission toward the end of the war, Bucky had in fact been recovered by enemy agents who subjected him to a series of traumatic metal and physical experiments. Stripped of his identity, Bucky was reborn as the Winter Soldier, a cunning and dangerous covert operative who could be 'activated' from cryostasis every decade or so to undertake special missions. Ultimately free of his brainwashing, Bucky now uses his impressive talents to try and atone for the deeds done while under enemy control.",
            "An archer with perfect accuracy and a quiver of trick arrows, Clint Barton's wit is usually faster than his lightning-quick reflexes! Though this expert archer doesn't always follow the rules, he long ago proved himself an invaluable member of The Avengers as Hawkeye! Skilled with a bow and arrow, Clint Barton was given a chance to become a hero with the Avengers. Marvel 101's are a series of one minute episodes that give you a crash course on the background of a Marvel Character, storyline, weapon, location and more. Welcome to the Marvel Universe!",
            "The top of his class at S.H.I.E.L.D., Sam Wilson's savvy with experimental technology quickly impressed even Tony Stark. Working as Stark's protégé, the eager agent designed a sleek suit of flying armor, complete hard-light holographic wings, and an extensive arsenal that includes explosive \"flechettes\" and retractable talons. When the call came for Sam to graduate to the Avengers, he didn't hesitate — he quickly took to the skies in a streak of red as Falcon!",
            "A cunning, sharp-witted S.H.I.E.L.D. Agent, Maria Hill’s natural talents and perfected skills allowed her to quickly climb the ladder at S.H.I.E.L.D. As deputy director, Hill keeps the gears of the massive organization in constant motion, reporting directly to Nick Fury. Hill focuses herself solely on the task of protecting the world and is fully committed to S.H.I.E.L.D.’s cause.",
            "Driven by an extremely lifelike artificial intelligence and possessing a nearly indestructible robotic body, the synthetic android called the Vision has taken his place among Earth’s Mightiest Heroes, the Avengers! In addition to his surprisingly human personality, the Vision exhibits an impressive compliment of abilities, including flight, complete control over his molecular density and the ability to fire energy blasts from the jewel on his forehead.",
            "Fearing the day when the Hulk's rage might become too much to control, Tony Stark developed this mighty armor as a countermeasure to Hulk's brute strength. Assembled upon command from a series of modular components, the Hulkbuster armor encompasses Iron Man's normal suit, encasing him in an extremely durable shell. The armor's design is reinforces with powerful servos and dense plating, allowing it to withstand even the Hulk's strongest outburst.",
            "U.S. Air Force Colonel James \"Rhodey\" Rhodes has long served as both Tony Stark's best friend & Special Liaison to Stark Industries. In battle, Rhodey dons the War Machine armor, a modified version of Stark's own Iron Man suit. Armed with a modular Gatling cannon and enough firepower to take on a legion of enemies, the War Machine is a true one man army.",
            "Nick Fury became an elite member of the U.S. intelligence team because of intellect and integrity. He has been trained as a paratrooper, Ranger, demolitions expert and vehicle specialist. Nick Fury keeps his youth by the mysterious Infinity Formula. When the world is in trouble, NICK FURY: AGENT OF S.H.I.E.L.D. is the man who will defend it.",
            "The robotic creation known as Ultron was initially activated with the best of intentions, but its artificial intelligence evolved too quickly. The evil robot soon figured out that all of humanity and the Avengers in particular would stand in the way of its rise into robotic perfection. Because of this Ultron upgrades its highly advanced form constantly, adapting its near-limitless abilities to match its twisted desire for ever more power and total domination.",
            "An imperfect version of the Super-Soldier Serum gave HYDRA mastermind Johann Schmidt enhanced strength but left his face horribly disfigured. He became known as the Red Skull and would have conquered the world if Captain America had not stopped him during World War II. After the war, he went into hiding and emerged recently in an attempt to regain his youth. The attempt failed, but the Skull now possesses a stolen suit of Iron Man's armor. This newly invigorated \"Iron Skull\" has vowed to destroy the Avengers and conquer the world!",
            "Loki is an evil Asgardian being and wielder of mischief bent on conquering Asgard, enslaving the Earth, and destroying his stepbrother - The Mighty Thor. Loki is a master manipulator and enjoys tricking others into fighting his battles for him. While he may usually prefer to act behind the scenes, he should never be underestimated in one-on-one combat. His knowledge of evil allows him to perform illusions, shape-shift, and hypnotically influence those around him. These abilities, combined with his Asgardian warrior training, make Loki a dangerous foe.",
    };
    private static int[] charactersImage = {
            R.drawable.iron_man,
            R.drawable.captain_america,
            R.drawable.thor,
            R.drawable.black_widow,
            R.drawable.hulk,
            R.drawable.black_panther,
            R.drawable.shuri,
            R.drawable.okoye,
            R.drawable.ant_man,
            R.drawable.wasp,
            R.drawable.doctor_strange,
            R.drawable.winter_soldier,
            R.drawable.hawkeye,
            R.drawable.falcon,
            R.drawable.maria_hill,
            R.drawable.vision,
            R.drawable.hulkbuster,
            R.drawable.war_machine,
            R.drawable.nick_fury,
            R.drawable.ultron,
            R.drawable.red_skull,
            R.drawable.loki,
    };

    static ArrayList<Characters> getListData() {
        ArrayList<Characters> list = new ArrayList<>();
        for (int position = 0; position < charactersName.length; position++) {
            Characters hero = new Characters();
            hero.setName(charactersName[position]);
            hero.setDetail(charactersAbout[position]);
            hero.setPhoto(charactersImage[position]);
            list.add(hero);
        }
        return list;
    }
}