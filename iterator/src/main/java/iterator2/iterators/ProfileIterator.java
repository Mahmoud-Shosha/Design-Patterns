package iterator2.iterators;

import iterator2.profile.Profile;

public interface ProfileIterator {

	boolean hasNext();

	Profile getNext();

	void reset();

}
