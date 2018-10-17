package me.sumithpuri.github.phuket.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2008/11/design-patterns-series-i.html	
 * Blog Short URL		https://goo.gl/kmSDiV
 * Package Prefix 		me.sumithpuri.github.phuket
 * Project Codename		phuket
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class StockData implements Subject {

	private String stockSymbol = null;
	private Float stockValue = null;
	private Integer stockUnits = null;
	private List<Observer> observers = null;

	public StockData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(stockSymbol, stockValue, stockUnits);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void setStockData(String stockSymbol, Float stockValue, Integer stockUnits) {
		// In real-time, this method might be invoked with values from a live web
		// service at regular intervals.
		this.stockSymbol = stockSymbol;
		this.stockValue = stockValue;
		this.stockUnits = stockUnits;
		setDataChanged();
	}

	private void setDataChanged() {
		notifyObservers();
	}
}
