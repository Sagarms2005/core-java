package feb4;

public class Spotify {
    public static void main(String[] args) {
        String [] songs={"mungaru","tokyo drift","avenger","barisu kannada"};
        System.out.println("aviable songs in playlist    "+songs.length);
        String s1=songs[0];
        System.out.println(s1+" "+songs[3]);

        for(String song:songs){
            System.out.println(song);
        }

    }
}
