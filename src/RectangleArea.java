/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-05
 */
public class RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        int area1 = (C-A)*(D-B);

        int area2 = (G-E)*(H-F);

        if( C<=E || A>=G  || B >= H || D<= F){
            return area1+area2;
        }

        int area3 = (Math.min(C,G) - Math.max(A,E))*(Math.min(D,H) - Math.max(B,F));

        return area1+area2-area3;

    }



}
