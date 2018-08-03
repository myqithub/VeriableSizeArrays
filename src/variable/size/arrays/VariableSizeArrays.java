/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable.size.arrays;

/**
 * @author: Veysel Dogan 
 * Date: 03-Aug-2018
 * Console Application: VariableSizeArrays Main Class
 */
public class VariableSizeArrays {

    public static void main(String[] args) {
        int numbers2D[][] = new int[5][];//the first dimension must be specified when writing variable-sized arrays
        numbers2D[0] = new int [1];//place we set the second dimension always starts from 0 indices 
        numbers2D[1] = new int [5];
        numbers2D[2] = new int [7];
        numbers2D[3] = new int [4];//as much as you want 
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i+1; j++) { //length of j always i+1
                numbers2D[i][j] = i + j *4; //each i and j numbers were summed then multiplied by four and two-dimensional lined up

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(numbers2D[i][j] + " ");//matrix written but second size increasingly going
            }
            System.out.println();//go to bottom line if loop ends
        }
    }
        /*finaly we did matrix but example 1
                                           4 5
                                           7 9 12
    so second size uncertain
*/
}
