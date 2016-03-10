package Practice6.prob7;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("blue", 85);
        map.put("red", 96);
        map.put("black", 92);

        String name = null;   // 최고 점수를 받은 아이디 저장
        int maxScore = 0;  // 최고 점수
        int totalScore = 0;   // 점수 합계

        /* 코드를 작성하세요 */
        Iterator it = map.keySet().iterator();

        while (true) {
            if (it.hasNext() == false) {
                break;
            }
            String key = (String)it.next();
            Integer value = map.get(key);

            if (value > maxScore) {
                maxScore = value;
                name = key;
            }
            totalScore += value;
        }

        System.out.println("평균 점수: " + totalScore / map.size());
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
