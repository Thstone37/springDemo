package me.thstone.model;

/**
 * Created by zhangshulei on 2017/8/22.
 */
public class BookModel {
    private long bookId; //图书Id
    private String name; //图书名称
    private int number;//馆藏数量
    public BookModel(){

    }
    public BookModel(long bookId,String name,int number){
        this.bookId=bookId;
        this.name=name;
        this.number=number;
    }
    public long getBookId(){
        return bookId;
    }
    public void setBookId(long bookId){
        this.bookId=bookId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
}
