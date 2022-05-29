package SHOPPING;

public class Shopping {
    String belt;
    String shoe;
    String dress;

    Shopping(String belt)
    {
        this.belt=belt;
    }
    Shopping(String belt,String shoe)
    {
        this(belt);
        this.shoe=shoe;
    }
    Shopping(String belt,String shoe,String dress)
    {
        this(belt,shoe);
        this.dress=dress;
    }
}
