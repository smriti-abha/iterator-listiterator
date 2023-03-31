import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(78);
        list.add(65);
        list.add(017);
        list.add(526);
        list.add(727);
        list.add(171);

/*      //ListIterator move in both direction


//        ListIterator<Integer> itr= list.listIterator();
//        //for next element
//        while(itr.hasNext()){
//            if(itr.next()==23){
//                itr.remove();
//            }
//            System.out.println(itr.next());
//        }
//        //for previous element
//        while(itr.hasPrevious()){
//            System.out.println(itr.previous());
        }    */



        /*     Use of Iterator   */
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //iterate using stream APIS
        list.stream().forEach(System.out::println);



        /*Synchronization of List
        * By using Collections.SynchronizedList()
        * By using CopyOnWriteArrayList */







    }
}