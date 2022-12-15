package kurrant.task.controller;

import kurrant.task.dto.Article;
import kurrant.task.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/api/article")
    public List<Article> getArticles() {
        return articleService.getArticleList();
    }
}
