// The original web link: http://www.cnblogs.com/alephsoul-alephsoul/archive/2012/10/27/2742053.html
// with some minor change by Tom Xue to make it work
package test;

import java.text.NumberFormat;
import java.util.ArrayList;

// ͼ��ӿ�
interface IBook{
    public String getName();
    public int getPrice();
    public String getAuthor();
}

// С˵����
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
    	 booklist.add(new NovelBook("�����", 3200, "Ī��"));
    	 booklist.add(new NovelBook("������", 3100, "Ī��"));
    	 booklist.add(new NovelBook("��ը", 3000, "Ī��"));
    	 booklist.add(new NovelBook("ʮ����", 2900, "Ī��"));
     }
 
     public static void main(String[] args){
         NumberFormat formatter = NumberFormat.getCurrencyInstance();
         formatter.setMaximumFractionDigits(2);
         System.out.println("�����¼����");
         for(IBook book:booklist){
              System.out.println("�鼮���ƣ�"+book.getName()+"\t�鼮���ߣ�"+book.getAuthor()+"\t�۸�"+book.getPrice());
        }
     }
 
 }
