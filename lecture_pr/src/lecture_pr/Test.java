package lecture_pr;
public class Test {
    public static void main(String[] args) {
        User[] users = new User[15];

        users[0] = new Staff(1, "privet1", "privet28", "Bekbolatuly", "Makhambet", 99999999, new String[]{"Math", "Principle of programming"});
        users[1] = new Staff(2, "privet2", "privet29988", "Nadira", "Zhumadir", 1000000, new String[]{"Chemistry", "Biology"});
        users[2] = new Staff(3, "privet3", "privet2542", "Rektor", "Krasav4ik", 15000000, new String[]{"History", "Art"});
        users[3] = new Staff(4, "privet4", "privet2love", "Madiyar", "Ernazarov", 540000, new String[]{"Music", "Drama"});
        users[4] = new Staff(5, "privet5", "privet2u", "Dilnaz", "ZHumagaziyeva", 10, new String[]{"Be stupid", "Do worst"});

        users[5] = new Student(6, "Nadira", "12345", "Samal", "water", 3.8, new String[]{"Math", "Principle of programming"});
        users[6] = new Student(7, "Arsen", "123456", "Asu", "water1", 3.6, new String[]{"Be stupid", "Do worst"});
        users[7] = new Student(8, "Amina", "1234567", "KOla", "water2", 3.9, new String[]{"Physics", "Chemistry"});
        users[8] = new Student(9, "Ulykbek", "12345678", "pepsi", "water3", 3.5, new String[]{"Art", "Music"});
        users[9] = new Student(10, "jasik", "1223312321", "Mirinda", "water4", 4.0, new String[]{"Math", "Computer Science"});

        for (User user : users) {
            if (user != null) {
                System.out.println(user.getData());
            }
        }
//        System.out.println
    }
}