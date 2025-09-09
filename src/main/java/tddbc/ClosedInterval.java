package tddbc;

public class ClosedInterval {

    public int minNum;
    public  int maxNum;

    public ClosedInterval(int minNum,int maxNum) throws Exception {
        if (minNum > maxNum) {
           throw new Exception("上端は下端より大きい必要があります");
        }
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public  boolean isContainedNum(int num){
        return num >= this.minNum && num <= this.maxNum;
    }

    public  String returnFormattedString(){
        return String.format("[%d,%d]", this.minNum, this.maxNum);
    }
}

