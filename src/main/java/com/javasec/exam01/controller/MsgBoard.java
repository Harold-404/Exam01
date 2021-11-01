package com.javasec.exam01.controller;

import com.javasec.exam01.service.MsgBoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class MsgBoard {

    public static final Logger logger = LoggerFactory.getLogger(MsgBoard.class);

    @Autowired
    private MsgBoardService msgBoardService;

    /*
     * Create a new post
     */
    @RequestMapping(value = "/msgBoard", method = RequestMethod.POST)
    public String createPost(Model model, @ModelAttribute("postDto") com.javasec.exam01.entity.MsgBoard msgBoard) {
        logger.info("Creating post >> " + msgBoard);
        this.msgBoardService.createPost(msgBoard);
        return "redirect:/msgBoard";
    }

    /*
     * Delete a post
     */
//	@RequestMapping(value = "/posts/delete/{postId}", method = RequestMethod.GET)
//	public String deletePost(@PathVariable("postId") Long postId) {
//		logger.info("Deleting post id:" + postId);
//		this.postService.deletePost(postId);
//		return "redirect:/posts";
//	}

    /*
     * Delete a post
     */
    @RequestMapping(value = "/msgBoard/{postId}", method = RequestMethod.DELETE)
    public String deletePost(@PathVariable("postId") Long postId) {
        logger.info("Deleting post id:" + postId);
        this.msgBoardService.deletePost(postId);
        return "redirect:/msgBoard";
    }

    /*
     * List all posts
     */
    @RequestMapping(value = "/msgBoard", method = RequestMethod.GET)
    public String listAllPosts(Model model) {
        logger.info("Listing all posts...");
        Map<String, Object> attributes = this.msgBoardService.findAllPosts();
        model.addAllAttributes(attributes);
        return "msgBoard";
    }

    /*
     * Display post details
     */
    @RequestMapping(value = "/msgBoard/{postId}", method = RequestMethod.GET)
    public String displayPostDetails(Model model, @PathVariable("postId") Long postId) {
        logger.info("Displaying post details >> postId: " + postId);
        Map<String, Object> attributes = this.msgBoardService.findPost(postId);
        model.addAllAttributes(attributes);
        return "msgDetail";
    }

}