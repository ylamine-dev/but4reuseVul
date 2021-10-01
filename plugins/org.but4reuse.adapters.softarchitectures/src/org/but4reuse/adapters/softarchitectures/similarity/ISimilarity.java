package org.but4reuse.adapters.softarchitectures.similarity;

import org.but4reuse.adapters.IElement;

public interface ISimilarity {
	public double similarity(IElement currentElement, IElement anotherElement);
}
