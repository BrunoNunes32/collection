import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {

    // AULA 01/06 (ITERATOR E COMPARATOR)
    // ArrayList<Integer> numeros = new ArrayList<Integer>();
    // numeros.add(1);
    // numeros.add(3);
    // numeros.add(2);

    // System.out.println("Arraylist: " + numeros);

    // //CRIANDO UMA INSTANCIA DE ITERATOR
    // Iterator<Integer> it = numeros.iterator();

    // int numero = it.next();
    // System.out.println("Primeiro elemento: " + numero);

    // while(it.hasNext()){
    // it.forEachRemaining((value) -> System.out.print(value +","));
    // }

    // AULA 02/06 (LINKEDLIST)
    // LinkedList<String> animais = new LinkedList<String>();
    // animais.add("Cachorro");
    // animais.add("Gato");
    // animais.add("Papagaio");

    // System.out.println("Linkedlist: " + animais);

    // animais.add(1,"Galo");
    // System.out.println("Linkedlist: " + animais);

    // AULA 03/06 (HASHSET)
    // HashSet<Integer> numeros = new HashSet<Integer>();
    // numeros.add(8);
    // numeros.add(5);
    // numeros.add(13);
    // numeros.add(1);

    // Iterator<Integer> it = numeros.iterator();

    // while(it.hasNext()){
    // System.out.println(it.next());
    // }

    // AULA 04/06 (TREESET)
    // TreeSet<Integer> numeros = new TreeSet<Integer>();
    // numeros.add(4);
    // numeros.add(6);
    // numeros.add(1);
    // numeros.add(2);

    // System.out.println("TreeSet: " + numeros);

    // boolean result = numeros.remove(6);
    // System.out.println("Removeu? " + result);
    // System.out.println("TreeSet: " + numeros);

    // result = numeros.remove(61);
    // System.out.println("Removeu? " + result);
    // System.out.println("TreeSet: " + numeros);

    // result = numeros.removeAll(numeros);
    // System.out.println("Removeu? " + result);
    // System.out.println("TreeSet: " + numeros);

    // AULA 05/06 (PROJETO COM LISTAS)
    // ArrayList<String> linguagens = new ArrayList<String>();

    // linguagens.add("Java");
    // linguagens.add("Csharp");
    // linguagens.add("Python");
    // linguagens.add("JavaScript");

    // System.out.println("ArrayList: " + linguagens);

    // String[] arr = new String[linguagens.size()];

    // linguagens.toArray(arr);

    // System.out.println("Array: ");

    // for( String item:arr){
    // System.out.print(item + ", ");
    // }

    // AULA 06/06 (SAIBA MAIS)

    // ArrayList<Integer> lista = new ArrayList<>();
    // for(int i=0; i<8; i++){
    //   lista.add(i, i+1);
    // }
    // System.out.println(lista.get(4));

    int[] valores = {9,8,7,6,5};
    int aux;
    int cont =0;
    while (cont<2){
      aux = valores[cont];
      valores[cont] = valores[cont+1];
      valores[cont+1] = aux;
      cont++;
    }
for(int i=0;i<5;i++){
  System.out.println(valores[i]);
}

  }

}