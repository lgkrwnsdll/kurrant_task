package kurrant.task.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Timestamp;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private BigInteger articleId;
    private Integer boardId;
    private Timestamp createdDatetime;
    private Boolean isPinned;
    private Integer viewCount;
    private String title;
    private String contentHtml;
    private String contentString;
}
