package programmers.kakaoLv1.craneGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CraneGameTest {
    
    @Test
     void sol(){
        int actual = CraneGame.solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4});
//0 3 0 5 [00] 0 4
// 0 [11] 3 0 3
        int expected = 4 ; 

        Assertions.assertEquals(expected, actual);
    }
}
