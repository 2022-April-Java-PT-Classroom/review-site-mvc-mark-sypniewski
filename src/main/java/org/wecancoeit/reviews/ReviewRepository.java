package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review jimmyEatWorld = new Review(1994, "Jimmy Eat World", "../images/Jimmy_Eat_World.jpeg", "Full Length",
                "Jimmy Eat World Content");
        Review staticPrevails = new Review(1996, "Static Prevails", "../images/Static_Prevails.jpeg", "Full Length",
                "Static Prevails Content");
        Review clarity = new Review(1999, "Clarity", "../images/Clarity.jpeg", "Full Length",
                "Clarity Content");
        Review bleedAmerican = new Review(2001, "Bleed American", "../images/Bleed_American.jpeg", "Full Length",
                "Bleed American Content");
        Review futures = new Review(2004, "Futures", "../images/Futures.jpeg", "Full Length",
                "Futures Content");

        Review chaseThisLight = new Review(2007, "Chase This light", "../images/Chase_This_Light.jpeg", "Full Length",
                "Chase This Light Content");
        Review invented = new Review(2010, "Invented", "../images/Invented.jpeg", "Full Length",
                "Invented Content");
        Review damage = new Review(2013, "Damage", "../images/Damage.jpeg", "Full Length",
                "Damage Content");
        Review integrityBlues = new Review(2016, "Integrity Blues", "../images/Integrity_Blues.jpeg", "Full Length",
                "Integrity Blues Content");
        Review surviving = new Review(1996, "Surviving", "../images/Surviving.png", "Full Length",
                "Surviving Content");

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
