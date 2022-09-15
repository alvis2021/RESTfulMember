package Alvis.RESTful.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class apiMemberController {

    private Logger logger = LoggerFactory.getLogger(apiMemberController.class);

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping(value = "/")
    public List<Member> getAllMember() {
        logger.info("Getting all member.");
        return memberRepository.findAll();
    }

    @GetMapping(value = "/{memberId}")
    public Member getMovieById(@PathVariable String memberId) {
        logger.info("Getting member with ID: {}", memberId);
        return memberRepository.findMemberById(memberId);
    }
    @PostMapping(value = "/create")
    public Member addMovie(@RequestBody Member member) {
        logger.info("Saving member.");
        return memberRepository.save(member);
    }
    @PutMapping(value = "/update/{memberId}")
    public Member updateMovie(@PathVariable String memberId, @RequestBody Member member) {
        logger.info("Updating member with ID: {}", memberId);
        return memberRepository.save(member);
    }
    @DeleteMapping(value = "/delete/{memberId}")
    public void deleteMovie(@PathVariable String memberId) {
        logger.info("Deleting member with ID: {}", memberId);
        memberRepository.deleteById(memberId);
    }

}
