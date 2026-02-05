package feb3.task;

public class Netflix {
    public static void main(String[] args) {
        String[] english = {"The Gray Man", "Red Notice", "Glass Onion", "Extraction", "The Irishman", "Bird Box", "Army of the Dead", "Project Power", "The Old Guard", "Enola Holmes", "6 Underground", "Spenser Confidential", "The Adam Project", "Purple Hearts", "Hustle", "Luther", "Leave the World Behind", "Lift", "Heart of Stone", "Society of the Snow"};
        String[] hindi = {"Darlings", "Monica O My Darling", "Qala", "Chor Nikal Ke Bhaga", "Khufiya", "Jaane Jaan", "The Archies", "Kho Gaye Hum Kahan", "Merry Christmas", "Bhakshak", "Dunki", "Animal", "Ludo", "Raat Akeli Hai", "Bulbbul", "Guilty", "Class of 83", "Pagglait", "Meenakshi Sundareshwar", "Thar"};
        String[] spanish = {"Society of the Snow", "Nowhere", "The Platform", "Bird Box Barcelona", "Elite", "Money Heist", "Through My Window", "God's Crooked Lines", "The Mess You Leave Behind", "Below Zero", "The Paramedic", "A Classic Horror Story", "The Wasteland", "Xtreme", "Centauro", "Togo", "Mirage", "Live is Life", "7 Years", "Orbiter 9"};
        String[] korean = {"Squid Game", "All of Us Are Dead", "Hellbound", "The Glory", "Kingdom", "Sweet Home", "Extracurricular", "My Name", "Juvenile Justice", "Signal", "Stranger", "Vincenzo", "Crash Landing on You", "Business Proposal", "The Silent Sea", "Black Knight", "Daily Dose of Sunshine", "Gyeongseong Creature", "A Killer Paradox", "Parasyte: The Grey"};
        String[] japanese = {"Alice in Borderland", "First Love", "The Days", "Sanctuary", "Burn the House Down", "YuYu Hakusho", "Zom 100", "Rurouni Kenshin", "High and Low", "The Journalist", "Midnight Diner", "The Naked Director", "Giri/Haji", "Followers", "Fishbowl Wives", "He's Expecting", "Let's Get Divorced", "Re:Mind", "Switched", "Million Yen Women"};

        for (String e : english) {
            System.out.println(e);
        }
        for (String h : hindi) {
            System.out.println(h);
        }
        for (String s : spanish) {
            System.out.println(s);
        }
        for (String k : korean) {
            System.out.println(k);
        }
        for (String j : japanese) {
            System.out.println(j);
        }
    }
}