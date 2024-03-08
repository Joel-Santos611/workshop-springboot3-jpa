package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
public class UserResource {

@RequestMapping("users")
   public ResponseEntity<User> findAll(){
   User u=new User(1l, "Maria", "maria@gmail.com", "999999", "1234");

   return ResponseEntity.ok().body(u);

   }
}
