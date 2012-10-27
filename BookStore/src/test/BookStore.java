// The original web link: http://www.cnblogs.com/alephsoul-alephsoul/archive/2012/10/27/2742053.html
// with some minor change by Tom Xue to make it work
package test;

import java.text.NumberFormat;
import java.util.ArrayList;

// 图书接口
interface IBook{
    public String getName();
    public int getPrice();
    public String getAuthor();
}

// 小说书类
class NovelBook implements IBook{
     private String name;
     private int price;
     private String author;
     public NovelBook(String _name, int _price, String _author){
         this.name = _name;
         this.price = _price;
         this.author = _author;
     }
     public String getAuthor(){
         return this.author;
     }
     public String getName(){
         return this.name;
     }
     public int getPrice(){
         return this.price;
     }
 }
 
public class BookStore{
     private final static ArrayList<IBook> booklist= new ArrayList<IBook>();
     static{
    	 booklist.add(new NovelBook("红高粱", 3200, "莫言"));
    	 booklist.add(new NovelBook("红树林", 3100, "莫言"));
    	 booklist.add(new NovelBook("爆炸", 3000, "莫言"));
    	 booklist.add(new NovelBook("十三步", 2900, "莫言"));
     }
 
     public static void main(String[] args){
         NumberFormat formatter = NumberFormat.getCurrencyInstance();
         formatter.setMaximumFractionDigits(2);
         System.out.println("买书记录如下");
         for(IBook book:booklist){
              System.out.println("书籍名称："+book.getName()+"\t书籍作者："+book.getAuthor()+"\t价格："+book.getPrice());
        }
     }
 
 }
