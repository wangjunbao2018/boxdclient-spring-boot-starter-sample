package one.contentbox.boxd.spring.sample;

import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.BoxdClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoxdClientWrapper {


    @Autowired
    private BoxdClient boxdClient;

    public int height () throws BoxdException {
        return boxdClient.getBlockHeight();
    }
}
