package me.sumithpuri.github.phuket.factory.method;

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
public class MobileFactoryApp {

	//code demonstrates factory method - actually, multiple levels of factories
	//mobile store factory method is the demonstration of the factory method 
	//nokia simple factory and sony simple factory are mobile story factory method implementations 
	//nokia simple factory and sony simple factory are also simple factory(ies) themselves	
	public static void main(String args[]) {
	
		demonstrate();
	}
	
	public static void demonstrate() {
		
		//mobile store factory returns the factory as per the choice
		MobileStoreFactoryMethod storeFactory01 = MobileStoreFactory.getMobileFactory("Nokia");
		Mobile mobile01 = storeFactory01.createMobile("ASeries");
		
		System.out.println(mobile01.getMobileMake() + " " + mobile01.getMobileSeries() + " is Assembled/Created.");

		//mobile store factory returns the factory as per the choice
		MobileStoreFactoryMethod storeFactory02 = MobileStoreFactory.getMobileFactory("Sony");
		Mobile mobile02 = storeFactory02.createMobile("BSeries");
		
		System.out.println(mobile02.getMobileMake() + " " + mobile02.getMobileSeries() + " is Assembled/Created.");
	}
}