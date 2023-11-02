package iterator2.socialnetworks;

import iterator2.iterators.ProfileIterator;

public interface SocialNetwork {

	ProfileIterator createFriendsIterator(String profileEmail);

	ProfileIterator createCoworkersIterator(String profileEmail);

}
