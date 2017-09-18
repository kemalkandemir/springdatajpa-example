package com.kemalkandemir.springdatajpaexample;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;


@Transactional
public interface UserDao extends CrudRepository<User, Long> {


    public User findByEmail(String email);

}