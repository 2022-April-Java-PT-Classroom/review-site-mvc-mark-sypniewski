package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review jimmyEatWorld = new Review(1994, "Jimmy Eat World", "../images/Jimmy_Eat_World.jpeg",
                "Full Length", "In 2012, The A.V. Club's Jason Heller noted, \"It's long been out of " +
                "print, and there’s a good reason for it." +
                " It’s not terrible, but it doesn't represent what the band would become.\"");
        Review staticPrevails = new Review(1996, "Static Prevails", "../images/Static_Prevails.jpeg",
                "Full Length", " AllMusic reviewer Mike DaRonco stated that \"what Static Prevails " +
                "essentially lacks is the songwriting maturity that Jimmy Eat World could have perfected; but it's almost" +
                " as if the studio heads at Capitol wouldn't let them so that there would be more room for radio-friendly" +
                " pop songs. In the end, nobody won.\"");
        Review clarity = new Review(1999, "Clarity", "../images/Clarity.jpeg", "Full Length",
                "Despite being largely overlooked upon its release, Clarity's critical stature has grown since 1999;" +
                        " it is now viewed as \"the Led Zeppelin IV of emo rock\".");
        Review bleedAmerican = new Review(2001, "Bleed American", "../images/Bleed_American.jpeg",
                "Full Length", "Thomas Nassiff of AbsolutePunk stated that \"praising this album is something" +
                " that can't be done enough\" and opined that the album contained \"no bad songs\", concluding: \"Certainly" +
                " one of the most memorable records of 2001, Bleed American might actually have the most lasting power of" +
                " any album from that class.\"");
        Review futures = new Review(2004, "Futures", "../images/Futures.jpeg", "Full Length",
                "Sputnikmusic staff member Adam Knott wrote that each second of the album \"is direct in its accessible," +
                        " spirited approach and brilliantly executed.\" Its \"[g]ut-wrenching guitar lines, rhythmic releases" +
                        " and poignant songwriting are not even consistent; they're constant.\"");
        Review chaseThisLight = new Review(2007, "Chase This light", "../images/Chase_This_Light.jpeg",
                "Full Length", "Andy Greenwald from Entertainment Weekly gave praise to the band for combining" +
                " the \"extroverted guitar pop\" of Bleed American and the pensive bulk of Futures to encapsulate what their" +
                " given genre is: \"big emotions, sure, but also big hooks, big stakes. And big rewards.\" He concluded by" +
                " calling Chase This Light \"a master class in hard rocking for the soft-hearted.\"");
        Review invented = new Review(2010, "Invented", "../images/Invented.jpeg", "Full Length",
                "BBC Music journalist Mike Haydock praised the album, writing, \"Jimmy Eat World have always been" +
                        " sentimental: they tug on the heart strings with yearning melodies that pound you into snivelling" +
                        " submission. But, crucially, they also know how to rock out.");
        Review damage = new Review(2013, "Damage", "../images/Damage.jpeg", "Full Length",
                "Rock Sound named Damage \"Album of the Month\", writing: \"Jimmy Eat World are undoubtedly an enigma." +
                        " Now eight albums deep into their career, they never really slumped into any sort of mid-season" +
                        " funk that other bands of their age and ilk have. [...] With no reason to buck the trend, Damage" +
                        " very much continues the Arizonan four-piece's reliability streak.");
        Review integrityBlues = new Review(2016, "Integrity Blues", "../images/Integrity_Blues.jpeg",
                "Full Length", " Drowned in Sound's Aidan Reynolds found it \"a wonderful thing to hear " +
                "Jimmy Eat World rediscover the form that stretched from Clarity through Futures ... their dedication to " +
                "honest, wide-eyed songcraft has resulted in their best album in over a decade.\"");
        Review surviving = new Review(1996, "Surviving", "../images/Surviving.png", "Full Length",
                " Sputnikmusic staff member SowingSeason proposed that a \"better title might have been Thriving, " +
                        "because this record continues their remarkably consistent run and proves that they are still very" +
                        " much at, or at least near, the top of their game.\"");

        reviewsList.put(jimmyEatWorld.getId(), jimmyEatWorld);
        reviewsList.put(staticPrevails.getId(), staticPrevails);
        reviewsList.put(clarity.getId(), clarity);
        reviewsList.put(bleedAmerican.getId(), bleedAmerican);
        reviewsList.put(futures.getId(), futures);
        reviewsList.put(chaseThisLight.getId(), chaseThisLight);
        reviewsList.put(invented.getId(), invented);
        reviewsList.put(damage.getId(), damage);
        reviewsList.put(integrityBlues.getId(), integrityBlues);
        reviewsList.put(surviving.getId(), surviving);
    }

    //For Testing Only
    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }


    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
