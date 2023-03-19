package repository;

import common.Man;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




class RepoTest {

    @Test
    public void getAges(){
    Man man=new Man("a","01:01:2000","m","1111 000000");
    int actual=23;
    int expected = man.getAge();
    Assertions.assertEquals(expected,actual);
    }


}