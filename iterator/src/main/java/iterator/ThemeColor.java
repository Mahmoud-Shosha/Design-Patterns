package iterator;

// It represents a concrete collection
public enum ThemeColor {

	RED, ORANGE, BLACK, WHITE;

	public static Iterator<ThemeColor> getIterator() {
		// Return the iterator interface as the concrete iterator is private
		return new ThemeColorIterator();
	}

	// It represents a concrete iterator
	private static class ThemeColorIterator implements Iterator<ThemeColor> {

		private int position;

		@Override
		public boolean hasNext() {
			return position < ThemeColor.values().length;
		}

		@Override
		public ThemeColor next() {
			return ThemeColor.values()[position++];
		}

	}

}
