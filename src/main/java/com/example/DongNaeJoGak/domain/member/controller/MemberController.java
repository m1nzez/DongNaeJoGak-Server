package com.example.DongNaeJoGak.domain.member.controller;

import com.example.DongNaeJoGak.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
}
