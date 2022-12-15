package kurrant.task.service;

import kurrant.task.dao.ArticleMapper;
import kurrant.task.dto.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleMapper articleMapper;

    @Override
    public List<Article> getArticleList() {
        return articleMapper.getArticleList();
    }
}
