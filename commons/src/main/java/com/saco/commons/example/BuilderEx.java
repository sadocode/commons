package com.saco.commons.example;

import com.saco.commons.patterns.Builder;

public class BuilderEx {
	private final int number;
	private final String name;
	private final int age;
	private final boolean military;
	
	public static class BuilderImpl implements Builder<BuilderEx>
	{
		private final int number;
		private final String name;
		
		private int age = 0;
		private boolean military = true;
		
		public BuilderImpl(int number, String name)
		{
			this.number = number;
			this.name = name;
		}
		public BuilderImpl age(int age)
		{
			this.age = age;
			return this;
		}
		public BuilderImpl military(Boolean military)
		{
			this.military = military;
			return this;
		}
		public BuilderEx build()
		{
			return new BuilderEx(this);
		}
	}
	private BuilderEx(BuilderImpl builder)
	{
		this.number = builder.number;
		this.name = builder.name;
		this.age = builder.age;
		this.military = builder.military;
	}
	
	public void test()
	{
		BuilderEx.BuilderImpl builder = new BuilderImpl(100, "sadocode");
		
		BuilderEx example = builder.age(29).military(true).build();
	}
}
