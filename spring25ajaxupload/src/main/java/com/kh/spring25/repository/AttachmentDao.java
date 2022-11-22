package com.kh.spring25.repository;

import com.kh.spring25.entity.AttachmentDto;

public interface AttachmentDao {
	int sequence();
	void save(AttachmentDto attachmentDto);
	AttachmentDto find(int attachmentNo);
}