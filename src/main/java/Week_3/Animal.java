package Week_3;

abstract class Animal {
    abstract void voice();


    //-------- узнаем сколько  создано животных --------//
    private static int count = 0;
    Animal (){
        count++;
    }
    public void countObj(){
        System.out.println("Было создано " + count + " животных");
    }
}
