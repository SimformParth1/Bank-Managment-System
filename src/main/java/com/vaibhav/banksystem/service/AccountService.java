package com.vaibhav.banksystem.service;

import com.vaibhav.banksystem.dto.AccountRequestDto;
import com.vaibhav.banksystem.dto.AccountResponseDto;
import com.vaibhav.banksystem.dto.AccountDto;

import java.util.List;

public interface AccountService {

  AccountResponseDto createAccount(AccountRequestDto accountRequestDto);

  List<AccountDto> getAllAccount();

  AccountDto getAccountByUserId(Long id);
}
