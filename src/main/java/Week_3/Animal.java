package Week_3;

public class Animal {
    public void voice(String say){
        System.out.println(say);
    }

    //-------- узнаем сколько  создано собак --------//
    private static int count = 0;
    Animal (){
        count++;
    }
    public void setCount(){
        System.out.println("Было создано " + count + " животных");
    }
}
