package org.monilab.beans;

import org.monilab.controller.MemberController;
import org.monilab.repository.MemberRepository;
import org.monilab.service.MemberService;

public class BeanInjection {
  private static final ThreadLocal<MemberController> memberControllerThread = new ThreadLocal<>();
  private static final ThreadLocal<MemberService> memberServiceThread = new ThreadLocal<>();
  private static final ThreadLocal<MemberRepository> memberRepositoryThread = new ThreadLocal<>();

  public static MemberController getSingleController(){
    MemberController memberController = memberControllerThread.get();
    if(memberController == null){
      memberControllerThread.set(new MemberController(getSingleService()));
    }
    return memberControllerThread.get();
  }

  public static MemberService getSingleService(){
    MemberService memberService = memberServiceThread.get();
    if(memberService == null){
      memberServiceThread.set(new MemberService(getSingleRepository()));
    }
    return memberServiceThread.get();
  }

  public static MemberRepository getSingleRepository(){
    MemberRepository memberRepository = memberRepositoryThread.get();
    if(memberRepository == null){
      memberRepositoryThread.set(new MemberRepository());
    }
    return memberRepositoryThread.get();
  }
}
