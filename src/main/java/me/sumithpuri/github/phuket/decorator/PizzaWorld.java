package me.sumithpuri.github.phuket.decorator;

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
public class PizzaWorld {

	public static void main(String args[]) {
		
		demonstrate();
	}
	
	public static void demonstrate() {
		
		Pizza pizza = new Hawaiian("Veg Exotica");
		pizza = new Mushroom(pizza);
		pizza = new Mushroom(pizza);
		pizza = new Onion(pizza);
		
		Pizza pizza1 = new Italian("Non-Veg Supreme");
		pizza1 = new Chicken(pizza1);
		pizza1 = new Chicken(pizza1);
		pizza1 = new Onion(pizza1);
		pizza1 = new Onion(pizza1);
		
		System.out.println("Pizza World");
		System.out.println("===========");
		System.out.println(pizza.getDescription() + " " + pizza.cost());
		System.out.println(pizza1.getDescription() + " " + pizza1.cost());
	}
}
