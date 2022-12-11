package com.java.design;

public enum AnimalEnum {
	Dog{
		@Override
		public String makeNoise() { return "WOOF";}		
	},
	Cat{
		@Override
		public String makeNoise() { return "MEUW";}		
	};
	
	public abstract String makeNoise();
}
