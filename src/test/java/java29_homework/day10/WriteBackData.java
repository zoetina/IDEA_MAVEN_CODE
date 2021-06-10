package java29_homework.day10;

/**
 * @Project: java29_code
 * @Author: zoe
 * @Create: 2021-05-20 15:17
 * @Desc： 实体类
 **/
public class WriteBackData {
    private int rowNum;
    private int cellNum;
    private String content;

    public WriteBackData() {
    }

    public WriteBackData(int rowNum, int cellNum, String content) {
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.content = content;
    }

    @Override
    public String toString() {
        return "WriteBackData{" +
                "rowNum=" + rowNum +
                ", cellNum=" + cellNum +
                ", content='" + content + '\'' +
                '}';
    }
}
