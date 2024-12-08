package LinkedList;

public class Node {
    Customer head = null;
    public void add(int age, String name, int budget){
        Customer c = new Customer(age, name, budget);
        if(head == null){
            head = c;
        }else{
            Customer temp=head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = c;
        }
    }

    public void delete(){
        if(head==null){
            System.out.println("Siyahi bosdur");
        }else{
            Customer temp = head;
            if(temp.next == null){
                System.out.println(head.name + " silindi");
                head = null;
            }else{
                while(temp.next.next != null){
                    temp = temp.next;
                }
                System.out.println(temp.next.name + " silindi");
                temp.next = null;
            }


        }
    }

    public void show(){
        Customer temp = head;
        if(head==null){
            System.out.println("bosdur");
        }
        else{
            while(temp != null){
                System.out.println("Ad: " + temp.name + " Yas: " + temp.age + " Budce: " + temp.budget);
                temp = temp.next;
            }
        }

    }
}
