public class Direction {
    public enum direction{
        North("North"),
        Go_South("0"),
        South("South"),
        Go_North("2"),
        West("West"),
        Go_East("4"),
        East("East"),
        Go_West("6");

        public final String label;
        private direction (String label)
        {
            this.label=label;
        }
        public static direction position(String label){
            for(direction dir : values()){
                if(dir.label.equals(label)){
                    return dir;
                }
            }
            return null;
        }
        public static direction toGo(String Label){
            for(direction dir : values()){
                if(dir.label.equals(Label)){
                    return dir;
                }
            }
            return null;
        }
    }
}