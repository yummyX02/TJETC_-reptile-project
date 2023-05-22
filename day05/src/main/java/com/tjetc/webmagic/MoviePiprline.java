package com.tjetc.webmagic;

import com.tjetc.webmagic.jdbc.TestJDBC;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.sql.SQLException;

public class MoviePiprline implements Pipeline {
    TestJDBC jdbc = new TestJDBC();
    @Override
    public void process(ResultItems resultItems, Task task) {
        MovieInfo movieinfo = resultItems.get("movieinfo");
        try{
            jdbc.save(movieinfo);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
