package com.company.TwitterObserverExample;

import java.util.ArrayList;
import java.util.List;

public class ShubhdaTwitter implements ISubject {
    private List<IFollowers> followersList;

    public ShubhdaTwitter(){
        followersList = new ArrayList<>();
    }

    @Override
    public void addFollowers(IFollowers followers) {
        followersList.add(followers);

    }

    @Override
    public void removeFollowers(IFollowers followers) {
           followersList.remove(followers);
    }

    @Override
    public void notifyFollowers() {
        for (IFollowers followers: followersList){
            followers.update();
        }

    }
}
