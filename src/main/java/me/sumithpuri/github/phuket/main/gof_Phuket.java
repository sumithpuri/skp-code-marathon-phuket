package me.sumithpuri.github.phuket.main;

import me.sumithpuri.github.phuket.command.AuctionStore;
import me.sumithpuri.github.phuket.decorator.PizzaWorld;
import me.sumithpuri.github.phuket.observer.StockBroker;
import me.sumithpuri.github.phuket.singleton.doublechecked.MediaContractUsingDoubleChecked;
import me.sumithpuri.github.phuket.singleton.eager.MediaContractUsingEager;
import me.sumithpuri.github.phuket.singleton.threadsafe.MediaContractUsingThreadSafe;

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

/* 
 * You may run this main class to run all the Demo Code of the  [Phuket] Project. It demonstrates five of most important
 * Gang of Four (GoF) Design Patterns using Core Java.
 */
public class gof_Phuket {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Phuket");
		System.out.println("Project Description   GoF Design Patterns Companion Code Samples (01/02)");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/kmSDiV");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("[01. Observer Design Pattern (GoF)]");
		observer();
		System.out.println("------------------------------------------------------------");
		System.out.println("[02. Decorator Design Pattern (GoF)]");
		decorator();
		System.out.println("------------------------------------------------------------");
		System.out.println("[3a. Singleton Design Pattern (GoF) - Eager Implementation]");
		eagerSingleton();
		Thread.sleep(100);
		System.out.println("------------------------------------------------------------");
		System.out.println("[3b. Singleton Design Pattern (GoF) - Thread Safe Implementation]");
		threadSafeSingleton();
		Thread.sleep(100);
		System.out.println("------------------------------------------------------------");
		System.out.println("[3c. Singleton Design Pattern (GoF) - Double Checked Locking Implementation]");
		doubleCheckedLockingSingleton();
		Thread.sleep(100);
		System.out.println("------------------------------------------------------------");
		System.out.println("[04. Command Design Pattern (GoF)]");
		command();
		System.out.println("------------------------------------------------------------");
		System.out.println("[5a. Factory Design Pattern (GoF) - Simple Factory Implementation]");
		simpleFactory();
		System.out.println("------------------------------------------------------------");
		System.out.println("[5b. Factory Design Pattern (GoF) - Factory Method Implementation]");
		factoryMethod();
		System.out.println("------------------------------------------------------------");
		System.out.println("[5c. Factory Design Pattern (GoF) - Abstract Factory Implementation]");
		abstractFactory();
		System.out.println("------------------------------------------------------------");
		System.out.println("[Note: Refer Provided Code, Run One-By-One to Understand Thoroughly!]");
		System.out.println();
	}
	
	
	private static void observer() {
		
		StockBroker stockBroker = new StockBroker();
		stockBroker.demonstrate();
	}

	private static void decorator() {
		
		PizzaWorld pizzaWorld = new PizzaWorld();
		pizzaWorld.demonstrate();
	}
	
	private static void command() {
		
		AuctionStore auctionStore = new AuctionStore();
		auctionStore.demonstrate();
	}
	
	private static void eagerSingleton() {
		
		MediaContractUsingEager mediaContract = new MediaContractUsingEager();
		mediaContract.demonstrate();
	}

	private static void threadSafeSingleton() {
		
		MediaContractUsingThreadSafe mediaContract = new MediaContractUsingThreadSafe();
		mediaContract.demonstrate();
	}

	private static void doubleCheckedLockingSingleton() {
		
		MediaContractUsingDoubleChecked mediaContract = new MediaContractUsingDoubleChecked();
		mediaContract.demonstrate();
	}

	private static void simpleFactory() {
		
		StockBroker stockBroker = new StockBroker();
		stockBroker.demonstrate();
	}

	private static void factoryMethod() {
		
		StockBroker stockBroker = new StockBroker();
		stockBroker.demonstrate();
	}

	private static void abstractFactory() {
		
		StockBroker stockBroker = new StockBroker();
		stockBroker.demonstrate();
	}
}
