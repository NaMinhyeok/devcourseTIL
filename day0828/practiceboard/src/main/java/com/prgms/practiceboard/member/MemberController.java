package com.prgms.practiceboard.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/member")
public class MemberController {

    private final MemberService memberService;
}
