class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer> huh1 = new Hashtable<>();
        Hashtable<Character,Integer> huh2 = new Hashtable<>();

        if (s.length() != t.length())
        return false;

        for (int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if (huh1.containsKey(c)){
                huh1.put(c,huh1.get(c)+1);
            }
            else
            huh1.put(s.charAt(i),1);
            if (huh2.containsKey(c1)){
                huh2.put(c1,huh2.get(c1)+1);
            }
            else
            huh2.put(t.charAt(i),1);
        }

        return huh1.equals(huh2);
    }
}
