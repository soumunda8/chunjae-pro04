package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.Notice;
import kr.ed.haebeop.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/notice/")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("noticeList")
    public String noticeList() {
        return "/notice/noticeList";
    }

}