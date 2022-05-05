package org.monilab.controller;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.monilab.service.MemberService;


public class MemberController implements GraphQLMutationResolver, GraphQLQueryResolver {
  private final MemberService memberService;

  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  public Boolean saveMember(String email, String name, String password){
    System.out.println(email + " " + name + " " + password);
    return true;
  }
}
