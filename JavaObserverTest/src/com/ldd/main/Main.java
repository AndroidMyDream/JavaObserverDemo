package com.ldd.main;

import com.ldd.observer.DataSetObservable;
import com.ldd.observer.ObserverImp;

public class Main {
	
	public static void main(String[] args) {
		
		DataSetObservable observable = new DataSetObservable();
		
		ObserverImp observer1 = new ObserverImp();
		
		ObserverImp observer2 = new ObserverImp();
		
		observable.registerObserver(observer1);
		
		observable.registerObserver(observer2);
		
		observable.onChanged();
		
	}

}
