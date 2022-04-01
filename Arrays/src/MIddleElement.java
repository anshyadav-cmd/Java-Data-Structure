public class MIddleElement {
    public static int[] middle(int[] arr) {
        if(arr.length % 2 != 0) {
            return new int[] {arr[(int)Math.ceil(arr.length/2)-1]};
        }
        return new int[] {arr[(arr.length/2)-1], arr[(arr.length/2)]};
    }
}
