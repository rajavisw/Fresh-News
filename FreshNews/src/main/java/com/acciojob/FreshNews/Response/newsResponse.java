package com.acciojob.FreshNews.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class newsResponse {
    private int totalResults;
    private String status;
    List<ArticleResponse> articles;
}
