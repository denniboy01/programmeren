package com.denniboy01.EnergyTech.util;


public interface IReadOnlyCollection<T> extends Iterable<T>
{

	
	int size();

	
	boolean isEmpty();

	
	boolean contains( Object node );
}
