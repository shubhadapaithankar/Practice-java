package com.company.TwitterObserverExample;

public interface ISubject {
    public void addFollowers(IFollowers followers);
    public void removeFollowers(IFollowers followers);
    public void notifyFollowers();
}
