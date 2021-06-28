package Ciphers.CaesarP;

import java.util.HashMap;
import Ciphers.Cipher;

// spaces, special characters, digits, case insensitivity

public class CaesarCipher implements Cipher {
    private MyHashMap<Character, Character> map = new MyHashMap<>();

    private String alphabets = "abcdefghijklmnopqrstuvwxyz";
    private char ch[] = alphabets.toLowerCase().toCharArray();
    private int key, N;

    public CaesarCipher(int k) {
        this.key = k;
        N = alphabets.length();
        
        createMap();
        // printMap();
    }

    private void createMap() {
        for(int i = 0; i < N; i++) {
            if(Character.isAlphabetic(ch[i])) {
                map.put(ch[i], ch[(i + key) % N]);
            }           
        }
        for(int i = 0; i < N; i++) {
            if(Character.isAlphabetic(Character.toUpperCase(ch[i]))) {
                map.put(Character.toUpperCase(ch[i]), Character.toUpperCase(ch[(i + key) % N]));
            }           
        }
    }

    void printMap() {
        // System.out.println(map);
        for (Character name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " : " + value);
        }
    }
    
    public String encrypt(String str, String shift) {
        char newStr[] = new char[str.length()];
        
        // System.out.println(map.get('a'));
        
        for(int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                newStr[i] = (char) map.get(str.charAt(i));
            } else if (str.charAt(i) == ' ') {
                newStr[i] = ' ';
            } else {
                newStr[i] = str.charAt(i);
            }
        }
        
        return new String(newStr);
    }
    
    public String decrypt(String str, String key) {
        char newStr[] = new char[str.length()];
        
        // System.out.println(map.getKey(str.charAt(0)));

        for(int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                newStr[i] = (char) map.getKey(str.charAt(i));
            } else if (str.charAt(i) == ' ') {
                newStr[i] = ' ';
            } else {
                newStr[i] = str.charAt(i);
            }
        }

        return new String(newStr);
    }
}

class MyHashMap<K, V> extends HashMap<K, V>
{
    HashMap<V, K> reverseMap = new HashMap<>();
 
    @Override
    public V put(K key, V value)
    {
        reverseMap.put(value, key);
        return super.put(key, value);
    }
 
    public K getKey(V value) {
        return reverseMap.get(value);
    }
 
}