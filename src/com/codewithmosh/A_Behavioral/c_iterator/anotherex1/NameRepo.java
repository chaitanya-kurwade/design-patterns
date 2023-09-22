package com.codewithmosh.A_Behavioral.c_iterator.anotherex1;

public class NameRepo implements Container {

	public String names[] = { "Robert", "John", "Julie", "Lora" };

	@Override
	public IIterator getIIterator() {
		return new NameIterator();
	}

	private class NameIterator implements IIterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
