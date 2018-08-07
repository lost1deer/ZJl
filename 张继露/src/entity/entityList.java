package entity;

public class entityList {
    private int pageCurrent;//pageNos
    private int pageNum;//pageCount
    private int rowsNum;//rowsCount
    private int pageSize;//每页行数

    public entityList(int pageCurrent,int pageNum,int pageSize){
        this.pageCurrent=pageCurrent;
        this.pageNum=pageNum;
        this.pageSize=pageSize;
        rowsNum=pageSize*pageNum;
    }
    public entityList(int pageSize,int rows){
        this.pageSize=pageSize;
        pageNum = rows/pageSize + ((rows%pageSize)>0?1:0);
        rowsNum=rows;
    }
    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getRowsNum() {
        return rowsNum;
    }

    public void setRowsNum(int rowsNum) {
        this.rowsNum = rowsNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
