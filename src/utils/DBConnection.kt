package utils

import java.sql.Connection
import java.sql.DriverManager

class DBConnection {

    fun createConnection(): Connection? {
        var con: Connection? = null
        try {
            try {
                Class.forName(Constant.dbDriver)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
            con = DriverManager.getConnection(Constant.dbName, Constant.userName, Constant.password)
            println("Printing connection object " + con!!)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return con
    }
}



/*  Using Jsp
CREATE TABLE IF NOT EXISTS register (
id serial NOT NULL ,
name varchar(100) NOT NULL,
password varchar(100) NOT NULL,
email varchar(100) NOT NULL,
sex varchar(100) NOT NULL,
country varchar(100) NOT NULL,
PRIMARY KEY (id)
)

select * from  register*/


/*

   create database sawan_shop

   create table register_user(
	                       id  SERIAL  primary key not null,
						   user_id varchar(10) unique ,
                           fname varchar(20),
							lname varchar(20),
							email varchar(70) unique,
							mobile varchar(15) unique,
	                        age int,
	                        sex char,
	                        password varchar(30),city varchar (20),
	                      address varchar(200))


    */


/*
      MySQL

    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/customers";
    String username = "root"; //MySQL username
    String password = "root123"; //MySQL password
        try {
                try {
                Class.forName("com.mysql.jdbc.Driver"); //loading MySQL drivers. This differs for database servers
                } catch (ClassNotFoundException e) {
                e.printStackTrace();
                }
                con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
                System.out.println("Printing connection object " + con);
                } catch (Exception e) {
                e.printStackTrace();
                }*/
