package com.ldd.observer;

public class DataSetObservable extends Observable<Observer>{

	@Override
	protected void onNotifyChanged(Observer observer) {
		
		observer.onChange();
	}

}
