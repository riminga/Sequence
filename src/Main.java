public class Main {

    public static void main(String[] args) {

            SequenceObserver loger = SequenceObserver.getInstance();
            SequenceGenerator sequenceGenerator = new SequenceGenerator(loger);
            Sequence sequence = new Sequence(loger);
            sequenceGenerator.generator();
            sequence.removeByIndex(sequenceGenerator.getArr());
            sequence.removeByValue(sequenceGenerator.getArr());
            sequence.convertArrayToList(sequenceGenerator.getArr());
            sequence.getIndexArr(sequenceGenerator.getArr());


    }
}
