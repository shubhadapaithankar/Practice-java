package com.company.TwitterObserverExample;

public class Client {
    public static void main(String args[]){
        IFollowers follower1 = new Khushu();
        IFollowers follower2 = new Vinit();
        IFollowers follower3 = new Om();


        ISubject shubhadaTwitterAccount = new ShubhdaTwitter();

        shubhadaTwitterAccount.addFollowers(follower1);
        shubhadaTwitterAccount.addFollowers(follower2);
        shubhadaTwitterAccount.addFollowers(follower3);

        shubhadaTwitterAccount.notifyFollowers();


        shubhadaTwitterAccount.removeFollowers(follower3);
        shubhadaTwitterAccount.notifyFollowers();
    }
}
