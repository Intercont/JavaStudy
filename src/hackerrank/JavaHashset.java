package hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //se pode criar um objeto Pair e comparar com ele
//        HashSet set = new HashSet();
//        for (int i = 0; i < t; i++) {
//            set.add(new Pair<>(pair_left[i], pair_right[i]));
//            System.out.println(set.size());
//        }

        //outra forma mais simples sem objeto é concatenando as strings
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i].concat("$").concat(pair_right[i]));//é necessário algo para separar os pares para diferenciar
            System.out.println(set.size());
        }
    }
    static class Pair<L,R> {

        private final L left;
        private final R right;

        public Pair(L left, R right) {
            assert left != null;
            assert right != null;

            this.left = left;
            this.right = right;
        }

        public L getLeft() { return left; }
        public R getRight() { return right; }

        @Override
        public int hashCode() { return left.hashCode() ^ right.hashCode(); }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Pair)) return false;
            Pair pairo = (Pair) o;
            return this.left.equals(pairo.getLeft()) &&
                    this.right.equals(pairo.getRight());
        }

    }
}


