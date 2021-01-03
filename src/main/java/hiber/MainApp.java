package hiber;


import hiber.config.AppConfig;
import hiber.model.Cars;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Cars("LADA", 2100)));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru", new Cars("BMW", 500)));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru", new Cars("MAN", 23100)));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru", new Cars("MAZ", 8100)));
      userService.add(new User("User5", "Lastname5", "user5@mail.ru", new Cars("GAZ", 6100)));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("car_id = "+user.getCar());
         System.out.println();
      }
      System.out.println("---------------------------------");
      List<User> getUser = userService.getUser("LADA", 2100);
      for (User getUsers : getUser) {
         System.out.println(getUsers.getFirstName() + " имеет машину - " + getUsers.getCar());
      }

      context.close();
   }
}
