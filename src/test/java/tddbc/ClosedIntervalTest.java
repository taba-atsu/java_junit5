package tddbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClosedIntervalTest {
    @Nested
    class _上端下端点を設定することができる {
        @Test
        @DisplayName("有効な値であるため設定できる")
        void _setValidNumber ()throws Exception {
            int minNum = 10;
            int maxNum = 100;
            ClosedInterval interval = new ClosedInterval(minNum, maxNum);
            assertEquals(minNum, interval.minNum);
            assertEquals(maxNum, interval.maxNum);
        }
    }

    @Nested
    class _指定された整数が含まれるか判定する{
        @Test
        @DisplayName("有効な値だとtrueを返す")
        void _validValue()throws  Exception  {
            int minNum = 3;
            int maxNum = 7;
            ClosedInterval interval = new ClosedInterval(minNum,maxNum);
            assertTrue(interval.isContainedNum(5));
        }

        @Test
        @DisplayName("無効な値だとfalseを返す")
        void _invalidValue()throws  Exception  {
            int minNum = 3;
            int maxNum = 7;
            ClosedInterval interval = new ClosedInterval(minNum,maxNum);
            assertFalse(interval.isContainedNum(0));
            assertFalse(interval.isContainedNum(10));
        }

        @Test
        @DisplayName("境界値を正しく判定する")
        void _boundaryValue()throws  Exception  {
            int minNum = 3;
            int maxNum = 7;
            ClosedInterval interval = new ClosedInterval(minNum,maxNum);
            assertFalse(interval.isContainedNum(2));
            assertFalse(interval.isContainedNum(8));
            assertTrue(interval.isContainedNum(3));
            assertTrue(interval.isContainedNum(7));
        }
    }

    @Nested
    class _整数閉区間を文字列表記で返す{

        @Test
        @DisplayName("正しい区間を正しい形式の文字列で返すことができる")
        void _returnCorrectString() throws  Exception{
            int minNum = 3;
            int maxNum = 7;
            ClosedInterval interval = new ClosedInterval(minNum,maxNum);
            assertEquals("[3,7]",interval.returnFormattedString());
        }
    }
}
