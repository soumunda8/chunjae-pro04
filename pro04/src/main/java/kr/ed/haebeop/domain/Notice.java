package kr.ed.haebeop.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {

    private int seq;
    private String title;
    private String content;
    private String regdate;
    private int cnt;

}