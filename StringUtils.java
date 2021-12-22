public class StringUtilsTest {

    public static void main(String[] args){
        Integer[] ints = new Integer[]{1, 2, 3};
        List<Integer> intList = Arrays.asList(ints);
        ints[0]=100;
        for (Integer integer : intList) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ints));
    }





}