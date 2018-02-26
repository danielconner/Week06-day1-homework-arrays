import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {


        private ArrayList<String> result;

        public MagicEightBall() {
            this.result = new ArrayList<>();
        }

        public int getCount () {
            return this.result.size();
        }

        public int addResult (String result){
            this.result.add("Yes");
            return this.result.size();

        }

        public String getResultAtIndex(int index){
            return this.result.get(index);
        }

        public int removeResult(int index){
            this.result.remove(index);
            return this.result.size();
        }

        public int getShuffledResult(){
            Collections.shuffle(this.result);
            return this.result.size();
        }

}
