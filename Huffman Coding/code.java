package com.abhinaygarg.placement_2022_06_01;

import java.util.Comparator;
import java.util.PriorityQueue;

class Huffman{
    int freq;
    char c;

    Huffman left;
    Huffman right;
}

public class HuffmanCoding {
    public static void main(String[] args) {
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charFreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<Huffman> pq = new PriorityQueue<>(n, new Comparator<Huffman>() {
            @Override
            public int compare(Huffman x, Huffman y) {
                return x.freq - y.freq;
            }
        });

        for(int i = 0; i < n; i++){
            Huffman hn = new Huffman();
            hn.c = charArray[i];
            hn.freq = charFreq[i];

            hn.left = null;
            hn.right = null;

            pq.add(hn);
        }

        Huffman root = null;

        while(pq.size() > 1){
            Huffman x = pq.peek();
            pq.poll();

            Huffman y = pq.peek();
            pq.poll();

            Huffman z = new Huffman();
            z.freq = x.freq + y.freq;
            z.c = '-';

            z.left = x;
            z.right = y;
            root = z;
            pq.add(z);
        }

        printHuffman(root, "");
    }

    static void printHuffman(Huffman root, String s){
        if(root.left == null && root.right == null && Character.isLetter(root.freq)){
            System.out.println(root.c + ": " + s);
            return;
        }

        printHuffman(root.left, s + "0");
        printHuffman(root.right, s + "1");
    }

}
