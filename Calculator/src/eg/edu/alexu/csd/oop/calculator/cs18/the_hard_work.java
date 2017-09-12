package eg.edu.alexu.csd.oop.calculator.cs18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import eg.edu.alexu.csd.oop.calculator.Calculator;

public class the_hard_work implements Calculator {
	// @Override
	public String word;
	// ArrayList <String>his=new ArrayList();
	LinkedList<String> expression = new LinkedList();
	int k = 0, y = 0;
	String now;

	/*
	 * public static void main(String[] args) throws ScriptException {
	 * 
	 * 
	 * 
	 * ScriptEngineManager s = new ScriptEngineManager(); ScriptEngine engine =
	 * s .getEngineByName("JavaScript"); String the_expression="5+4"; Object
	 * m=engine.eval(the_expression); System.out.println(m);
	 * 
	 * }
	 */
	public void input(String w) {
		// TODO Auto-generated method stub

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String u = null;
		try {
			u = (engine.eval(w)).toString();
			word = w;
			if (expression.size() == 5 ) {
				expression.remove(0);
				expression.add(word);
			} else {

				expression.add(word);
			}
			y = expression.size() - 1;

		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String m = null;
		double hh;
		try {

			m = String.valueOf(engine.eval(expression.get(y)));
			hh = Double.parseDouble(m);
			m = Double.toString(hh);
		} catch (Exception e) {
			throw new RuntimeException();
		}

		return m;
	}

	@Override
	public String current() {
		if(expression.size() == 0){
			return null;
		}
		
		now = expression.get(y);
		return now;
	}

	public String prev() {
		if (y >= expression.size()&&expression.size() != 0) {
			y = expression.size() - 1;
			String z = expression.get( y - 1 );
			y = y - 1;
			return z;
		} else if ( y > 0 ) {
			String z = expression.get( y - 1 );
			y = y - 1;
			return z;
		}
		return null;
	}

	@Override
	public String next() {
		if (y < 0) {
			y = 0;
			String z = expression.get( y + 1 );
			y = y + 1;
			return z;
		} else if ( y + 1 < expression.size()) {

			String z = expression.get( y + 1 );
			y = y + 1;
			return z;
		}
		return null;
	}

	public void save() {
		k = y;
		FileOutputStream fout;
		try {

			fout = new FileOutputStream("calc.txt");
			ObjectOutputStream him = new ObjectOutputStream(fout);
			him.writeObject(expression);

			// System.out.println("Done");

		} catch (Exception ex) {
			throw new RuntimeException();
		}
	}

	public void load() {
		FileInputStream fin;
		try {

			fin = new FileInputStream("calc.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);
			expression = (LinkedList<String>) ois.readObject();
			y = k;
		} catch (Exception e) {
			throw new RuntimeException();

		}
	}

}
