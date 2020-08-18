package com.bessaleks.chatapp.repository;

import com.bessaleks.chatapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User,Long> {

}
