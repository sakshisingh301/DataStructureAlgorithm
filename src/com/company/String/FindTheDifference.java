package com.company.String;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

//    public static char findTheDifference(String s, String t) {
//        char result = 0;
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (!map1.containsKey(s.charAt(i))) {
//                map1.put(s.charAt(i), 1);
//            } else {
//                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
//            }
//        }
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            if (!map2.containsKey(t.charAt(i))) {
//                map2.put(t.charAt(i), 1);
//            } else {
//                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
//            }
//        }
//        for (Map.Entry mapElement1 : map2.entrySet()) {
//            Character key = (Character) mapElement1.getKey();
//            Integer value = (Integer) mapElement1.getValue();
//            boolean keyPresent = map1.containsKey(key);
//
//            if (!keyPresent || value > map1.get(key)) {
//                result = key;
//            }
//        }
//        return result;
//
//    }

    public static char findTheDifferenceSorting(String s, String t) {

        int n = s.length();
        char[] charArray1=s.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2=t.toCharArray();
       Arrays.sort(charArray2);
        String sortedStringS = new String(charArray1);
        String sortedStringT = new String(charArray2);

        for (int i = 0; i < n; i++) {
            if (sortedStringS.charAt(i) != sortedStringT.charAt(i)) {
                return sortedStringT.charAt(i);
            }
        }
        return sortedStringT.charAt(t.length() - 1);
    }

    public static void main(String[] args) {
       // String s = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor";
        //String t = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
        //System.out.println(findTheDifference(s,t));
        String s="ae";
        String t="aea";
         System.out.println(findTheDifferenceSorting(s, t));

    }
}
