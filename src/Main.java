public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();

        // Create a new user
        User user1 = new User(0, "John Doe", "john@example.com", 30);
        userDAO.addUser(user1);

        // Get a user by ID
        User user = userDAO.getUserById(1);
        System.out.println("User fetched: " + user.getName());

        // Update user
        user.setName("John Updated");
        userDAO.updateUser(user);

        // Get all users
        userDAO.getAllUsers().forEach(u -> System.out.println(u.getName()));

        // Delete user
        userDAO.deleteUser(1);
    }
}
