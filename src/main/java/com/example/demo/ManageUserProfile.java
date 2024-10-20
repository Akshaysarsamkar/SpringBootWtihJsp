package com.example.demo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entities.User1;
import com.example.demo.repositary.UserRepositary;

public class ManageUserProfile {

	public static void main(String[] args) {

		ApplicationContext run = SpringApplication.run(SpringBootwithJpaApplication.class, args);

		UserRepositary userRepositary = run.getBean(UserRepositary.class);

		Scanner scanner = new Scanner(System.in);

		String name, email;

		boolean check = true;

		while (check) {

			System.out.println("Choice Which Operation You Want To Perform");
			System.out.println("1] Insert Single Data");
			System.out.println("2] Insert Multiple Data");
			System.out.println("3] Update Data");
			System.out.println("4] Delete Data");
			System.out.println("5] Get Single Data");
			System.out.println("6] Get Multiple Data");

			int choice = scanner.nextInt();
			try {

				switch (choice) {
				case 1:
					User1 user1 = new User1();
					System.out.println("Enter the User Name:");
					name = scanner.next();
					System.out.println("Enter the Email");
					email = scanner.next();

					user1.setEmail(email);
					user1.setUserName(name);
					user1.setRegistrationDate(LocalDate.now());

					userRepositary.save(user1);
					break;

				case 2:

					System.out.println("Enter the Total User You want to Enter");
					int totalUSer = scanner.nextInt();

					List<User1> list = new ArrayList<>();

					for (int i = 0; i < totalUSer; i++) {
						User1 user2 = new User1();
						System.out.println("Enter the User Name:");
						name = scanner.next();
						System.out.println("Enter the Email");
						email = scanner.next();

						user2.setEmail(email);
						user2.setUserName(name);
						user2.setRegistrationDate(LocalDate.now());

						list.add(user2);
					}
					userRepositary.saveAll(list);
					break;
				case 3:
					break;
				case 4:
					System.out.println("Enter the Id:");
					int id = scanner.nextInt();
					userRepositary.deleteById(id);
					System.out.println("Data deleted sucessfully");
					break;

				case 5:
					System.out.println("Enter the Id:");
					int id1 = scanner.nextInt();
					Optional<User1> data = userRepositary.findById(id1);
					User1 ud = data.get();
					System.out.println("User Name " + ud.getUserName());
					System.out.println("user Email " + ud.getEmail());
					System.out.println("Registration date " + ud.getRegistrationDate());
					break;

				case 6:
					Iterable<User1> list1 = userRepositary.findAll();

					list1.forEach(emp -> {
						System.out.println("============================================");
						System.out.println(emp.getUserName());
						System.out.println(emp.getRegistrationDate());
						System.out.println(emp.getEmail());
						System.out.println("============================================");
						System.out.println();
					});

					break;

				default:
					check = false;

				}

			} catch (Exception e) {
				System.out.println("data not Found.............................");
			}

		}
		List<User1> list = userRepositary.getAllEmail("v@gmail.com");
		list.forEach(e->{
			System.out.println(e);
		});
     
	}

}
