import java.util.Arrays;
import java.util.Scanner;

interface IImage{

        public byte[] getImage(String location);



}

 class RealImageReader implements  IImage{

        @Override
        public byte[] getImage(String location) {
                // TODO Auto-generated method stub
                String length  = "Real Image with same pixel";
                System.out.println(length);
                        return new  byte[length.length()];
        }
}

class ZippedImageRead implements  IImage{//proxy

         RealImageReader imagereader ;

  public  ZippedImageRead(RealImageReader imagereader){
                super();
                this.imagereader = imagereader;
         }
        @Override
        public byte[] getImage(String location) {
                // TODO Auto-generated method stub
    
               String res1 = "";
               byte[] result =imagereader.getImage(location);
                
               for(int i  = 0;i<result.length;i++){
                res1 = res1+result[i];
               }
                byte[] compressed = Arrays.copyOf(result,result.length / 2);
               System.out.println("Image compressed");
               return compressed;

        }


}

class GetImage{Create Java Project

        IImage image;
       
    public  byte[] returnImage(String location,String platform){

        if(platform.equals("android")){
                image = new ZippedImageRead(new RealImageReader());
                return  image.getImage(location);
                
        }
        image = new RealImageReader();
        return image.getImage(location);

    }    
        
}
public class Main{

public static void main(String[] args){

        
       GetImage image = new GetImage();
       byte[] returnImage= image.returnImage("c:https:localhost:1545","android");
       System.out.println(Arrays.toString(returnImage));
}

}