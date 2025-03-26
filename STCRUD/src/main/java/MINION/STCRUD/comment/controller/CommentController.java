package MINION.STCRUD.comment.controller;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/api")
public class CommentController {

    @GetMapping
    public String returnSomeData(@RequestBody String data) {

        return data;
    }
}
