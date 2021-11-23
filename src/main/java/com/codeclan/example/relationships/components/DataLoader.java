package com.codeclan.example.relationships.components;

import com.codeclan.example.relationships.models.File;
import com.codeclan.example.relationships.models.Folder;
import com.codeclan.example.relationships.models.User;
import com.codeclan.example.relationships.repositories.FileRepository;

import com.codeclan.example.relationships.repositories.FolderRepository;
import com.codeclan.example.relationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("Steve");
        userRepository.save(user1);
        Folder folder1 = new Folder("Top Secret", user1);
        folderRepository.save(folder1);
        File file1 = new File("stuff", "gif", 100, folder1);
        fileRepository.save(file1);
//        User tom = new User("Tom");
//        userRepository.save(tom);
//
//        User jerry = new User("Jerry");
//        userRepository.save(jerry);
//
//        User spike = new User("Spike");
//        userRepository.save(spike);
    }


}
