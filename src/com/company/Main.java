package com.company;

import com.company.Repository.UserRepository;
import com.company.Repository.interfaces.IUserRepository;
import com.company.controller.Controller;
import com.company.data.IPostgresDB;
import com.company.data.PostgresDB;

public class Main {

    public static void main(String[] args) {
        IPostgresDB db = new PostgresDB();
        IUserRepository repo = new UserRepository(db);
        Controller controller = new Controller(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}
