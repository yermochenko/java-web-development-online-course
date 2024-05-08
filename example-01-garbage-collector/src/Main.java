/*
 * TODO: В момент вызова метода System.gc() [см. комментарий ниже] определите,
 *       какие объекты, созданные с помощью оператора new, будут удалены.
 *       Вместо символа '?' в комментарии рядом с соответствующим оператором new
 *       вставьте один из следующих символов:
 *       '+' если объект не будет удалён, и не должен был быть удалён
 *       '!' если объект не будет удалён, хотя должен был быть удалён
 *           (удаление не происходит из-за некорректности работы со ссылками)
 *       '#' если объект не будет удалён, хотя должен был быть удалён
 *           (удаление не происходит из-за ошибки в алгоритме удаления)
 *       '-' если объект будет удалён
 */
public class Main {
	static C[] init() {
		A a1 = /* TODO: ? */ new A(1, 2.3);
		B b1 = /* TODO: ? */ new B(true, 'a');
		a1.setB(b1);

		A a2 = /* TODO: ? */ new A(4, 5.6);
		B b2 = /* TODO: ? */ new B(false, 'b');
		a2.setB(b2);
		b2.setA(a2);

		A a3 = /* TODO: ? */ new A(7, 8.9);
		B b3 = /* TODO: ? */ new B(true, 'c');
		A a4 = /* TODO: ? */ new A(123, 456.789);
		a3.setB(b3);
		b3.setA(a4);

		A a5 = /* TODO: ? */ new A(987, 654.321);
		A a6 = /* TODO: ? */ new A(111, 222.333);
		A a7 = /* TODO: ? */ new A(444, 555.666);
		A a8 = /* TODO: ? */ new A(777, 888.999);

		C[] c = /* TODO: ? */ new C[10];
		c[0] = /* TODO: ? */ new C(1.2, 0, a1);
		c[1] = /* TODO: ? */ new C(10, a2);
		c[2] = /* TODO: ? */ new C(7.8, 8, a5);
		c[3] = /* TODO: ? */ new C(7.6, a8);
		c[4] = /* TODO: ? */ new C(4.5, 6, null);
		c[5] = /* TODO: ? */ new C(a6);
		c[6] = /* TODO: ? */ new C(a7);
		c[7] = /* TODO: ? */ new C(7.2, 15, null);
		c[8] = /* TODO: ? */ new C(a3);
		return c;
	}

	public static void main(String[] args) {
		C[] c = init();
		int n = c.length - 1;
		for(int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
		/*
		 * TODO: после отметки объектов, которые будут или не будут удалены,
		 *       исправьте ошибку в ниже следующем цикле
		 */
		for(int i = 0; i < n; i++) {
			if(c[i].getAbc() == null || c[i].getMnk() == null) {
				for(int j = i; j < n - 1; j++) {
					c[j] = c[j + 1];
				}
				n--;
			}
		}
		System.out.println("***********************");
		for(int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
		// TODO: если System.gc() будет вызван здесь
	}
}
