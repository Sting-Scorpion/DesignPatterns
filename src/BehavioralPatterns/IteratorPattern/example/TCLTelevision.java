package BehavioralPatterns.IteratorPattern.example;

public class TCLTelevision extends Television{
    private Object[] objs;
    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    @Override
    public void setObjs(Object[] objs) {
        this.objs = objs;
    }

    class TCLIterator implements TVIterator{
        private int currentIndex = 0;

        @Override
        public void setChannel(int i) {
            currentIndex = i;
            System.out.println("-- [Set to channel " + currentIndex + "] --");
            if(currentIndex >= objs.length){
                System.out.println("-- [Out of range] --");
                last();
            }
        }

        @Override
        public void first() {
            currentIndex = 0;
            System.out.println("-- [Set to channel " + currentIndex + "] --");
        }

        @Override
        public void next() {
            if(isLast()){
                first();
            }
            else{
                currentIndex++;
                System.out.println("-- [Set to channel " + currentIndex + "] --");
            }
        }

        @Override
        public void previous() {
            if(isFirst()){
                last();
            }
            else{
                currentIndex--;
                System.out.println("-- [Set to channel " + currentIndex + "] --");
            }
        }

        @Override
        public void last() {
            currentIndex = objs.length - 1;
            System.out.println("-- [Set to channel " + currentIndex + "] --");
        }

        @Override
        public boolean isLast() {
            return currentIndex == objs.length - 1;
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }

        @Override
        public Object currentChannel() {
            return objs[currentIndex];
        }

        @Override
        public void showList() {
            for(int i = 0; i < objs.length; i++){
                System.out.println(i + ":\t" + objs[i]);
            }
            System.out.println();
        }
    }
}
