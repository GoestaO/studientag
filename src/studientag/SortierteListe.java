/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studientag;

/**
 * 
 * @author goesta
 */
public class SortierteListe {

	private Elem kopf;

	public SortierteListe() {
		this.kopf = null;
	}

	public int loescheMin() {
		if (this.kopf == null) {
			return 0;
		}
		Elem temp = this.kopf;
		this.kopf = temp.getNaechstes();
		return temp.getWert();
	}

	public void add(int w) {
		Elem newElement = new Elem(w);
		if (this.kopf == null) {
			this.setKopf(newElement);
		}

		if (newElement.getWert() < this.getKopf().getWert()) {
			Elem temp = this.kopf;
			this.setKopf(newElement);
			newElement.setNaechstes(temp);
		}
		// } else {
		// Elem current = this.kopf;
		// this.setKopf(newElement);
		// newElement.setNaechstes(current);
		// }

		Elem current = this.kopf;
		Elem previous = this.kopf;
		// System.out.println("--------------------");
		while (current != null && newElement.getWert() > current.getWert()) {

			previous = current;
			current = current.getNaechstes();
		}
		newElement.setNaechstes(current);
		previous.setNaechstes(newElement);
		// System.out.println("---------------");
		// System.out.println(previous.getWert());
		// System.out.println(newElement.getNaechstes().getWert());

	}

	public int size() {
		int count = 0;
		Elem current = this.kopf;
		System.out.println(current.getWert());
		System.out.println(current.getNaechstes().getWert());
		while (current != null) {
			count++;
//			System.out.println("current = " + current.getWert());
			current = current.getNaechstes();

		}
		return count;
	}

	public Elem getKopf() {
		return kopf;
	}

	public void setKopf(Elem kopf) {
		this.kopf = kopf;
	}

}
