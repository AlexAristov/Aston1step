import customCollections.CustomArrayList;
import customSort.BubbleSort;
import customSort.comparators.UserAgeComparator;
import models.User;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<User> users = new CustomArrayList<>(5);

        User user1 = new User("Alex", 27);
        User user2 = new User("Alex", 17);
        User user3 = new User("Alex", 15);
        User user4 = new User("Alex", 24);
        User user5 = new User("Alex", 18);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        System.out.println(users);

        BubbleSort.sort(users, new UserAgeComparator());

        System.out.println(users);
    }
}
