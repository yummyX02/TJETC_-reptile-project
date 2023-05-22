package com.tjetc.webmagic;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.sql.SQLException;

public class NovelPipline implements Pipeline {
    TestJDBC jdbc = new TestJDBC();
    @Override
    public void process(ResultItems resultItems, Task task) {
        NovelInfo novelInfo = resultItems.get("novelInfo");
            try {
                jdbc.save(novelInfo);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }
}
