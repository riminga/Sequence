public class Main {

    public static void main(String[] args) {

            SequenceGenerator sequenceGenerator = new SequenceGenerator();
            Sequence sequence = new Sequence();
            sequenceGenerator.generator();
            sequence.removeByIndex(sequenceGenerator.getArr());
            sequence.removeByValue(sequenceGenerator.getArr());
            sequence.convertArrayToList(sequenceGenerator.getArr());
            sequence.getIndexArr(sequenceGenerator.getArr());


    }
}
