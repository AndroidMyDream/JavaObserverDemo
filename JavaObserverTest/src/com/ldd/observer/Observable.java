package com.ldd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
	
	private final List<T> mObservers = new ArrayList<T>();
	
	public void registerObserver(T observer){
		
		mObservers.add(observer);
	}
	
	public void unregisterObserver(T observer) {
		
		mObservers.remove(observer);
	}
	
	protected abstract void onNotifyChanged(T observer);
	
	public void onChanged() {
		
		for (T observerItem : mObservers) {
			
			onNotifyChanged(observerItem);
		}
	}

}
