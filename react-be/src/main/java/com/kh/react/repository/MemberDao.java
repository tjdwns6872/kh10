package com.kh.react.repository;

import com.kh.react.entity.MemberDto;

public interface MemberDao {
	MemberDto login(MemberDto memberDto);
}
