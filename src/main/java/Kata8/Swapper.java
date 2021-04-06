package Kata8;

import java.util.Arrays;

class Swapper{

    public Object[] arguments;

    public Swapper(Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        arguments[0] = args[1];
        arguments[1] = temp;
    }

    public static void main(String[] args) {
        Integer[] argss = new Integer[]{1,2};
        Swapper r= new Swapper(argss);
        r.swapValues();
        System.out.println(Arrays.toString(argss));
    }
}
