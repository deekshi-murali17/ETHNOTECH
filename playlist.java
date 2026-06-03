import java.util.*;
public class playlist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of songs:");
        int n=s.nextInt();
        s.nextLine();
        ArrayList<String> playlist=new ArrayList<>();
        System.out.println("Enter songs name:");
        for(int i=0;i<n;i++){
            playlist.add(s.nextLine());
        }
playlist.remove(0);
System.out.println("The Playlist songs are:");
for(String str:playlist){
    System.out.println(str);
}
    }
}
