package taskthree;

import java.util.ArrayList;

/**
 * Given a list of pairs of numbers e.g. [(1,4), (2,5), (7, 3),(4,6),(7,7)]
 * find the longest sub-list that has the pairs sorted by the first entry in ascending
 * order by the second in descending order, [(2,5), (7, 3)].
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ArrayList<PairsNumb> pair_array = new ArrayList<PairsNumb>();

        pair_array.add(new PairsNumb(1,4));
        pair_array.add(new PairsNumb(2,5));
        pair_array.add(new PairsNumb(7,3));
        pair_array.add(new PairsNumb(4,6));
        pair_array.add(new PairsNumb(7,7));

        int longest_size = 0;
        int sublist_position = 0;
        int count_size = 0;

        for (int i = 0; i < pair_array.size()-1; i++){

            if (pair_array.get(i).getNum_one() < pair_array.get(i+1).getNum_one() &&
                    pair_array.get(i).getNum_two() > pair_array.get(i+1).getNum_two())
            {
                count_size++;
                if (count_size > longest_size) {
                    longest_size = count_size;
                    sublist_position = i - count_size;
                }


            } else count_size = 0;


        }
        sublist_position++;
        longest_size++;


        for (int i = sublist_position; i < sublist_position + longest_size; i++)
        {
            System.out.println(pair_array.get(i).getNum_one()+ " "+pair_array.get(i).getNum_two());

        }
    }


}

class PairsNumb{

    PairsNumb(int num_one, int nub_two){
        this.num_one = num_one;
        this.num_two = nub_two;

    }

    public int getNum_one() {
        return num_one;
    }


    public int getNum_two() {
        return num_two;
    }

    private int num_one;
    private int num_two;


}
