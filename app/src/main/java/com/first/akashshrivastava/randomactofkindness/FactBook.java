package com.first.akashshrivastava.randomactofkindness;

import java.util.Random;

/**
 * Created by akashshrivastava on 15-03-18.
 */
public class FactBook {

    public String[] facts = {
            "Tell that special someone, 'I love you' the first time you see them",
            "Buy a stranger a cup of coffee, Really!! ",
            "Let someone in line go past you, will earn you a smile! Promise! ",
            "Invite someone new to have lunch with you today at work or school.",
            "Give that special someone a extra long hug :) ",
            "Eat an healthy meal, you already do? Kudos!! .",
            "End the day by reminding yourself that you are awesome! Cause duh! ",
            "Bring tea/coffee to a friend you know who is having a tough time this week",
            "Say good morning to at least 5 strangers today! DO IT! We are watching! ",
            "Cook a meal for your significant other or anyone for no reason",
            "Allow yourself a 10 minute break to relax",
            "Going old school : Give a handwritten thank you note to someone you know",
            "Smile at the first 3 strangers you see, not in a creepy way though :-/",
            "Open the door for the person behind you, its common in sweden!",
            "Eat a little less bacon today, vegetarian already? Kudos!!",
            "Give a tiny bit extra money to a homeless person/a person in need",
            "Send a happy message via your phone or email",
            "See if you have extra clothes to donate, and go do it afterwards",
            "You have been doing so well, nothing for today! :) ",
            "Listen to your heart today <3",
            "Don't get on facebook today, be nice to your eyes and mind",
            "Donate blood this week! It really help! ",
            "Eco-drive today, be nice to the planet",
            "Take out the trash without being asked to, except now i.e. Take it out!",
            "Free choice! Go bonkers!",
            "Take some time remembering an old friend and then call them! :) ",
            "Replace all potty words with the word 'Muffin' today",
            "Thank someone for just being there, even if it was weeks ago",
            "Tell your parent/parents/guardian how much you mean to them",
            "Buy someone a starbucks coffee card",
            "Buy a kid you know some candy, cause who doesn't like candy! ",
            "Well, give this app a like and share :)"};

    public String getFact(){

        String junk = "";

        //Randomly have to add facts now!
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        //Take a random number from the array and then makes it THEE string to display
        junk = facts[randomNumber];

        return junk;


    }
}
