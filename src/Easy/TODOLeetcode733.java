package Easy;

public class TODOLeetcode733 {
    int colorToChange=-1;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        colorToChange=image[sr][sc];
        if(colorToChange!=color){
            fillUnvisited(image,sr,sc,color);
        }
        return image;
    }
    public void fillUnvisited(int[][] image, int r, int c, int color){
        if(image[r][c]==colorToChange){
            image[r][c]=color;
            if(r-1>=0){
                fillUnvisited(image,r-1,c,color);
            }
            if(c-1>=0){
                fillUnvisited(image,r,c-1,color);
            }
            if(r+1<image.length){
                fillUnvisited(image,r+1,c,color);
            }
            if(c+1<image[0].length){
                fillUnvisited(image,r,c+1,color);
            }
        }
    }
}
